#include<iostream>
#include<cstdlib>
int main(){
  int n,n1,i,o=0,e=0; 
  std::cin>>n;
  int *a=(int*)malloc(n*sizeof(int));
  for(i=0;i<n;i++){
    std::cin>>*(a+i);
    n1=*(a+i);
    if(n1%2==0)
      e++;
    else
      o++;
  }
  std::cout<<o<<"\n"<<e;// Type your code here
  return 0;
}