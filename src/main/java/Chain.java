public interface Chain {

    public void setNextChain(Chain nextChain);

    public void calculate(Integer cost,Integer cash,Integer card);

}