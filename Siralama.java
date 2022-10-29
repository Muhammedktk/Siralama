import java.util.Scanner;
public class Siralama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double a,b,c;
        System.out.print("a Rakamı Gir:");
        a= input.nextDouble();
        System.out.print("b Rakamı Gir:");
        b= input.nextDouble();
        System.out.print("c Rakamı Gir:");
        c= input.nextDouble();

        System.out.println("Sıralama Şöyledir:");

        if (a>b && a>c && b>c){
            System.out.println("a>b>c");
        } else if (a>b && a>c && c>b) {
            System.out.println("a>c>b");
        } else if (b>a && b>c && a>c ) {
            System.out.println("b>a>c");
        } else if (b>a && b>c && c>a) {
            System.out.println("b>c>a");
        } else if (c>a && c>b && a>b) {
            System.out.println("c>a>b");
        } else if (c>a && c>b && b>a) {
            System.out.println("c>b>a");
        }
    }
}
