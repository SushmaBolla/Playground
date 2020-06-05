#include<iostream>
int gcd(int n1,int n2,int n3,int a){
  int small=((n1<n2)?((n1<n3)?n1:n3):((n2<n3)?n2:n3));
  while(small>=1){
    if(n1%small==0 && n2%small==0 && n3%small==0)
      if(small==a)
        return 1;
    small--;   
  }
  return -1;
}
int main(){ 
  int n1,n2,n3,a;
  std::cin>>n1>>n2>>n3>>a;
  if(gcd(n1,n2,n3,a)==1)
    std::cout<<"Answer is correct.";
  else
    std::cout<<"Answer is wrong.";
}
