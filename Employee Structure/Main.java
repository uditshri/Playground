#include<iostream>
using namespace std;
struct emp1
{
  char name[50];
  int id,age;
   char des[50];
   char sal[50];
  void printall()
  {
    cout<<"Name of the Employee : "<<name<<"\n";
    cout<<"ID of the Employee : "<<id<<"\n";
    cout<<"Age of the Employee : "<<age<<"\n";
    cout<<"Designation of the Employee : "<<des<<"\n";
    cout<<"Salary of the Employee : "<<sal<<"\n";
  }
};


int main()
{
  //Type your code here.
  emp1 emp;
  cout<<"Enter name:\n\
Enter ID:\n\
Enter age:\n\
Enter designation:\n\
Enter Salary:\n\
Employee Details\n";
  cin.get(emp.name,50);
  cin>>emp.id>>emp.age;
  cin>>emp.des;
 cin>>emp.sal;
  emp.printall();
}