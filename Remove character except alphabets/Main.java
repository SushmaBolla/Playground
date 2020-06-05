#include<iostream>
#include<string.h>
using namespace std;
int main()
{
  char s1[200],s2[100];
  std::cin>>s1;
  int i;
  int j=0,count=0;
  while (s1[count] != '\0')
      count++;
  for(i=0;i<count;i++)
    if((s1[i]>='a' && s1[i]<='z')||(s1[i]>='A' && s1[i]<='Z')){
      s2[j]=s1[i];
      j++;
    }
  s2[j]='\0';
  std::cout<<(s2);
  //Type your code here.
}