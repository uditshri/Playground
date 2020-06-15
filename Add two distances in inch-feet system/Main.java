#include<iostream>
using namespace std;
struct time
{
	int f;
  float i;
};
int main()
{
  struct time t[3];
  std::cin>>t[1].f>>t[1].i;
  std::cin>>t[2].f>>t[2].i;
  t[0].f=t[1].f+t[2].f;
   t[0].i=t[1].i+t[2].i;
  if(t[0].i>12)
  {
  t[0].f++;
    t[0].i -=12;
  }
  std::cout<<t[0].f<<"\'-"<<t[0].i<<"\"";
}