#include<iostream>
using namespace std;
int main()
{
  int s,i,j,r,c;
  std::cin>>r>>c;
  int a[r][c];
  for(i=0;i<r;i++){
    s=0;
    for(j=0;j<c;j++){
      std::cin>>a[i][j];
      s+=a[i][j];
    }
    std::cout<<s<<"\n";
  }//Type your code here.
}