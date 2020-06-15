#include<iostream>
using namespace std;
struct Student 
{ 
  char name[30]; 
  char department[20]; 
  int yearOfStudy; 
  float cgpa; 
  void printall(int z)
  {
    cout<<"College:"<<z<<"\n";
      cout<<"Name:"<<name<<"\n";
    cout<<"City:"<<department<<"\n";
    cout<<"Year of establishment:"<<yearOfStudy<<"\n";
    cout<<"Pass percentage:"<<cgpa<<"\n";
  }
}s[10];
int main()
{
  //Type your code here.
  int n,i=1;
  cout<<"Enter the number of colleges\n";
  cin>>n;
    while(i<=n)
  {
    cout<<"Enter the details of college "<<i<<"\n";
  cout<<"Enter name\n";
    cin>>s[i-1].name;
    cout<<"Enter city\n";
    cin>>s[i-1].department;
    cout<<"Enter year of establishment\n";
    cin>>s[i-1].yearOfStudy;
    cout<<"Enter pass percentage\n";
    cin>>s[i-1].cgpa;
    
    i++;
  }
  cout<<"Details of colleges\n";
  for(int j=0;j<n;j++)
  s[j].printall(j+1);
   
}