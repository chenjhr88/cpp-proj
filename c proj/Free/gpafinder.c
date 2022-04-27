#include <stdio.h>
#include <string.h>

int main() {
    
    //constants
    const int a = 4;
    const int b = 3;
    const int c = 2;
    const int d = 1;

    //variables
    int runningtot = 0;
    double gpa;
    char letter[100] = "";
    char *ca;
    char *cb;
    char *cc;
    char *cd;
    int length = 0;

    printf("Welcome to the gpa finder \nType in each letter grade received in school in a string of characters\n");
    fgets(letter, 100, stdin);
    
    ca = strchr(letter,'a');
    while (ca != NULL) { 
        runningtot += a;
        length++;
        ca = strchr(ca+1,'a');
    }
    cb = strchr(letter,'b');
    while (cb != NULL) { 
        runningtot += b;
        length++;
        cb = strchr(cb+1,'b');
        
    }
    cc = strchr(letter,'c');
    while (cc != NULL) { 
        runningtot += c;
        length++;
        cc = strchr(cc+1,'c');
    }
    cd = strchr(letter,'d');
    while (cd != NULL) { 
        runningtot++;
        length++;
        cd = strchr(cd+1,'d');
    }

    //find and print gpa
    gpa = (double) runningtot/length;
    printf("Your gpa is %f\n", gpa);
    
    if(gpa == 4){
        printf("You are doing ok");
    }
    else if(gpa < 4 && gpa >= 3.6){
        printf("This is a subpar performance");
    }
    else{
        printf("You need to pick it up...");
    }

    return 0;

}