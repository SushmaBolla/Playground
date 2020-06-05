#include<iostream>
#include<string.h>
using namespace std;
int main()
{
  char s1[200];
  gets(s1);
  int v=0,c=0,w=0,d=0,s=0,i;
  for(i=0;i<strlen(s1);i++){
    if(s1[i]==' ')
      w++;
    else if(s1[i]>='0' && s1[i]<='9')
      d++;
    else if((s1[i]>='A' && s1[i]<='Z')|| (s1[i]>='a' && s1[i]<='z')){
      if(s1[i]=='A' || s1[i]=='E' || s1[i]=='I' || s1[i]=='O' || s1[i]=='U' || s1[i]=='a' || s1[i]=='e' || s1[i]=='i' || s1[i]=='o' || s1[i]=='u')
        v++;
      else
        c++;
    }
    else
      s++;
  }
    std::cout<<"Vowels:"<<v<<"\nConsonants:"<<c<<"\nWhite Spaces:"<<w<<"\nDigits:"<<d<<"\nSymbols:"<<s;//Type your code here.
}