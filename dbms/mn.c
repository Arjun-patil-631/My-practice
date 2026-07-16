//write a c code to store n student details in a file
#include <stdio.h>
#include <stdlib.h>

struct Student {
    char name[50];
    int age;
    float marks;
};

int main() {
    FILE *file;
    char filename[100];
    int n, i;

    printf("Enter the filename to create: ");
    scanf("%s", filename);

    file = fopen(filename, "w");
    if (file == NULL) {
        printf("Error creating file!\n");
        return 1;
    }

    printf("Enter the number of students: ");
    scanf("%d", &n);

    struct Student students[n];

    for (i = 0; i < n; i++) {
        printf("Enter details for student %d:\n", i + 1);
        printf("Name: ");
        scanf("%s", students[i].name);
        printf("Age: ");
        scanf("%d", &students[i].age);
        printf("Marks: ");
        scanf("%f", &students[i].marks);

        fprintf(file, "Student %d:\n", i + 1);
        fprintf(file, "Name: %s\n", students[i].name);
        fprintf(file, "Age: %d\n", students[i].age);
        fprintf(file, "Marks: %.2f\n\n", students[i].marks);
    }

    fclose(file);
    printf("Student details added to %s successfully!\n", filename);

    return 0;
}

