def isPrime(n):
    count = 0
    for i in range(2,(n//2)+1):
        if n % i == 0:
            count += 1      
    if count == 0:
        return True
    else:
        return False        


lower_num = int(input("Enter a lower range : "))
upper_num = int(input("Enter a upper range : "))

for i in range(lower_num,upper_num+1):
    if isPrime(i):
        print(f"{i} is a prime number between the given range.")
   
