#include<iostream> 
int digitroot(int n){ 
  int i=0;
  while(n){
    i+=n%10;
    n=n/10;
  }
  n=i;
  if(n<=9)
    return n;
  else
    return digitroot(n);
}
int main(){
  int n;
  std::cin>>n;
  std::cout<<digitroot(n);
}