#include<iostream>
using namespace std;
int main()
{
  int i,j,m,r,c;
  std::cin>>r>>c;
  int a[r][c];
  for(i=0;i<r;i++){
    m=0;
    for(j=0;j<c;j++){
      std::cin>>a[i][j];
      if(a[i][j]>m)
        m=a[i][j];
    }
    std::cout<<m<<"\n";
  }//Type your code here.
}