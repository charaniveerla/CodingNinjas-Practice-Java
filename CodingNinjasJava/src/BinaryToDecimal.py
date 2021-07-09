"""
Binary to decimal
Send Feedback
Given a binary number as an integer N, convert it into decimal and print.
Input format :
An integer N in the Binary Format
Output format :
Corresponding Decimal number (as integer)
Constraints :
0 <= N <= 10^9
Sample Input 1 :
1100
Sample Output 1 :
12
Sample Input 2 :
111
Sample Output 2 :
7
"""
## Read input as specified in the question.
## Print output as specified in the question.
n1=str(input())#taking binary input
n=int(n1)
dec=0
tmp=n
rev=0
mul=1
while(tmp>0):
    rem=tmp%10
    dec=dec+(mul*rem)
    tmp=tmp//10
    mul=mul*2
print(dec)
