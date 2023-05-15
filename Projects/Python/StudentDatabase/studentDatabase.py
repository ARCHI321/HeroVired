studentDatabase = dict()
roll_id = 0
parameters = ["name" , "class" , "age" , "admission _year" ,"gender" ]
roll_id_list = []

def printDict(d):
    print()
    for k in d.keys():
        print(f"{k} - {d[k]}")
    print()    

count_of_students = int(input("Enter number of students : "))
while(count_of_students > 0):
    if len(roll_id_list) == 0:
        roll_id = 1
        roll_id_list.append(roll_id)
    else:    
        roll_id = roll_id_list[len(roll_id_list) - 1] + 1
        roll_id_list.append(roll_id)
    name = input("enter name of student : ")
    class_ = input("enter class of student : ")
    age = int(input("enter age of student : "))
    admission_year = int(input("enter admission year of student : "))
    gender = input("enter gender of student : ")
    studentDatabase.update({roll_id : {"name" : name , "class" : class_ , "age" : age , "admission _year" : admission_year , "gender" : gender}})
    count_of_students = count_of_students - 1
    print()
printDict(studentDatabase)  

choice = 0
while(True):
    print("1. Add a student    2. Remove a student    3. Update a student info   4. Search for a student info  5.exit")
    choice = int(input("Enter your choice : "))
    if choice == 1:
        if len(roll_id_list) == 0:
           roll_id = 1
           roll_id_list.append(roll_id)
        else:    
            roll_id = roll_id_list[len(roll_id_list) - 1] + 1
            roll_id_list.append(roll_id)
        name = input("enter name of student : ")
        class_ = input("enter class of student : ")
        age = int(input("enter age of student : "))
        admission_year = int(input("enter admission year of student : "))
        gender = input("enter gender of student : ")
        studentDatabase.update({roll_id : {"name" : name , "class" : class_ , "age" : age , "admission _year" : admission_year , "gender" : gender}})
        printDict(studentDatabase)
    elif choice == 2:
        if len(studentDatabase.keys()) == 0:
            print("\n No Data \n")
        else:

            roll = int(input("Enter the roll number : "))
            if roll not in studentDatabase.keys():
               print("No data found\n")
            else:    
               del studentDatabase[roll]  
               roll_id_list.remove(roll)
               printDict(studentDatabase)
    elif choice == 3:
        roll = int(input("Enter the roll number : "))
        if roll not in studentDatabase.keys():
            print("No data found\n")
        else:    
            input1 = int(input("What to update - 1.Name 2.Class 3.Age 4.Admission year 5.Gender : "))
            if input1 > len(parameters):
               print("Wrong input\n")
            else:    
               input2 = input("Enter the updated value : ")
               parameter_chosen = parameters[input1 - 1]
               studentDatabase[roll][parameter_chosen] = input2
               print("\n",studentDatabase[roll],end="\n")
    elif choice == 4:
        roll = int(input("Enter the roll number : "))
        if roll not in studentDatabase.keys():
            print("No data found\n")
        else:    
            print("\n",studentDatabase[roll],end="\n")
    elif choice == 5:
        exit(1)        
    else:
        print("Wrong input\n")    


        


