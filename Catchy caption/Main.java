#include <cstring>
#include <iostream>
using namespace std;
int main()
{
   //Your code goes here
  char a[100];
  int a1=0;
  cin.get(a,100);
  for(int i=0;i<strlen(a);i++)
  {
    int z=a[i];
    if(z==32)
      a1++;
  }
   if((a1+1)<10)
     cout<<"Caption eligible for the contest";
  else
    cout<<"Caption not eligible for the contest";
}