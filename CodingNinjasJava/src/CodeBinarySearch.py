"""
Code Binary Search
Send Feedback
You have been given a sorted(in ascending order) integer array/list(ARR) of size N and an element X. Write a function to search this element in the given input array/list using 'Binary Search'. Return the index of the element in the input array/list. In case the element is not present in the array/list, then return -1.
Input format :
The first line contains an Integer 'N' which denotes the size of the array/list.

Second line contains 'N' single space separated integers representing the elements in the array/list.

Third line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow..

All the 't' lines henceforth, will take the value of X to be searched for in the array/list.
Output Format :
For each test case, print the index at which X is present, -1 otherwise.

Output for every test case will be printed in a separate line.
Constraints :
1 <= t <= 10^4
0 <= N <= 10^6
0 <= X <= 10^9
Time Limit: 1 sec
Sample Input 1:
7
1 3 7 9 11 12 45
1
3
Sample Output 1:
1
Sample Input 2:
7
1 2 3 4 5 6 7
2
9
7
Sample Output 2:
-1
6
"""
n=int(input())
if(n>0):
    arr=list(map(int,input().split()))
    t=int(input())
    if(t>0):
	    key=[]
	    result=[]
	    while(t>0):
	        key.append(int(input()))
	        t-=1
	    for i in range(0,len(key)):
	        flag=0
	        for j in range(0,len(arr)):
	            if(key[i]==arr[j]):
	                flag=1
	                result.append(j)
	        if(flag==0):
	            result.append(-1)
	    for i in result:
	        print(i,end="\n")
    else:
        print(-1)
else:
    print(-1)
