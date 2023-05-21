bike_rate = 20
car_rate = 40
car = int(input("Enter no of cars : "))
car_hours = int(input("Enter no of hours for cars : "))
bike = int(input("Enter no of bikes : "))
bike_hours = int(input("Enter no of hours for bikes : "))
total = (car * car_rate * car_hours) + (bike * bike_rate * bike_hours)
if total == 0:
    print("No cars/bikes were parked")
else:
    print("Parking lot")
    print("---------------------------------")
    print(f"No of cars             : {car}")
    print(f"Total no of cars hours : {car_hours}")
    print(f"Rate of cars per hour is {car_rate}")
    print(f"Total amount for cars   :{car * car_rate * car_hours}")
    print()
    print(f"No of bikes            : {bike}")
    print(f"Total no of bikes hours: {bike_hours}")
    print(f"Rate of bikes per hour is {bike_rate}")
    print(f"Total amount for bikes   :{bike * bike_rate * bike_hours}")
    print("---------------------------------")
    print("Total money earned = Rs {}".format(total))
