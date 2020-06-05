#include<iostream> 
int gcd(int a,int b,int small){ 
  if(small<1) 
    return 1;
  else{
    if(a%small==0 && b%small==0)
      return small; 
    small--;
    return gcd(a,b,small);
  }
}
int main()
{
  int a,b;
  std::cin>>a>>b;
  int small=((a<b)?a:b);
  std::cout<<"G.C.D of "<<a<<" and "<<b<<" = "<<gcd(a,b,small);//Type your code here.
}