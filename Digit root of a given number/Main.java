#include<iostream>
using namespace std;
int sum(int a)
{

  int s=0;
  if(a<=9)
    return a;
  int b=a%10;
  a=a/10;
  return s+b+sum(a);
}
int main()
{
  int a;
  cin>>a;
 
 while(sum(a)>9)
 {
     a=sum(sum(a));
 }
  cout<<a;
}