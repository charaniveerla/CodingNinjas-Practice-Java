"""
Fibonacci Number
Send Feedback
Given a number N, figure out if it is a member of fibonacci series or not. Return true if the number is member of fibonacci series else false.
Fibonacci Series is defined by the recurrence
    F(n) = F(n-1) + F(n-2)
where F(0) = 0 and F(1) = 1


Input Format :
Integer N
Output Format :
true or false
Constraints :
0 <= n <= 10^4
Sample Input 1 :
5
Sample Output 1 :
true
Sample Input 2 :
14
Sample Output 2 :
false    
"""
def checkMember(n):
    n1=1
    n2=1
    while(n1!=n):
        n3=n1+n2
        n2=n1
        n3=n2

n=int(input())
if(checkMember(n)):
    print("true")
else:
    print("false")
