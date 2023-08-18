package HackerRank.Challenges;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;
class Result {

        public static List<Integer> subsetA(List<Integer> arr) {
            arr.sort(Collections.reverseOrder()); // Ordena o array em ordem decrescente
            int n = arr.size();
            int sumA = 0;
            int sumB = arr.stream().mapToInt(Integer::intValue).sum();

            List<Integer> subsetA = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                subsetA.add(arr.get(i));
                sumA += arr.get(i);
                sumB -= arr.get(i);

                if (sumA > sumB) {
                    return subsetA;
                }
            }

            return new ArrayList<>(); // Retorna uma lista vazia se não encontrar subconjunto válido
        }
    }

    public class ArraySubsets {
        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

            int arrCount = Integer.parseInt(bufferedReader.readLine().trim());

            List<Integer> arr = IntStream.range(0, arrCount).mapToObj(i -> {
                        try {
                            return bufferedReader.readLine().replaceAll("\\s+$", "");
                        } catch (IOException ex) {
                            throw new RuntimeException(ex);
                        }
                    })
                    .map(String::trim)
                    .map(Integer::parseInt)
                    .collect(toList());

            List<Integer> result = Result.subsetA(arr);

            bufferedWriter.write(
                    result.stream()
                            .map(Object::toString)
                            .collect(joining("\n"))
                            + "\n"
            );

            bufferedReader.close();
            bufferedWriter.close();
        }
}