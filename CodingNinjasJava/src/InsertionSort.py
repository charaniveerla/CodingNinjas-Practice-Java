"""
Code Insertion Sort
Send Feedback
Provided with a random integer array/list(ARR) of size N, you have been required to sort this array using 'Insertion Sort'.
 Note:
Change in the input array/list itself. You don't need to return or print the elements.
 Input format :
The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.

First line of each test case or query contains an integer 'N' representing the size of the array/list.

Second line contains 'N' single space separated integers representing the elements in the array/list.
Output Format :
For each test case, print the elements of the array/list in sorted order separated by a single space.

Output for every test case will be printed in a separate line.
Constraints :
1 <= t <= 10^2
0 <= N <= 10^3
Time Limit: 1 sec
Sample Input 1:
1
7
2 13 4 1 3 6 28
Sample Output 1:
1 2 3 4 6 13 28
Sample Input 2:
2
5
9 3 6 2 0
4
4 3 2 1
Sample Output 2:
0 2 3 6 9
1 2 3 4 
"""
t=int(input())
while(t>0):#loop for test cases
    n=int(input())#reading size of array
    if(n==0):#if size of array is 0 then we need not do anything
        pass
    else:#if array has some elements
        a=list(map(int,input().split()))
      """
In insertion sort we basically maintain 2 partitions in the given array, the 1st partition has sorted elements and the 2nd partition has unsorted elements.
Our target is to bring each of the element in unsorted partition and place it in the correct position of the sorted partition.
For this, we will follow the following approach:
By deafult, we assume that 0th index element is the only element in the sorted partitioned array.
So we start from 1st index position to rest of the array elements and place them in their positions in the sorted partitioned array.
For that we will start the comparing process from 1st index element
      """
        for i in range(1,len(a)):
        #we will store every element that we will be comparing in some temporary variable so that in shifting the positions we dont loose the ith value in each iterations.
            tmp=a[i]
         #we will compare the ith element with elements in sorted partitioned array from last. So we initialise j with i-1.
            j=i-1
          #comparing ith and jth elements in two partitions
            while(j>=0 and a[j]>tmp):
            #shifting positions
                a[j+1]=a[j]
                a[j]=tmp
              #updating j value by decrementing 1 
                j-=1
        #printing the complete space seperated array elements in a single line
        for i in a:
            print(i,end=" ")
        #new line for each testcase
        print()
    t-=1
