#include<iostream>
#include<string.h>
using namespace std;
int main()
{
  char s[50], r[50],s1[50];;
  int begin, end, count = 0;
  gets(s);
  gets(s1);// Calculating string length
  while (s[count] != '\0')
    count++;
  end = count - 1;
  for (begin = 0; begin < count; begin++) {
    r[begin] = s[end];
    end--;
  }
  r[begin] = '\0';
  if(strcmp(r,s1)==0)
    std::cout<<"It is correct";
  else
    std::cout<<"It is wrong";//Type your code here.
}