import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Xos gelmisi ededi daxil edin");
        int a= sc.nextInt();
        Random rnd =new Random();
       int c= rnd.nextInt(100);


        if (a==c) {
            System.out.println("daxil etdiyiniz eded beraberdir=  " +c);
        }else if(a>c){
            System.out.println("daxil etdiyini eded boyukdur=  " +c);
        }else if(a<c){
            System.out.println("daxil etdiyini eded kicikdir=  " +c);

        }else
            System.out.println("daxil etdiyini eded yalnisdir");

    }
}