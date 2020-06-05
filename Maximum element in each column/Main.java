#include<iostream>
using namespace std;
int main()
{
  int r,c,i,j;
  std::cin>>r>>c;
  int a[r][c];
  for(i=0;i<r;i++)
    for(j=0;j<c;j++)
      std::cin>>a[i][j];
  for(i=0;i<c;i++){
    int m=0;
    for(j=0;j<r;j++){
      if(a[j][i]>m)
        m=a[j][i];
    }
    std::cout<<m<<"\n";
  }//Type your code here.
}