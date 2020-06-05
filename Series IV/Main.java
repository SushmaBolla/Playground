#include<iostream>
using namespace std;
int main()
{
  int n,i=1;
  std::cin>>n;
  while(n){
    if(i%2==0)
      std::cout<<i*i-2;
    else
      std::cout<<i*i-1;
    std::cout<<" ";
    i++;
    n--;
  }//Type your code here.
}