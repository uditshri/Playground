#include<iostream>
#include<string.h>
using namespace std;
int main()
{
  //Type your code here.
  char a[50],b[50];
  cin>>a;
  cin>>b;
  int n=strcmp(a,b);
  if(n==0)
    cout<<"It is correct";
  else
    cout<<"It is wrong";
    
}