#include<iostream>
using namespace std;
int main()
{
  int a,i;
  float b=0;
  for(i=0;i<3;){
    std::cin>>a;
    if(a<0){
      b--;
      break;
    }
    else if(a%2==0)
      b-=0.5;
    else{
      b++;
      i++;
    }
  }
  std::cout<<b;//Type your code here.
}