#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  string arr;
  getline(cin,arr);
  int a=arr.find("the");
  while(a<arr.length())
  {
    arr.erase(a,4);
    a=arr.find("the");
  }
 cout<<arr;
}