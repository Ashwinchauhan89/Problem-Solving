#include <stdio.h>

int main() {
    int a;
    int b;
    int add;
  
    printf("Enter two numbers: ");
    scanf("%d %d", &a, &b);  // Accept space-separated input

    add = a + b;
    printf("Addition of the two numbers: %d\n", add);

    return 0;
}

