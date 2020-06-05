#include<iostream>
int main()
{
  int r,c,i,j;
  std::cin>>r>>c;
  int a[r][c];
  for(i=0;i<r;i++)
    for(j=0;j<c;j++)
      std::cin>>a[i][j];
  int b[r][c];
  for(i=0;i<r;i++)
    for(j=0;j<c;j++)
      std::cin>>b[i][j];
  for(i=0;i<r;i++){
    for(j=0;j<c;j++)
      std::cout<<a[i][j]+b[i][j]<<" ";
    std::cout<<"\n";
  }// Type your code here
}