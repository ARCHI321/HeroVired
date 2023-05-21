word = input("enter a word : ")
index_ = []
for x in word:
    print(ord(x) - 97)
    index_.append(ord(x) - 97)
max_ = max(index_)    
freqeuncy = []
for i in range(max_+1):
    freqeuncy.append(0)

for x in word:
    freqeuncy[(ord(x) - 97)] += 1
print(freqeuncy,len(freqeuncy))      

