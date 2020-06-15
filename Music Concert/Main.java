#include<iostream>
using namespace std;
int main(){
  // Type your code here
  int a,*b,f=0,m=0;
  cin>>a;
  int arr[a];
  b=(int*)malloc(a*sizeof(int));
   for(int i=0;i<a;i++)
  {
    cin>>arr[i];
  }
  b=arr;
  for(int i=0;i<a;i++)
  {
    if(*(b+i)%2==0)
      f++;
    else
      m++;
  }
  cout<<m<<"\n"<<f;
  
  return 0;
}