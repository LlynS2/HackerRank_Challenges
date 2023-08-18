package HackerRank.Challenges;

import java.io.*;
import java.util.stream.IntStream;
class SinglyLinkedListNode {
        public int data;
        public SinglyLinkedListNode next;

        public SinglyLinkedListNode(int nodeData) {
            this.data = nodeData;
            this.next = null;
        }
    }

    class SinglyLinkedList {
        public SinglyLinkedListNode head;
        public SinglyLinkedListNode tail;

        public SinglyLinkedList() {
            this.head = null;
            this.tail = null;
        }

        public void insertNode(int nodeData) {
            SinglyLinkedListNode node = new SinglyLinkedListNode(nodeData);

            if (this.head == null) {
                this.head = node;
            } else {
                this.tail.next = node;
            }

            this.tail = node;
        }
    }

    class SinglyLinkedListPrintHelper {
        public static void printList(SinglyLinkedListNode node, String sep, BufferedWriter bufferedWriter) throws IOException {
            while (node != null) {
                bufferedWriter.write(String.valueOf(node.data));

                node = node.next;

                if (node != null) {
                    bufferedWriter.write(sep);
                }
            }
        }
    }

    class ResultAwnser {
        public static long getNumber(SinglyLinkedListNode binary) {
            long decimal = 0;

            while (binary != null) {
                decimal = (decimal << 1) | binary.data;
                binary = binary.next;
            }

            return decimal;
        }
    }

    public class BinaryNumber {
        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

            SinglyLinkedList binary = new SinglyLinkedList();

            int binaryCount = Integer.parseInt(bufferedReader.readLine().trim());

            IntStream.range(0, binaryCount).forEach(i -> {
                try {
                    int binaryItem = Integer.parseInt(bufferedReader.readLine().trim());

                    binary.insertNode(binaryItem);
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            });

            long result = ResultAwnser.getNumber(binary.head);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();

            bufferedReader.close();
            bufferedWriter.close();
        }
}



