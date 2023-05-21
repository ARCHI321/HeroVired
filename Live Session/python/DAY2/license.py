age = int(input("Enter your age : "))
if age < 18 and age > 60:
    print("You are not eligible")
elif age >= 18 and age <= 60:
    print("Good! You are eligible for the license")
else:
    print("You entered wrong age")
