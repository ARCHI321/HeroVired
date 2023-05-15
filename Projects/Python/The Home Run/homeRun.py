console = [["----------------------------"],
           [" 01 " , "|", " 02 " , "|" , " 03 " , "|" , " 04 " , "|" , " 05 " , "|" ],
           ["----------------------------"],
           [" 06 " , "|", " 07 " , "|" , " 08 " , "|" , " 09 " , "|" , " 10 " , "|" ],
           ["----------------------------"],
           [" 11 " , "|", " 12 " , "|" , " 13 " , "|" , " 14 " , "|" , " 15 " , "|" ],
           ["----------------------------"],
           [" 16 " , "|", " 17 " , "|" , " 18 " , "|" , " 19 " , "|" , " 20 " , "|" ],
           ["----------------------------"],
           [" 21 " , "|", " 22 " , "|" , " 23 " , "|" , " 24 " , "|" , " 25 " , "|" ],
           ["----------------------------"],
           [" 26 " , "|", " 27 " , "|" , " 28 " , "|" , " 29 " , "|" , " 30 " , "|" ],
           ["----------------------------"],]


player = "A" 
choice = 'y'
index = 0
players = [0,0]
def printBoard(cons):
    for line in cons:
      for word in line:
        print(word , end="")
      print() 

def togglePlayer():
   global player
   global index
   if player == "A":
      player = "B"
      index = 0
   else:
      player = "A"  
      index = 1
   #print(player)
   return(index)   
def calculateScore(ind , dice):
   global players
   players[ind] += dice
   return players

def editBoard(ind,pl):
   c = console.copy()
   #printBoard(c) 
   if ind == 0:
      p = " A  "
   else:
      p = " B  "   
   dice = pl[ind]
   if dice >= 1 and dice <=5:
      i = c[1].index(" "+"0"+str(dice)+" ")
   elif dice >= 6 and dice <=10:
      if dice == 10:
         i = c[3].index(" "+str(dice)+" ")
      else:   
         i = c[3].index(" "+"0"+str(dice)+" ")
      c[3][i] = p
   elif dice >= 11 and dice <=15:
      i = c[5].index(" "+str(dice)+" ")
      c[5][i] = p  
   elif dice >= 16 and dice <=20:
      i = c[7].index(" "+str(dice)+" ")
      c[7][i] = p 
   elif dice >= 21 and dice <=25:
      i = c[9].index(" "+str(dice)+" ")
      c[9][i] = p      
   elif dice >= 26 and dice <=30:
      i = c[11].index(" "+str(dice)+" ")
      c[11][i] = p         
   printBoard(c) 

while(choice == 'y'):
   print(f"Press 'Y' to roll dice for Player: {player} " , end="")
   choice = input()
   ind=togglePlayer()
   print("Dice rolled : " , end="")
   dice = int(input())
   while dice >6:
      print("Wrong value")
      print("Dice rolled : " , end="")
      dice = int(input())
   
   pl = calculateScore(ind , dice)
   
   if 30 in pl and ind == 0:
      print("Player A wins")
      exit(1)
   elif 30 in pl and ind == 1:
      print("Player B wins")  
      exit(1)
   else:    
      print(f"Player A : {pl[0]} | Player B : {pl[1]}")
      editBoard(ind,pl)
      if dice == 6:
        print("Dice rolled : " , end="")
        dice = int(input()) 
        pl = calculateScore(ind , dice)
        print(f"Player A : {pl[0]} | Player B : {pl[1]}")
        editBoard(ind,pl)








 