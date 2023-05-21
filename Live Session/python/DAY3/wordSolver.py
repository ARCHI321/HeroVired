import random
words = ["Energy" , "Friend" , "School" , "University" ]
word = random.choice(words)
word=word.lower()
actual_word = list(word)
word_gap = []
flag = 0

for ele in word:
    if ele in "aeiouAEIOU" and word.index(ele) == 0 and flag == 0:
        print(ele.upper() , end="")
        word_gap.append(ele.upper())
        flag = 1
    elif ele in "aeiouAEIOU":   
        print(ele , end="")
        word_gap.append(ele)
    else:
        print("_" , end="") 
        word_gap.append("_")  

print()
incorrect = 0
while incorrect < 5:
    char = input("Enter a character : ")
    newWord = ""
    if char in actual_word:
        count_of_char = actual_word.count(char)
        if count_of_char == 1:
            index = actual_word.index(char)
            if index == 0:
               word_gap[index] = char.upper() 
            else:   
               word_gap[index] = char
            print(newWord.join(word_gap))
        if word_gap.count("_") == 0:
            print("Won the round")
            print(f"The word is {word}")   
            exit(1)

    else:
        print(f"{char} -> incorrect")
        incorrect += 1
print("Oops! You lost all your chances to guess the letters.!")        
print(f"The word is {word}")   
print("Never mind, Play smart..!")

