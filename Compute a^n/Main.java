#include<iostream>
using namespace std;
int power(int a,int n){
  if(n==1)
    return a;
  else
    return a*power(a,n-1);
}
int main()
{
  int a,n;
  std::cout<<"Enter the value of a";
  std::cin>>a;
  std::cout<<"\nEnter the value of n";
  std::cin>>n;
  std::cout<<"\nThe value of "<<a<<" power "<<n<<" is "<<power(a,n);//Type your code here.
}