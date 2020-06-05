#include<iostream>
#include<cmath>
main(){
  int n;
  std::cin>>n;
  int c=11;
  while(n){
    n--;
    std::cout<<c*c<<" ";
    c+=4;
  }
}