#include<iostream>
using namespace std;
int fact(int a)
{
    if(a==1)
    return 1;
  
  return a*fact(a-1);
    
}
int main()
{
  //Type your code here.
  int z;
  cin>>z;
  cout<<"The factorial of "<<z<<" is "<<fact(z);
}