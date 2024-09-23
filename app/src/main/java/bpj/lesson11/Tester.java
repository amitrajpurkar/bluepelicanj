package bpj.lesson11;

public class Tester {

    public static void main(String[] args) {
        System.out.println("Hello World");

        // exercise 1
        String input = "Peter Ustinov";
        System.out.println(input);
        System.out.println(reverseText(input));

        System.out.println("Contest 1: "+contest1());
        System.out.println("Contest 2: "+contest2());
        System.out.println("Contest 3: "+contest3());
        System.out.println("Contest 4: ");
        contest4();
        System.out.println("Contest 5: "+"ENDLESS LOOP; dont fire this.. you will need to kill process");//contest5()
        System.out.println("Contest 6: "+contest6());
        System.out.println("Contest 7: ");
        contest7();
    }

    private static String reverseText(String input){
        String s="";
        for(int i=input.length()-1;i>=0;i--){
            s=s+input.charAt(i);
        }
        return s.toLowerCase();
    }

    private static String contest1(){
        int sum=0;
        for(int i=0;i<5;i++){ 
            sum+=i;
        }

        return String.valueOf(sum);
    }

    private static String contest2(){
        double kk=3;
        int j=0;
        for( j=0;j<=100;j++){
            kk=kk+ Math.pow(j, 2);
            ++kk;
        }
        return String.valueOf(j);
    }

    private static String contest3(){
        double p=0;
        for(int m=10;m>6;--m){ 
            if(m==7){
                p=p+m;
            }else{
                ++p;
            }
        }
        return String.valueOf(p);
    }

    private static void contest4(){ 
        System.out.print("option A: ");
        for(int j=0;j<=9;j++){ System.out.print(""+j+", ");  } System.out.println("");
        System.out.print("option B: ");
        for(int j=1;j<10;j=j+2){ System.out.print(""+j+", ");  } System.out.println("");
        System.out.print("option C: ");
        for(int j=1;j<=9;j+=1){ System.out.print(""+j+", ");  } System.out.println("");
        System.out.print("option D: ");
        for(int j=1;j<=9;j+=2){ System.out.print(""+j+", ");  } System.out.println("");
    }

    //NOTE: this is an endless loop
    private static String contest5(){
        double x=0;
        for(int b=0;b<101;b++){ 
            x=x+1;
            b--;
        }
        return String.valueOf(x);
    }

    private static String contest6(){
        int p, q=5;
        for(p=0;p<5;p++);
            q=q+1;
        return String.valueOf(p + " " + q);
    }

    private static void contest7(){
        int j, k;
        int count=0;
        for(j=0;j<4;j++){
            for(k=0;k<10;k++){
                count++;
            }
        }
        System.out.print(count-- );
        System.out.println(" -- "+count);
    }
}
