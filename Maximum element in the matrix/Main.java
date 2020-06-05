#include<iostream>
using namespace std;
int main()
{
  int r,c,i,j;
  std::cin>>r>>c;
  int m=0;
  int a;
  for(i=0;i<r;i++)
    for(j=0;j<c;j++){
      std::cin>>a;
      if(a>m)
        m=a;
    }
  std::cout<<"The maximum element is "<<m;//Type your code here.
}