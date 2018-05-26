public class DrinkFactory{

    static public Product makeDrink(int key){

        switch (key){
            case 1:
                return new SimpleCoffee("default");
            case 2:
                return new Tea();
            case 3:
                return new Lemonade();
             default:
                 return null;
        }
    }
}