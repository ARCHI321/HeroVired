str1 = input("enter first string : ")
str2 = input("enter second string : ")

list1 = list(str1)
list2 = list(str2)
#print(list1,list2)
list1.sort()
list2.sort()
flag = 0
#print(list1,list2)
if len(str1) != len(str2):
    print("Not an anagaram")
else:
    for i in range(len(list1)):
        if list1[i] == list2[i]:
            flag = 1 
        else:
            flag = 0
            break
if flag == 1:
    print("Words are anagram")            
else:
    print("Words are not anagram")    
