# celcius = [12,23,34,45,56,67]
# def convertToFarenheit(i):
#     return ((i*(9/5)) + 32)
# farenheits = map(convertToFarenheit,celcius)
# print(list(farenheits))


# strings = ["hello","hi","bye","welcome","wow"]
# def findLengths(i):
#     return (len(i))
# string_length = map(findLengths,strings)
# print(list(string_length))

# integers = [1,2,3,4,5]
# def convertToString(i):
#     return (str(i))
# strings = map(convertToString,integers)
# print(list(strings))

# listNums = [ 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14]
# def primelist(num):
#     for i in range(2,(num//2) + 1):
#         if num % i == 0:
#             return False
#     return num > 1    
# print(list(filter(primelist , listNums)))   


# listNums = [51, 71, 24, 12, 84, 105, 65]
# listNums.sort(reverse=True)
# print(listNums)

# rollNumbers = [1, 2, 3, 4, 5]
# student_names = ["Rohit D", "Parth S", "Ken T", "Sarang M", "Alim S"]
# StudentDatabase = zip(rollNumbers,student_names)
# print(list(StudentDatabase))    



# sentence = "Hero Vired's flagship data program is ranked the number one online program in India."
# seach_word = input("Search word : ")
# print(sentence.count(seach_word))




ListPlayerA = [6, 3, 7]
ListPlayerB = [2, 6, 6]
count_a = count_b = 0
for i in range(len(ListPlayerA)):
    if ListPlayerA[i] > ListPlayerB[i]:
        count_a += 1
    elif ListPlayerA[i] > ListPlayerB[i]:    
        count_b += 1
if count_a > count_b:
    print("Winner is: Player-A")
else:
    print("Winner is: Player-B")    