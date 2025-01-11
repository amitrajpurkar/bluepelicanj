package bpj.lesson39;

public class Exercises {
    public static void main(String[] args) {
        System.out.println("Lesson 39: Complexity Analysis");

        //18 of them
        exer01();
        exer02();
        exer03();
        exer04();
        exer05();

        exer06();
        exer07();
        exer08();
        exer09();
        exer10();

        exer11();
        exer12();
        exer13();
        exer14();
        exer15();
        
        exer16();
        exer17();
        exer18();
    }


    private static void exer01(){
        System.out.println("Exercise 01");
        System.out.println("Q: what is the Big O value for a sequential search on an unordered list?");
        System.out.println("Ans: O(n)");

        System.out.println("-------------------");
    }

    private static void exer02(){
        System.out.println("Exercise 02");
        System.out.println("Q: what requirement must we impose on a list before we can apply a binary search to it?");
        System.out.println("Ans: the list must be sorted");
        System.out.println("-------------------");
    }

    private static void exer03(){
        System.out.println("Exercise 03");
        System.out.println("Q: what is the time complexity of a binary search on an ordered list?");
        System.out.println("Ans: O(log n)");
        System.out.println("-------------------");
    }

    private static void exer04(){
        System.out.println("Exercise 04");
        System.out.println("Q: suppose an algorith with a Big O value of O(n^2) has a runtime of 20 sec for n=5000, what will be the runtime for n=10000?");
        System.out.println("Ans: 400 sec");
        System.out.println("-------------------");
    }

    private static void exer05(){
        System.out.println("Exercise 05");
        System.out.println("Q: what is the Big O value for: for(int j=0; j<n+5; j++)?");
        System.out.println("Ans: O(n)");
        System.out.println("-------------------");
    }

    private static void exer06(){
        System.out.println("Exercise 06");
        System.out.println("Q: what is the Big O value for: for(int j=0; j<n+5; j++) for(int k=0; k<n; k+=8) for(int z=0; z<=(n*n);z++)?");
        System.out.println("Ans: O(n^3)");
        System.out.println("-------------------");
    }

    private static void exer07(){
        System.out.println("Exercise 07");
        System.out.println("Q: what is the Big O value for: for(int j=0; j<n-5; j++) for(int k=0; k<7; k++) ?");
        System.out.println("Ans: O(n)");
        System.out.println("-------------------");
    }

    private static void exer08(){
        System.out.println("Exercise 08");
        System.out.println("Q; what is the Big O value for: for(int j=2; j< n+5; j*=7) ?");
        System.out.println("Ans: O(log n)");
        System.out.println("-------------------");
    }

    private static void exer09(){
        System.out.println("Exercise 09");
        System.out.println("Q: there are two types of complexity analysis. what two things can be analysed?");
        System.out.println("Ans: time and space");
        System.out.println("-------------------");
    }

    private static void exer10(){
        System.out.println("Exercise 10");
        System.out.println("Q: which of the two complexiy types does Big O analysis focus on?");
        System.out.println("Ans: time");
        System.out.println("-------------------");
    }

    private static void exer11(){
        System.out.println("Exercise 11");
        System.out.println("Q: suppose time complexity analysis yields 5000n^2 + (1/1000)n^3 + n -2; what would be the Big O value?");
        System.out.println("Ans: O(n^3)");
        System.out.println("-------------------");
    }

    private static void exer12(){
        System.out.println("Exercise 12");
        System.out.println("Q: will  a O(n) algorithm generally win in time race over O(n^3) algorithm?");
        System.out.println("Ans: no");
        System.out.println("-------------------");
    }

    private static void exer13(){
        System.out.println("Exercise 13");
        System.out.println("Q: which is generally faster for a large value of n: O(log n) or O(n^3) algorithm?");
        System.out.println("Ans: O(log n)");
        System.out.println("-------------------");
    }

    private static void exer14(){
        System.out.println("Exercise 14");
        System.out.println("Q: an algorithm has time complexity of the order 2^n. how many times more slowly would this algorith run when n=200, as compared to n=100?");
        System.out.println("Ans: 4 times");
        System.out.println("-------------------");
    }

    private static void exer15(){
        System.out.println("Exercise 15");
        System.out.println("Q: what is the Big O value for: for(int j=0; j<n-5; j++) for(int k=0; k<n; k++) ?");
        System.out.println("Ans: O(n)");
        System.out.println("-------------------");
    }

    private static void exer16(){
        System.out.println("Exercise 16");
        System.out.println("Q: what is the Big O value for: for(int j=0; j<n; j++) for(int k=j; k<n; k++) ?");
        System.out.println("Ans: O(n^2)");
        System.out.println("-------------------");
    }

    private static void exer17(){
        System.out.println("Exercise 17");
        System.out.println("Q: from the following table determine the time complexity of the algorithm");
        System.out.println("Number of times the loop iterates | Time (sec)");
        System.out.println("1000 | 5");
        System.out.println("2000 | 20");
        System.out.println("4000 | 80");
        System.out.println("Ans: O(n^2)");
        System.out.println("Ans: O(n)");
        System.out.println("-------------------");
    }

    private static void exer18(){
        System.out.println("Exercise 18");
        System.out.println("Q: from the following table determine the time complexity of the algorithm");
        System.out.println("Number of times the loop iterates | Time (sec)");
        System.out.println("1000 | 5");
        System.out.println("2000 | 10");
        System.out.println("6000 | 30");
        System.out.println("Ans: O(n^2)");
        System.out.println("-------------------");
    }
}
