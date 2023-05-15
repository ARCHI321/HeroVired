d = dict()
d = {
    "name" : "Archi",
    "age" : 24
}


d.update({"experience" : 2})
print(d)
print(d.get("age"))
d.pop("age")
print(d)


e = {
    "name" : "Ritwik",
    "age" : 5
}

l = [d,e]
print(l)
