"""
Triplet Sum
Send Feedback
You have been given a random integer array/list(ARR) and a number X. Find and return the number of triplets in the array/list which sum to X.
Note :
Given array/list can contain duplicate elements.
Input format :
The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.

First line of each test case or query contains an integer 'N' representing the size of the first array/list.

Second line contains 'N' single space separated integers representing the elements in the array/list.

Third line contains an integer 'X'.
Output format :
For each test case, print the total number of triplets present in the array/list.

Output for every test case will be printed in a separate line.
Constraints :
1 <= t <= 50
0 <= N <= 10^2
0 <= X <= 10^9
Time Limit: 1 sec
Sample Input 1:
1
7
1 2 3 4 5 6 7 
12
Sample Output 1:
5
Sample Input 2:
2
7
1 2 3 4 5 6 7 
19
9
2 -5 8 -6 0 5 10 11 -3
10
Sample Output 2:
0
5


 Explanation for Input 2:
Since there doesn't exist any triplet with sum equal to 19 for the first query, we print 0.

For the second query, we have 5 triplets in total that sum up to 10. They are, (2, 8, 0), (2, 11, -3), (-5, 5, 10), (8, 5, -3) and (-6, 5, 11)
"""
t=int(input())
while(t>0):
    n=int(input())
    if(n==0):
        print(0,end="\n")
    else:
        arr=list(map(int,input().split()))
        k=int(input())
        c=0
        flag=0
        for i in range(0,len(arr)-2):
            for j in range(i+1,len(arr)-1):
                for p in range(j+1,len(arr)):
                    if(arr[i]+arr[j]+arr[p]==k):
                        c+=1
                        flag=1
        print(c,end="\n")
    t-=1
