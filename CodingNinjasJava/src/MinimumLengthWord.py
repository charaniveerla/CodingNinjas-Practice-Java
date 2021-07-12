"""
Minimum Length Word
Send Feedback
Given a string S (that can contain multiple words), you need to find the word which has minimum length.
Note : If multiple words are of same length, then answer will be first minimum length word in the string.
Words are seperated by single space only.
Input Format :
String S
Output Format :
Minimum length word
Constraints :
1 <= Length of String S <= 10^5
Sample Input 1 :
this is test string
Sample Output 1 :
is
Sample Input 2 :
abc de ghihjk a uvw h j
Sample Output 2 :
a
"""
arr=list(map(str,input().split()))
min=999999
word=""
for i in arr:
    if(len(i)<min):
        min=len(i)
        word=str(i)+" "
out=list(map(str,word.split()))
print(out[-1])
