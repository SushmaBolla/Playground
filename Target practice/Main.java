#include<iostream>
using namespace std;
int main()
{
  int n,a;
  int c=0,s=0;
  std::cin>>a;
  do{
    c++;
    std::cin>>n;
    s+=n;
  }while(s<a);
  std::cout<<"The number of turns is "<<c;//Type your code here.
}