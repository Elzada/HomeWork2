import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Scanner in = new Scanner(System.in);

        String name = "Anna";
        // int vozrast ;
        //int temperatyra ;
        //Scanner in = new Scanner(System.in);
        System.out.println(name);


        System.out.print("Input age: ");
        int age = in.nextInt();

        System.out.print("Input temperatyra : ");
        int temperatyra = in.nextInt();

        if ((temperatyra > 30 || temperatyra < -20) && (age > 20 && age < 45)) {
            System.out.println("Человек не выходит гулять ");

        } else {
            System.out.println("Человек отправляется в гости к своему другу");
        }

        if ((temperatyra > 0 && temperatyra < 28) && (age < 20)) {
            System.out.println("Человек не выходит гулять");
        } else {
            System.out.println("Человек отправляется в гости к своему другу");
        }

        if ((temperatyra > -10 && temperatyra < 25) && (age > 45)) {
            System.out.println("Человек не выходит гулять");
        } else {
            System.out.println("Человек отправляется в гости к своему другу");
        }
    }
}