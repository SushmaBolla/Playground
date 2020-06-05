#include<iostream>
using namespace std;
int main()
{
  int n1,n2,n3,n4;
  std::cin>>n1>>n2>>n3>>n4;
  int n=n1+n3;
  int n0=n2+n4;
  while(n0>100){
    n0-=100;
    n++;
  }
  std::cout<<n<<"\n"<<n0;//Type your code here.
}