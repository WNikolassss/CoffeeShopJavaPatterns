abstract class SandwichBuilder{
    protected Sandwich sandwich;

    public Sandwich getSandwich() {
        return sandwich;
    }

    public void createNewSandwich() {
        sandwich = new Sandwich();
    }

    public abstract void putVegetables();
    public abstract void putMeat();
    public abstract void putSauce();
}