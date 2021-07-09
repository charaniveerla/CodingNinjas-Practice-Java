"""
Odd Square
Send Feedback
Write a program to print the pattern for the given N number of rows.
For N = 4
1357
3571
5713
7135
Input Format :
A single integer: N
Output Format :
Required Pattern
Constraints :
0 <= N <= 50
Sample Input 1 :
3
Sample Output 1 :
135
351
513
Sample Input 2 :
 5
Sample Output 2 :
13579
35791
57913
79135
91357
"""
## Read input as specified in the question.
## Print output as specified in the question.
n=int(input())
arr=[]
for i in range(1,(2*n),2):
    arr.append(int(i))
for i in range(len(arr)):
    arr.append(arr[i])
for i in range(0,len(arr)//2):
    for j in range(i,i+n):
        print(arr[j],end="")
    print()
