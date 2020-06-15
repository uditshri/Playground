#include<iostream>
#include<string.h>
using namespace std;
int main()
{
  //Type your code here.
  char a[200];
  cin>>a;
  int n=strlen(a);
  a[n]=NULL;
  int i=0;
  while(a[i]!=NULL)
  {
    if((a[i]>=65 && a[i]<=90)||(a[i]>=97 &&a[i]<=122))
      cout<<a[i];
      i++;
  }
  
}