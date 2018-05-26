public class sandwichMenu implements State {

    private Menu menu;

    public sandwichMenu(Menu menu) {
        this.menu = menu;
    }

    public void operate() {
        System.out.flush();
        System.out.println("Do you want some sandwich?");
        System.out.println("1.Soft");
        System.out.println("2.Spicy");
        System.out.println("0.Back");
    }
}