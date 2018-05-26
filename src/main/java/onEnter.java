public class onEnter implements State {

    private Menu menu;

    public onEnter(Menu menu) {
        this.menu = menu;
    }

    public void operate() {
        System.out.flush();
        System.out.println("Welcome to our Coffee shop");
        System.out.println("1.Drink menu");
        System.out.println("2.Sandwich");
        System.out.println("3.Pay and exit");
        System.out.println("9.Terminate");
    }
}