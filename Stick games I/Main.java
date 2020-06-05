#include<iostream>
using namespace std;
int main()
{
  int n,m;
  std::cin>>n>>m;
  int res;
  res=(n<m)?n:m;
  std::cout<<((res%2==0)?"Mani Iyer":"Arun Gupta");//Type your code here.
}