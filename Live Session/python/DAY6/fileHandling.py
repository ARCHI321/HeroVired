# file1 = open("D:\Hero vired\python\DAY6\sample1.txt" , "x") #mode: +-for both cread & write,w-write,a-for append,r-read)default),x-exclusive creation(if file xists , give error) , b - binary file , r+b - read and write in binary mode
# file1.close()

# file2 = open("D:\Hero vired\python\DAY5\demo.txt" , "w")
# file2.close()

# with open("D:\Hero vired\python\DAY6\sample1.txt" ,"w") as fp: #opening a file
#     fp.write("Hello , this is a sample1 text\n")
#     fp.write("This is my second line")
#     pass
#fp.write("this is 3rd line")


#file modes
# fp = open("D:\Hero vired\python\DAY6\sample1.txt" , "r")
# print(fp.read())

# with open("D:\Hero vired\python\DAY6\sample1.txt" ,"r") as fp: #opening a file
    #print(fp.read())
    #print(fp.readline())
    #print(fp.readlines())

    # for x in fp.readlines():
    #     print(x)

    # for i in range(2):
    #     print(fp.readline())
    # pass
    # l = fp.readline()
    # while l!="":
    #     print(l,end="") 
    #     l = fp.readline()
    #     pass    

# fp = open("D:\Hero vired\python\DAY6\sample.txt" , "r")
# #print(fp.read())
# print(fp.readlines())
# print(len(fp.readlines()))


with open("D:\Hero vired\python\DAY6\sample.txt" ,"r") as fp:
    # print(fp.seek(2))
    # l = fp.readline()
    # while l!="":
    #     print(l,end="") 
    #     l = fp.readline()
    #     pass 
    #print(fp.readlines()[-2:])
    for line in (fp.readlines()[-2:]):
        print(line)
    pass    
    


