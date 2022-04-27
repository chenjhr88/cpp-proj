#include <stdio.h>
#include <stdlib.h>
#include <string.h>

const double nairuInf = 2.4;
const double nairuUnemp = 3.5;

int inflation(){
    double prevInfRate;
    double curInfRate;

    printf("Please enter the following information to determine the state of the economy\nPrevious month's posted inflation rate: ");
    scanf("%lf", &prevInfRate);
    printf("This month's posted inflation rate: ");
    scanf("%lf", &curInfRate);
    if((prevInfRate - curInfRate) > .5){
        return 2;
    }
    else if((prevInfRate - curInfRate) < -.5){
        return 0;
    }
    else{
        return 1;
    }
}


int unemployment(){
    double prevUnemRate;
    double curUnemRate;

    printf("Previous month's posted unemployment rate: ");
    scanf("%lf", &prevUnemRate);
    printf("This month's posted unemployment rate: ");
    scanf("%lf", &curUnemRate);
    if((prevUnemRate - curUnemRate) > .5){
        return 2;
    }
    else if((prevUnemRate - curUnemRate) < -.5){
        return 0;
    }
    else{
        return 1;
    }
}

void compare(){

    int unemployment();
    int inflation();

    int y = inflation();
    int x = unemployment();

    if(x + y == 4){
        printf("Yikes economy not doing too hot");
    }
    else if(x + y >= 3){
        printf("Economy is ok");
    }
   /* else{
        printf("Let's go! The economy is doing fairly well.");
    }
    */
}

int main() {
    
    compare();    
    return 0;

}