word = input("Enter a word : ").lower()
uniqueLetters = ""
for ele in word:
    if ele not in uniqueLetters:
        uniqueLetters = uniqueLetters + ele
print(uniqueLetters)
print(f"Count of unique letters in the word {word} is {len(uniqueLetters)}")        