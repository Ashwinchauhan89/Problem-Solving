#include<iostream>
using namespace std; 

class Myclass {

    public:

int length;

int breath;
int height;
int Area;


};

int main() {
   
   Myclass obj1;

   cout<<"Enter the value of length : ";
    obj1.length;
    cin>>obj1.length;
     
    cout<<obj1.length<<endl;

 cout<<"Enter the value of breath : ";
     obj1.breath;
     cin>>obj1.breath;
  
      cout<<obj1.breath<<endl;

       cout<<"Enter the value of height : ";

      obj1.height;
      cin>>obj1.height;
    

      cout<<obj1.height<<endl;

      obj1.Area=obj1.length*obj1.breath*obj1.height;
      

    
      cout<<"The area of cube: "<<obj1.length<<"*"<<obj1.breath<<"*"<<obj1.height<<"="<<obj1.Area<<endl;
}


 