#include<iostream>
using namespace std;
int main()
{
  int r,c;
  std::cin>>r>>c;
  int i,j,a[r][c],b[r][c];
  for(i=0;i<r;i++){
    for(j=0;j<c;j++){
      std::cin>>a[i][j];
    }
  }
  for(i=0;i<r;i++){
    for(j=0;j<c;j++)
      std::cin>> b[i][j];
  }
  for(i=0;i<r;i++){
    for(j=0;j<c;j++)
      std::cout<<a[i][j]+b[i][j]<<" ";
    std::cout<<"\n";
  }//Type your code here.
}