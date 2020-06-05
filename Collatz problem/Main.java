#include<iostream>
using namespace std;
int main()
{
  int n;
  std::cin>>n;
  int n1=0;
  while(n!=1){
    std::cout<<n<<"\n";
    if(n%2==0)
      n=n/2;
    else
      n=3*n+1;
    n1++;
  }
  std::cout<<"1\n"<<n1;//Type your code here.
}