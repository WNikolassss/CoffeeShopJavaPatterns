public class CashierProxy implements payMoney {
    public void calc(Integer cost) {
        System.out.println("Not enough money. You are too poor , bye.");
        System.exit(0);
    }
}