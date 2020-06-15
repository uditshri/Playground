#include<iostream>
#include<bits/stdc++.h>
using namespace std;
int main()
{
  //Type your code here.
  string a,b;
  cin>>a>>b;
  reverse(b.begin(),b.end());
if(a==b)
  cout<<"It is correct";
  else
    cout<<"It is wrong";
}