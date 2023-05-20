sp1 = 5
sp2 = 4
for i in range(3):
    
    for k in range(sp1):
        print(" ",end="")

    for j in range(i+1):
        print("*",end=" ")
    print()    
    sp1 = sp1 - 1

for i in range(2):
    for m in range(sp2):
        print(" ",end="")

    for j in range(2,i,-1):
        print("*",end=" ")    
    print()    
    sp2 = sp2 + 1    
