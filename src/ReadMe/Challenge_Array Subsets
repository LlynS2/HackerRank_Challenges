1. Array Subsets

Given an integer array, divide the array into 2 subsets A and B while respecting the following conditions :
The intersection of A and B is null.
The union A and B is equal to the original array.
The number of elements in subset A is minimal.
The sum of A's elements is greater than the sum of B's elements.
Return the subset A in increasing order where the sum of A's elements is greater than the sum of B's elements.
If more than one subset exists, return the one with the maximal sum.

Example

n = 5 arr = [3, 7, 5, 6, 2]
The 2 subsets in arr that satisfy the conditions for A are [5, 7] and [6, 7] : A is minimal (size 2)
Sum(A) = (5 + 7) = 12 > Sum(B) = (2 + 3 + 6) = 11 Sum(A) = (6 + 7) = 13 > Sum(B) = (2 + 3 + 5) = 10
The intersection of A and B is null and their union is equal to arr.
The subset A where the sum of its elements is maximal is [6, 7].

Function Description

Complete the subsetA function in the editor below.
subsetA has the following parameter(s):
int arr[]: an integer array Returns:
int[] : an integer array with the values of subset A.
Constraints 1 ≤ n ≤ 105  1 ≤ arr[i] ≤ 105 (where 0 ≤ i < n)
Input Format For Custom Testing The first line contains an integer, n, denoting the number of elements in the array.
Each line i of the n subsequent lines contains an integer, which is an element of arr.

Sample Case 0 Sample

Input For Custom Testing

STDIN Function
----- --------
6     →   arr[] size n = 6
5     →   arr[] = [5, 3, 2, 4, 1, 2]
3 2 4 1 2
Sample Output
4
5

Explanation

n = 6 arr = [5, 3, 2, 4, 1, 2]
The subset of A that satisfies the conditions is [4, 5] : A is minimal (size 2)
Sum(A) = (4 + 5)= 9 > Sum(B) = (1 + 2 + 2 +  3) = 8
The intersection of A and B is null and their union is equal to arr.
The subset A with the maximal sum is [4, 5].

Sample Case 1 Sample

Input For Custom Testing

STDIN     Function
-----     --------
5    →   arr[] size n = 5
4    →   arr[] = [4, 2, 5, 1, 6]
2 5 1 6
Sample Output
5
6

Explanation

n = 5 arr = [4, 2, 5, 1, 6]
The subset of A that satisfies the conditions is [5, 6]: A is minimal (size 2)
Sum(A) = (5 + 6) = 11 > Sum(B) = (1 + 2 + 4) = 7 Sum(A) = (4 + 6) = 10 > Sum(B) = (1 + 2 + 5) = 8
The intersection of A and B is null and their union is equal to arr.
The subset A with the maximal sum is [5, 6].
