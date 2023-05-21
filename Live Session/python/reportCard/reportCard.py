import csv
data = []
with open('D:\\Hero vired\\python\\reportCard\\score.csv' , "r") as fp:
    readcsv = csv.reader(fp)

    header = next(readcsv)
    for i in readcsv:
        data.append(i)
print(header)    
gaps = [] 
lengths = []   
for x in header:
    print(x , end=" |")
    lengths.append(len(x)+1)
print()   
i = 0 


for y in data:
    i = 0
    for z in y:
        print(z , end = "") 
        if lengths[i] - len(z):
            gap = lengths[i] - len(z)
        else:
            gap = 3    
        print(" "*(gap),end="|")
        i+=1 
      
    print() 
    print("-"*(sum(lengths)+10),end="\n")     
