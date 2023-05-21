# with open('D:\Hero vired\python\DAY7\marks.csv' , "r") as fp:
#     v1 = fp.readlines()
#     print(v1)
# header = v1[0]
# print(header)    
# data = v1[1:]
# print(data)
# print([i.strip("\n") for i in data])


# import csv
# with open('D:\Hero vired\python\DAY7\marks.csv' , "r") as fp:
#     readcsv = csv.reader(fp)
#     for i in readcsv:
#         print(i)


import csv
data = []
with open('D:\Hero vired\python\DAY7\marks.csv' , "r") as fp:
    readcsv = csv.reader(fp)
    header = next(readcsv)
    print(header)

    for i in readcsv:
        data.append(i)
    print(data)    
