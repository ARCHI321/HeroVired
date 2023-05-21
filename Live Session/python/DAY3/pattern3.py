#both side
k=5  #number of rows
n=2*k-2
for i in range(0,k):
    for j in range(0,n):
        print(end=" ")
    n=n-2
    for k in range(0,i+1):
        for l in range(0,k+1):
         print("* ",end="")
    print("\r")