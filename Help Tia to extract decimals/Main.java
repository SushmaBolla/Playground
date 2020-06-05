#include<iostream>
#include<string>
int main() 
{ 
  int f;
  std::string s; 
  std::string substr=".";
  std::getline(std::cin,s);
  if (s.find(substr) != std::string::npos) {
    size_t pos = s.find('.');    
    std::string str3 = s.substr (pos+1);
    std::cout<<"Floating part is : "<<str3;
  }
  else
    std::cout<<"Floating part is : ";

}
	//Type your code here
