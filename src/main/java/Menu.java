import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    private State state;
    private ArrayList<Product> cart;
    private int cost;

    Menu() {
        cart = new ArrayList<Product>();
        state = new onEnter(this);
        cost = 0;
        operate();
    }

    public void recogniseEvent(int key) {
        if(state.getClass().equals(onEnter.class)) {
            switch (key) {
                case 1:
                    mealMenu menu = new mealMenu(this);
                    this.changeStateTo(menu);
                    break;
                case 2:
                    sandwichMenu menu1 = new sandwichMenu(this);
                    this.changeStateTo(menu1);
                    break;
                case 3:
                    payMoney payment;
                    if((Program.cash + Program.card) >= cost){
                        payment = new CashierMachine();
                    }else{
                        payment = new CashierProxy();
                    }
                    payment.calc(cost);
                    return;
            }
        }else if(state.getClass().equals(mealMenu.class)){
            if(key == 0){
                this.changeStateTo(new onEnter(this));
            }else if(key > 0 && key < 4){
                Product product = DrinkFactory.makeDrink(key);

                if(key == 1){
                    System.out.println("Would you like to add honey? \n 1.Yes \n 2.No");
                    Scanner scanner = new Scanner(System.in);
                    int choice = scanner.nextInt();

                    if(choice == 1){
                        product = new CoffeeHoney(((Coffee) product));
                    }else if(choice == 2){
                        System.out.println("It is sad :(");
                    }
                }
                assert product != null;
                cost += product.price;
                cart.add(product);
                }
        }else  if(state.getClass().equals(sandwichMenu.class)){
            SandwichCooker sc = new SandwichCooker();
            SandwichBuilder sb = null;

            if(key == 1){
                sb = new SoftSandwichBuilder();
            }else if(key == 2){
                sb = new SpicySandwichBuilder();
            }else if (key == 0){
                this.changeStateTo(new onEnter(this));
                return;
            }
            sc.setSandwichBuilder(sb);
            sc.cookSandwich();

            Sandwich sd = sc.getSandwich();
            cost += sd.price;
            cart.add(sd);

            System.out.println("Do you want one more? \n 1.Yes \n 2.No");
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();

            if(choice == 1){
                Sandwich clone = sd.copy();
                cost += clone.price;
                cart.add(clone);
            }else if(choice == 2){
                System.out.println("It is sad :(");
            }
        }
        calculateCart();
    }

    private void changeStateTo(State newState) {
        this.state = newState;
        this.state.operate();
    }

    private void operate(){
        this.state.operate();
    }

    private void calculateCart(){
        System.out.println("\n Current cart: \n");

        for(Product dr : cart){
            System.out.println(dr.getClass().getName());
        }
        System.out.println(" _____ \n");
        System.out.printf("\n Cost to pay: %d$ \n",cost);
    }
}