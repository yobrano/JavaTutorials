
void main() {

    printChristmasTree(10);
}


void printStar(int number){
    for(int i=1;i<=number; i++){
        System.out.print("*");
    }
    System.out.println("");
}


void printSpace(int number){
    for(int i=1; i<=number; i++){
        System.out.print(" ");
    }
}

void printTriangle(int size){

    for(int i = 1; i <= size; i++){
        printSpace(size - i);
        printStar(i);
    }
}

void printChristmasTree(int size){

    for(int i = 1; i <= size; i++){
        printSpace(size - i);
        printStar(i+(i-1));
    }
    int trunkHeight =2;
    for(int i=1; i<=trunkHeight; i++){
        printSpace(size-2);
        printStar(3);
    }

}