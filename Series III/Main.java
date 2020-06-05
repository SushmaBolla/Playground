#include<iostream>
int main(){
  int n,c=6,i=0;
  std::cin>>n;
  while(n){
    n--;
    std::cout<<c<<" ";
    i++;
    c+=5*i;
  }
}