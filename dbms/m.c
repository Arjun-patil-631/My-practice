//write a c program to create a new file and add student in it
#include <stdio.h>
#include <stdlib.h>

int main() {
    FILE *file;
    char filename[100];
    char name[50];
    int age;
    float marks;

    printf("Enter the filename to create: ");
    scanf("%s", filename);

 
    file = fopen(filename, "w");
    if (file == NULL) {
        printf("Error creating file!\n");
        return 1;
    }

    printf("Enter student name: ");
    scanf("%s", name);
    printf("Enter student age: ");
    scanf("%d", &age);
    printf("Enter student marks: ");
    scanf("%f", &marks);

    fprintf(file, "Name: %s\n", name);
    fprintf(file, "Age: %d\n", age);
    fprintf(file, "Marks: %.2f\n", marks);

    fclose(file);
    
    printf("Student details added to %s successfully!\n", filename);
    
    return 0;
}