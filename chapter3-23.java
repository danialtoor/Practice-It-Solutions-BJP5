//Write a method called printIndexed that accepts a String as its parameter and prints the String's characters in order followed by 
//their indexes in reverse order. For example, the call of printIndexed("ZELDA"); should print Z4E3L2D1A0 to the console.


public static void printIndexed(String word){
    String emptyString = "";
    int reversedNum = 0;
    for (int i = 0; i < word.length() ; i++){
        reversedNum = ((word.length() - 1) - word.indexOf(word.charAt(i)));
        emptyString = emptyString + word.charAt(i) + reversedNum;
    }
    System.out.print(emptyString);
}
