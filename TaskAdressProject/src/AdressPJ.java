import java.util.Scanner;

public class AdressPJ {
    public static void main(String[] args) {
        String name, address;
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your name?");
        name = sc.nextLine();
        System.out.println("Where are you live?, " + name);
        address = sc.nextLine();
        System.out.print("OK, you are:\n " + name + " from " + address);

    }
}
