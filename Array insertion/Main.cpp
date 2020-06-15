#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a,n,v;
  cout<<"Enter the number of elements in the array\n\
Enter the elements in the array\n\
Enter the location where you wish to insert an element\n\
\
";
  cin>>a;
  int arr[a];
  for(int i=0;i<a;i++)
  {
    cin>>arr[i];
  }
  cin>>n>>v;
  if(n>a)
    cout<<"Invalid Input";
  else{
    cout<<"Enter the value to insert\n";
  for(int j=a;j>=n;j--)
  {
    arr[j]=arr[j-1];
  }
  arr[n-1]=v;
    cout<<"Array after insertion is\n";
  for(int i=0;i<=a;i++)
  {
    cout<<arr[i]<<"\n";
  }}
}
