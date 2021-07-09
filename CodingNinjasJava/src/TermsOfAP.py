"""
Terms of AP
Send Feedback
Write a program to print first x terms of the series 3N + 2 which are not multiples of 4.
Input format :
Integer x
Output format :
Terms of series (separated by space)
Constraints :
1 <= x <= 1,000
Sample Input 1 :
10
Sample Output 1 :
5 11 14 17 23 26 29 35 38 41
Sample Input 2 :
4
Sample Output 2 :
5 11 14 17
"""
x=int(input())
n=1
c=0
while(n>0 and c<x):
    term=int((3*n)+2)
    if(term%4!=0):
        print(term,end=" ")
        c+=1
    n+=1
        
