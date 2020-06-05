#include<iostream>
main(){
  int n;
  float c=0.5;
  std::cin>>n;
  while(n){
    n--;
    std::cout<<c<<" ";
    c*=3;
  }
}