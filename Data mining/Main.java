#include<iostream>
using namespace std;
int main()
{
  int n;
  std::cin>>n;
  int e=0,o=0;
  while(n){
    if((n%10)%2==0)
      e+=n%10;
    else
      o+=n%10;
    n=n/10;
  }
  if(o==e)
    std::cout<<"Yes";
  else
    std::cout<<"No";//Type your code here.
}