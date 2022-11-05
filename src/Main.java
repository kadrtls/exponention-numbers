import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int base,exp,total=1;
        System.out.println("üslü sayı hesaplama programına hoşgeldiniz");
        Scanner scanner=new Scanner(System.in);
        System.out.println("üssü alınacak sayıyı giriniz:");
        base= scanner.nextInt();
        System.out.println("üs olacak sayıyı giriniz:");
        exp= scanner.nextInt();
        for (int i=0;i<exp;i++){
           total*=base;
        }
        System.out.println(base+" üssü "+exp+":"+total);
    }
}