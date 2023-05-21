n = int(input("Enter number of rows : "))
sp = (2*n) -2
for i in range(n):
    for j in range(sp):
        print(end=" ")   
    for k in range(i+1):
        print("* ",end="")
    print() 
    sp = sp - 2     

# n = int(input("Enter number of rows : "))
# sp = n -1
# for i in range(1,n+1):
#     for j in range(sp):
#         print(" ",end="")   
#     for k in range(i):
#         print("*",end="")
#     print() 
#     sp = sp - 1     