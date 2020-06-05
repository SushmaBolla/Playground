#include<iostream>
using namespace std;
int main()
{
  int n;
  std::cin>>n;
  int o=0,e=0;
  int m;
  for(int i=0;i<n;i++){
    std::cin>>m;
    if(m%2==0)
      e+=m;
    else
      o+=m;
  }
  std::cout<<"The sum of the even numbers in the array is "<<e<<"\nThe sum of the odd numbers in the array is "<<o;
  //Type your code here.
}