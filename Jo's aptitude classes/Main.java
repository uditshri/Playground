n=0
l=[]
while(n<3):
  a=int(input())
  l.append(a)
  n+=1
b=int(input())
m=0
for i in l:
  if(i%b==0):
    m+=1
if m==3:
  print("Answer is correct.")
else:
  print("Answer is wrong.")