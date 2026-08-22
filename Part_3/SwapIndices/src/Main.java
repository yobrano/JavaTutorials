

void main(){
    int[] numbers = new int[5];
    numbers[0] = 1;
    numbers[1] = 3;
    numbers[2] = 5;
    numbers[3] = 7;
    numbers[4] = 9;

    printNeatly(numbers);
    System.out.println();
    intSwapper(numbers);
    printNeatly(numbers);
    System.out.println("Total: "+ sumArray(numbers));
    printInStars(numbers);
}

void printNeatly(int[] numbers){
    System.out.print(numbers[0]);
    for(int i=1; i<numbers.length; i++){
        System.out.print(", "+numbers[i]);
    }
    System.out.println();
}


void printInStars(int[] numbers){

    for (int j=0;j<numbers[0];j++){
        System.out.print("*");
    }
    for(int i=1; i<numbers.length; i++){
        System.out.print(" ");
        for (int j=0;j<numbers[i];j++){
            System.out.print("*");
        }
    }
    System.out.println();
}

void checkIndex(int[] numbers, int index){
    if((index > (numbers.length -1 )) || (index <0)){
        System.out.println(index + "is out of index range.");
    }else{
        System.out.println(numbers[index] +" is at index "+ index);
    }
}
void intSwapper(int[] numbers){
    Scanner reader = new Scanner(System.in);
    System.out.println("What indices to swap [0-4]:");
    int index1 = Integer.valueOf(reader.nextLine());
    int index2 = Integer.valueOf(reader.nextLine());
    checkIndex(numbers, index1);
    checkIndex(numbers, index2);

    int temp = numbers[index1];
    numbers[index1] = numbers[index2];
    numbers[index2] = temp;

    checkIndex(numbers, index1);
    checkIndex(numbers, index2);

}

int sumArray(int[] numbers){
    int total =0;
    for(int number:numbers){
        total+= number;
    }

    return total;
}