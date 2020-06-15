#include<iostream>
using namespace std;
int main()
{
   // Type your code here
  int a;
  cin>>a;
  int arr[a];
  
	for(int i=0;i<a;i++)
    {
      cin>>arr[i];
    }
  int max=arr[0];
  for(int i=0;i<a;i++)
    {
    if(arr[i]>max)
      max=arr[i];
    }
  cout<<max;
}
    