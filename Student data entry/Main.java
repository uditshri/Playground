#include <iostream>
using namespace std;

struct student
{
    char name[50];
    int roll;
    float marks;
}p1;

int main() 
{
    cin.get(p1.name,50);
    cin>>p1.roll>>p1.marks;
   
 cout<<"\nStudent Details\nName: "<< p1.name<<"\nRoll: "<< p1.roll<<"\nMarks: "<< p1.marks; 
 return 0; 
} 
