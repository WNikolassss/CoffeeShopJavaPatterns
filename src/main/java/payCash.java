public class payCash implements Chain {

    private Chain nextInChain;

    public void setNextChain(Chain nextChain) {

        nextInChain = nextChain;

    }

    public void calculate(Integer cost,Integer cash,Integer card) {

        if (cash >= cost) {
            cash = cash - cost;
            System.out.printf("Paid by cash %d ",cost);

        } else {
            nextInChain.calculate(cost,cash,card);
        }
    }
}