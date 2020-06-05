#include<iostream>
using namespace std;
int main()
{
  int n;
  std::cin>>n;
  int n1=n,sum=0;
  while(n){
    sum+=n%10;
    n=n/10;
  }
  if(n1%sum==0)
    std::cout<<"Harshad Number";
  else
    std::cout<<"Not Harshad Number";//Type your code here.
}