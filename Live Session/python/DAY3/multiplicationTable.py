num = int(input("Enter a number : "))
print("Multiplication table using for loop")
for i in range(1,11):
    print(f"{num} * {i} = {num*i}")


print("Multiplication table using while loop")
i = 1
while i <=10:
    print(f"{num} * {i} = {num*i}")
    i += 1