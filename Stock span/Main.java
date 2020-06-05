#include<iostream>
using namespace std;
int main()
{
  int n;
  std::cin>>n;
  int k;
  int i,l=2,s=0;
  std::cout<<"1\n";
  for(i=0;i<n;i++){
    std::cin>>k;
    if(s>k)
      std::cout<<"1\n";
    else{
      if(i!=0){
        std::cout<<l<<"\n";
        l+=2;
      }
    }
    s=k;
  }//Type your code here.
}