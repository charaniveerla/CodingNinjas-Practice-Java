"""
INPUT: 
------
n=4

OUTPUT:
--------
*******
 *****
  ***
   *

Approach followed:
----------------------------
1. First we have n rows and (2*n)-1 columns to be printed 
2. Split the complete pattern into 2 halfs i.e., left side traingle and right side traingle
3. In left side traingle, first print the spaces and then go for stars
4. In the right side triangle, you just need to print stars, that's all

"""
n=int(input())
if(n<=0):
    pass
    # you need not do anything here
else:
  
    # We have to travel n rows. So the range is from 1 to n+1
    for i in range(1,n+1):
      
    # Left Side Traingle
        #If we can observe, we have i-1 spaces in each ith row so the range is from 1 to i
        for j in range(1,i):
            print(" ",end="")
            
            
        #After spaces we have to print stars. Here we have (n-i)+1 stars so the range is from 1 to (n-i)+2
        for j in range(1,(n-i)+2):
            print("*",end="")
    # Right Side Triangle
        #If we can observe we have (n-i) stars to be printed. So the range is from 1 to (n-i)+1
        for j in range(1,(n-i)+1):
            print("*",end="")
        
        #Taking the controlling into next line
        print()
