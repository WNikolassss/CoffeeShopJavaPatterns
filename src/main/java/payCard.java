public class payCard implements Chain {

    private Chain nextInChain;

    public void setNextChain(Chain nextChain) {

        nextInChain = nextChain;

    }

    public void calculate(Integer cost,Integer cash,Integer card) {

        if ((cash + cash) >= cost) {

            System.out.printf("Paid by cash %d$ \n",cash);
            cash = Math.abs(cash - cost);
            System.out.printf("Paid by card %d$ \n",cash);

        } else {
            System.out.print("Some Error");
        }
    }
}