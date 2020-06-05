#include<iostream>
using namespace std;
int main()
{
  int r,c,i,j;
  std::cin>>r>>c;
  int a[r][c];
  for(i=0;i<r;i++)
    for(j=0;j<c;j++){
      std::cin>>a[i][j];
    }
  int rw=0,cw=0,dg=0;
  for(i=0;i<=0;i++){
    for(j=0;j<c-1;j++)
      rw+=a[i][j];
  }
  for(j=c-1;j==c-1;j--)
    for(i=0;i<r;i++)
      cw+=a[j][i];
  for(i=0;i<r;i++){
    for(j=0;j<c;j++){
      if(i+j==r-1)
        dg+=a[i][j];
      if(j==0 && i==r-1)
        cw-=a[i][j];
    }
      
  }
  std::cout<<"Sum of Zig-Zag pattern is "<<rw+cw+dg;//Type your code here.
}