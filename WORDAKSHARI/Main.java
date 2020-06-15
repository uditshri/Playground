#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  string s=" ";
  char b;
  cin>>s;
  int a=s.length();
    b=s.at(a-1);
  cout<<s<<"\n";
   while(s!="####")
  {
    cin>>s;
     if(b==s[0])
     {cout<<s<<"\n";
    int a=s.length();
    b=s.at(a-1);}
     else
       break;
     
  }
}