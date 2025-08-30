#include<iostream>
#include<math.h>
using namespace std;
int main() {
    int ch;
    int  num1,num2;
    int a, b;



    cout<<"1. Addition "<<endl;
    cout<<"2. Subtraction "<<endl;
    cout<<"3. Multiplication "<<endl;
    cout<<"4. Division "<<endl;
    cout<<"5. Power "<<endl;
    cout<<"6. Square root "<<endl;
    cout<<"7. Exit"<<endl;


    cout<<"Enter the value of a : ";
    cin>>num1;
    
    cout<<"Enter the value of b : ";
    cin>>num2;

    cout<<"Operation what you want to excute :";
    cin>>ch;

    switch(ch) {
        case 1: 
        cout<<"Addition"<<num1+num2<<endl;
        break;
        case 2:
         cout<<"Subtraction\n"<<num1-num2;
        break;
        case 3: 
        cout<<"Mutliplication\n"<<num1*num2;
        break;
        case 4:
         cout<<"Division\n"<<num1/num2;
         break;
        case 5:
         cout<<pow(num1,num2);
         break;

        case 6:
        cout<<"Sqaure root of a"<<sqrt(num1)<<endl<<"Square root of b"<<sqrt(num2);
        break;

        
        default :
         cout<<"Invalid Choice";
    }
    
}