l = [1,2,3,4,5,6,7,8]

# odd_list = []
# even_list = []
# for ele in l:
#     if ele%2 == 0:
#         even_list.append(ele)
#     else:
#         odd_list.append(ele)    

# print(odd_list , even_list)        

# #using filter
# print(list(filter(lambda x : x%2 == 0, l)))
# print(list(filter(lambda x : x%2 != 0, l)))

#filter using function
# def evenlist(i):
#     return i%2 == 0
# def oddlist(i):
#     return i%2 != 0


# print(list(filter(evenlist , l)))        
# print(list(filter(oddlist , l)))    


#greater than 5
#print(list(filter(lambda x: x>5 , l)))

# def greaterThan5(i):
#     return i>5
# print(list(filter(greaterThan5,l)))
# l2 = filter(greaterThan5,l)
# for l3 in l2:
#     print(l3)


#square of a number
# l1 = [1,2,3,4]
# def square(i):
#     return i**2

# sq = map(square,l1)
# print(list(sq))

#zip function
# l1 = [1,2,3,4]
# l3 = ['a' , 'b' , 'c' , 'd']
# z = zip(l1,l3)
# print(list(z))


l1 = [1,2,3,4]
l2 = list(map(lambda l:l**2 , l1))
print(l2)