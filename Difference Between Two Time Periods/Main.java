#include<iostream>
using namespace std;
struct time
{
	int hr,min ,sec;
};
int main()
{
  struct time t[3];
  std::cin>>t[1].hr>>t[1].min>>t[1].sec;
  std::cin>>t[2].hr>>t[2].min>>t[2].sec;
  if(t[2].sec>t[1].sec)
  {
  	t[1].min--;
    t[1].sec += 60;
  }
 t[0].sec= t[1].sec-t[2].sec;
  if(t[2].min>t[1].min)
  {
  	t[1].hr--;
    t[1].min +=60;
  }
  t[0].min= t[1].min-t[2].min;
  t[0].hr= t[1].hr-t[2].hr;
  std::cout<<t[0].hr<<":"<<t[0].min<<":"<<t[0].sec;
}