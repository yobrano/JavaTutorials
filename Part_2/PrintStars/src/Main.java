//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    printTriangle(20 );
}


void printStars(int number){

    for(int i = 0; i < number; i++){
        System.out.print("*");
    }
    System.out.println("");
}

void printSquare(int rows){
    for(int i = 0; i < rows; i++){
        printStars(rows);
    }
}

void printTriangle(int size){
    for(int i = 1; i <= size; i++){
        printStars(i);
    }
}

void printRectangle(int width, int height){
    for(int i= 0; i< height; i++){
        printStars(width);
    }
}
