#include<iostream>
using namespace std;
int main()
{
  int n;
  std::cin>>n;
  int a=0,b=1,c;
  n=n-2;
  while(n){
    c=a+b;
    a=b;
    b=c;
    n--;
  }
  std::cout<<c;//Type your code here.
}