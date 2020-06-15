#include<iostream>
using namespace std;
int printresult(int *p,int a,int b)
{
  int sum=0;
     for(int i=0;i<a;i++)
      sum+=*(p+i);
  if(sum<=b)
    cout<<"YES";
  else
    cout<<"NO";
}
int main()
{
  //Type your code here.
  int a,b,*p;
  cin>>a>>b;
  int arr[a];
  for(int i=0;i<a;i++)
    cin>>arr[i];
  p=arr;
printresult(p,a,b);
}