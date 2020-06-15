#include<iostream>
using namespace std;
int gdc(int a,int b)
{
    if(a==0)
    return b;
    if(b==0)
    return a;
    if(a==b)
    return a;
  if(a>b)
    return gdc(a-b,b);
    else
  return gdc(a,b-a);
}
int main()
{
  //Type your code here.
  int a,b;
  cin>>a>>b;
  cout<<"G.C.D of "<<a<<" and "<<b<<" = "<<gdc(a,b);
}