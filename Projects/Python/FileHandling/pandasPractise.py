import pandas as pd
# data = pd.read_csv('D:\Hero vired\python\DAY7\marks.csv' , header=0) #header is to make which row to make the header
# print(data)
# print(data.columns)
# print(data.info)
# print(data.describe())
# print(data.head(2))
# print(data.tail(2))


# header = ["empid" , "salary" , "bonus"]
# data = [[1001,10000,5000] , [1002 , 15000, 6000] , [1003,20000,8000]]
# data_csv = pd.DataFrame(data,columns=header)
# data_csv.to_csv('D:\Hero vired\python\DAY7\employee.csv' , index=False)

import csv
header = ["empid" , "salary" , "bonus"]
data = [[1001,10000,5000] , [1002 , 15000, 6000] , [1003,20000,8000]]
with open('D:\Hero vired\python\DAY7\emp.csv' , 'w' , newline="") as fp:
    v1 = csv.writer(fp)
    v1.writerow(header)
    v1.writerows(data)
    print(v1)

