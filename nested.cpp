#include<iostream>
using namespace std;
int main()
{
    int age;
    cout<<"Enter your age\n";
    cin>>age;
    if(age>=18) {
        if(age>=18 && age<=69) {
            cout<<"This age verified for the organization work.\n";
        }
        else {
            cout<<"This age not egilible for the organization work.\n ";
        }
    }
    else {
        cout<<"this age is minor";
    }
    return 0;
}