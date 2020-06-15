#include<iostream>
#include<cmath>
int power(int m,int n)
{
    int j,i;
    for(i=1,j=1;i<=n;i++)
        j=j*m;
    return j;
}
int arm(int n)
{
    //Your code goes here
  int sum=0,a,v,q,i=0;
  v=n;
  q=n;
  while(q)
  {
    q/=10;
    i++;
  }
  while(n)
  {
    int c=0;
    a=n%10;
    c=power(a,i);
    sum+=c;
    n/=10;
  }
  if(v==sum)
    return 1;
  else 
    return 0;
}
int main()
{
    int n;
    std::cin>>n;
    if(arm(n)==1)
        std::cout<<"Kindly proceed with encrypting";
    else
        std::cout<<"It is not an Armstrong number";
    
}