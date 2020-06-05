#include<iostream>
using namespace std;
int main()
{
  int r,c,i,j,m;
  std::cin>>r>>c;
  int a[r][c],a1[r],b[c];
  for(i=0;i<r;i++){
    m=0;
    for(j=0;j<c;j++){
      std::cin>>a[i][j];
      m+=a[i][j];
    }
    if(i==0)
      std::cout<<"Sum of rows is";
    std::cout<<" "<<m;
    a1[i]=m;
  }
  m=0;
  for(i=0;i<r;i++)
    if(a1[i]>m){
      m=a1[i];
      j=i;
    }
  std::cout<<"\nRow "<<j+1<<" has maximum sum\n";
  for(i=0;i<c;i++){
    m=0;
    for(j=0;j<r;j++)
      m+=a[j][i];
    if(i==0)
      std::cout<<"Sum of columns is";
    std::cout<<" "<<m;
    b[i]=m;
  }
  m=0;
  for(i=0;i<c;i++)
    if(b[i]>m){
      m=b[i];
      j=i+1;
    }
  std::cout<<"\nColumn "<<j<<" has maximum sum";//Type your code here.
}