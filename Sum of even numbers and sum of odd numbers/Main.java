#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a,even=0,odd=0;
  cin>>a;
  int arr[a];
   for(int i=0;i<a;i++)
   {
     cin>>arr[i];
   }
  
  for(int i=0;i<a;i++)
  {
    if(arr[i]%2==0)
    even+=arr[i];
    else
      odd+=arr[i];
  }
  cout<<"The sum of the even numbers in the array is "<<even<<"\n";
  cout<<"The sum of the odd numbers in the array is "<<odd<<"\n";
}