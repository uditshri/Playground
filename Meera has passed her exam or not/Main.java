#include<iostream>
using namespace std;
int main()
{
   // Type your code here
  int a,max;
  cin>>a;
  int arr[a];
  
	for(int i=0;i<a;i++)
    {
      cin>>arr[i];
    }
  cin>>max;
  int f=0;
  for(int i=0;i<a;i++)
    {
    if(arr[i]==max)
      f++;
    }
  if(f!=0)
  cout<<"She passed her exam";
  else
    cout<<"She failed";
}
    