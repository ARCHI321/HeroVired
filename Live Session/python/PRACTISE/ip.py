addressString = input("Enter the address string : ")
#a = "19216801"
a = addressString
print(addressString)
l =9
ip_address = ""
if len(a) == 12:
    ip_address = a[0:3] + "." + a[3:6] + "." + a[6:9] + "." + a[9:12] 
elif len(a) == 11:
    ip_address = a[0:3] + "." + a[3:6] + "." + a[6:9] + "." + a[9:11] 
elif len(a) == 11:
    ip_address = a[0:3] + "." + a[3:6] + "." + a[6:9] + "." + a[9:10] 
       



if len(a[0:3]) == 3:
    a1 = a[0:3]
    a = a[3:]

print(ip_address)    
    