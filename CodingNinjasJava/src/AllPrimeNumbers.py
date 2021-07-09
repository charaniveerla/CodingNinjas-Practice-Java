"""
All Prime Numbers
Send Feedback
Given an integer N, print all the prime numbers that lie in the range 2 to N (both inclusive).
Print the prime numbers in different lines.
Input Format :
Integer N
Output Format :
Prime numbers in different lines
Constraints :
1 <= N <= 100
Sample Input 1:
9
Sample Output 1:
2
3
5
7
Sample Input 2:
20
Sample Output 2:
2
3
5
7
11
13
17
19
"""
m=int(input())
for n in range(2,m+1):
    flag=1
    for i in range(2,n+1):
        if(n%i==0):
            flag+=1
    if(flag==2):
        print(n,end="\n")
