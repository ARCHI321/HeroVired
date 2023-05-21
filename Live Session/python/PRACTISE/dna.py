sample = ['GTA','GGG','CAC']
def read_dna(dna_file):
  with open(dna_file , "r") as fp:
    f = list(fp.read())
    codeon = ''
    start = 0
    end = 3
    s = ''
    codeon_list = []
    for i in range((len(f)//3) + 1):
      codeon = f[start:end]
      s = "".join(codeon)
      codeon_list.append(s)
      start += 3
      end += 3
    return(codeon_list)  



    pass

suspects = ['suspect1.txt' , 'suspect2.txt' , 'suspect3.txt']
_count = 0
count_list = []
for file in suspects:
  l = read_dna(file)
  for y in sample:
    if y in l:
      _count = l.count(y)
    count_list.append(_count)  

a = count_list[0:3]
b = count_list[3:6]
c = count_list[6:9]
if a > b and a > c:
  print("Suspect 1 is the culprit")
elif b > a and b > c:
  print("Suspect 2 is the culprit") 
else:
  print("Suspect 3 is the culprit")  






print(read_dna('D:\Hero vired\python\PRACTISE\suspect1.txt'))


