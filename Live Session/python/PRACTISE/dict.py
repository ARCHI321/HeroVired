word = input("enter a word : ")
distinct = set(word)
frequency = dict()
for x in distinct:
    frequency[x] = word.count(x)
print(frequency)    

