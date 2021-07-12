"""
Check Permutation
Send Feedback
For a given two strings, 'str1' and 'str2', check whether they are a permutation of each other or not.
Permutations of each other
Two strings are said to be a permutation of each other when either of the string's characters can be rearranged so that it becomes identical to the other one.

Example: 
str1= "sinrtg" 
str2 = "string"

The character of the first string(str1) can be rearranged to form str2 and hence we can say that the given strings are a permutation of each other.
Input Format:
The first line of input contains a string without any leading and trailing spaces, representing the first string 'str1'.

The second line of input contains a string without any leading and trailing spaces, representing the second string 'str2'.
Note:
All the characters in the input strings would be in lower case.
Output Format:
The only line of output prints either 'true' or 'false', denoting whether the two strings are a permutation of each other or not.

You are not required to print anything. It has already been taken care of. Just implement the function. 
Constraints:
0 <= N <= 10^6
Where N is the length of the input string.

Time Limit: 1 second
Sample Input 1:
abcde
baedc
Sample Output 1:
true
Sample Input 2:
abc
cbd
Sample Output 2:
false
"""
from sys import stdin
def isPermutation(s1, s2):
    if(len(s1)!=len(s2)):
        return 0
    else:#i.e., lengths are same
        freq=[0]*256
        for i in range(0,len(s1)):
            index=ord(s1[i])
            freq[index]+=1
        for j in range(0,len(s2)):
            index=ord(s2[j])
            freq[index]-=1
        for i in range(256):
            if(freq[i]!=0):
                return 0
        return 1
#main
string1 = stdin.readline().strip();
string2 = stdin.readline().strip();
ans = isPermutation(string1, string2)
if ans :
    print('true')
else :
    print('false')

