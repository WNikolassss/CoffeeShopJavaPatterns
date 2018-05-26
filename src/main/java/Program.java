import java.util.Scanner;

public class Program {
    public static int cash;
    public static int card;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 1;

        System.out.println("Enter how much cash money do you have");
        cash = scanner.nextInt();
        System.out.flush();

        System.out.println("Enter how much card money do you have");
        card = scanner.nextInt();
        System.out.flush();


        Menu menu = new Menu();
        while(choice != 9){
            choice = scanner.nextInt();
            menu.recogniseEvent(choice);
        }
    }
}


