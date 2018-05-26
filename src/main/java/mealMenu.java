public class mealMenu implements State {

    private Menu menu;

    public mealMenu(Menu menu) {
        this.menu = menu;
    }

    public void operate() {
        System.out.flush();
        System.out.println("Do you want some drink?");
        System.out.println("1.Coffee");
        System.out.println("2.Tea");
        System.out.println("3.Lemonade");
        System.out.println("0.Back");

    }

}