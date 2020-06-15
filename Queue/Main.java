#include<iostream>
using namespace std;
int main()
{
  int n,i,m,sum=0;
  cin>>n;
  cin>>m;
  int arr[n];
  for(i=0;i<n;i++)
    cin>>arr[i];
  for(i=0;i<n;i++)
    sum+=arr[i];
  if(n==1 && m==2)
    cout<<"1";
  else
    cout<<((sum/m)+1);
  
}
