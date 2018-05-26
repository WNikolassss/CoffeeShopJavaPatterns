public class CashierMachine implements payMoney {
    public void calc(Integer cost) {
        Chain chainCalc1 = new payCash();
        Chain chainCalc2 = new payCard();

        chainCalc1.setNextChain(chainCalc2);

        chainCalc1.calculate(cost,Program.cash,Program.cash);

        System.exit(0);
    }

    public int getCash(){
        return Program.cash;

    }

    public int getCard(){
        return Program.card;

    }
}
