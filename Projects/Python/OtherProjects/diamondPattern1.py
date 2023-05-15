n = int(input("Enter number of rows : "))
sp = (2*n) - 2
count = 1
j = 0
while j < n:
    for i in range(sp):
       print(end=" ")
    for i in range(count):
       print("* ", end="  ")
    print()
    count = count + 1
    sp = sp - 2
    j += 1 
sp = 2
count = n - 1
j = 0  
while j < n-1:
    for i in range(sp):
       print(end=" ")
    for i in range(count):
       print("* ", end="  ")
    print()
    count = count - 1
    sp = sp + 2
    j += 1 
    