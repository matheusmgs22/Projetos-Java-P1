import java.util.Scanner;

public class condicionaisComposta2 {
    
    public static  void main (String[] args){

        Scanner in = new Scanner(System.in);

        int X,A,B,C,D;

        A = 2;
        B = 3;
        C = 5;     
        D = 9;

        if (A >= 2 || C <= 1) { 
            X = (A + D) / 2; 
           } else { 
            X = D * C; 
            }  
            System.out.print(X);           
           
    }

}
