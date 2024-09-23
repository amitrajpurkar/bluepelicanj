package bpj.lesson11;

public class Exercises {

    public static void main(String[] args) {    
        System.out.println("Hello World");
        System.out.print("Exercise 7: ");
        exer07();
        System.out.print("\nExercise 8: ");
        exer08();
        System.out.println("\nExercise 9: "+exer09());
        System.out.println("Exercise 10: in for-loop the part in parentheses that terminates the loop is called Control-Expression");
        System.out.print("Exercise 11: ");
        exer11();
        System.out.println("\nExercise 12: "+exer12());
        System.out.println("Exercise 13: worst problem can be not terminating the loop, but can be infinite loop");
        System.out.println("Exercise 14: "+exer14());
    }

    private static void exer07() {
        for(int i=3;i<30;i*=2){
            System.out.print(i + ", ");
        }
    }

    private static void exer08() {
        for(int i=24;i>1;i/=2){
            System.out.print(i + ", ");
        }
    }

    private static String exer09() {
        int k=0;
        for(int j=0;j<=10;j++){
            if(j==5){
                break;
            } else{
                k++;
            }
        }
        return String.valueOf(k);
    }

    private static void exer11() {
        int i, j;
        for(i=0;i<10;i++){
            j = 1/2;
            System.out.print(j+", ");
        }
    }

    private static String exer12() {
        int r=0, j;
        for(j=1;j<10;j=j*2) 
            r =2 * j;
        return String.valueOf(r);
    }

    private static String exer14() {
        int counter=0;
        for(int p=9; p<=145; p++){
            ++counter;
        }
        return String.valueOf(counter);
    }

}
