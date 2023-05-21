bike_rate = 20
car_rate = 40

car = int(input("Enter no of cars : "))
car_hours = []
print("Enter no of hours for each car : ")
for i in range(car):
    car_hours.append(int(input()))

bike = int(input("Enter no of bikes : "))
bike_hours = []
print("Enter no of hours for each bike : ")
for i in range(bike):
    bike_hours.append(int(input()))

car_hours_avg = sum(car_hours) // car   
bike_hours_avg = sum(bike_hours) // bike

total = (car * car_rate * car_hours_avg) + (bike * bike_rate * bike_hours_avg)
if total == 0:
    print("No cars/bikes were parked")
else:
    print("Parking lot")
    print("---------------------------------")
    print(f"No of cars             : {car}")
    print(f"Total no of cars hours : {car_hours}")
    print(f"Rate of cars per hour is {car_rate}")
    print(f"Total amount for cars   :{car * car_rate * car_hours_avg}")
    print()
    print(f"No of bikes            : {bike}")
    print(f"Total no of bikes hours: {bike_hours}")
    print(f"Rate of bikes per hour is {bike_rate}")
    print(f"Total amount for bikes   :{bike * bike_rate * bike_hours_avg}")
    print("---------------------------------")
    print("Total money earned = Rs {}".format(total))
