l = [1,2,6,6,5,4]
l_new = []
l_set = set(l)
#dictionary to store number of each elements
d = {}
for i in l_set:
    d[i] = l.count(i)
print(d)    

#shallow copy
l_copy = l.copy()
print(l_copy)
l.append(10)
l_copy.append(20)
print(l , l_copy)

#deep copy
l_copy1 = l
l.append(30)
l_copy1.append(40)
print(l,l_copy1)

for i in l:
    if i not in l_new:
        l_new.append(i)
print(l_new)        

#reverse
print(l[::-1])
l.reverse()
print(l)

#extend
l.extend([45,56])
print("Extend" , l)