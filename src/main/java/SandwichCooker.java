class SandwichCooker {
    private SandwichBuilder sandwichBuilder;

    public void setSandwichBuilder(SandwichBuilder sandwichBuilder) {
        this.sandwichBuilder = sandwichBuilder;
    }

    public Sandwich getSandwich() {
        return sandwichBuilder.getSandwich();
    }

    public void cookSandwich() {
        sandwichBuilder.createNewSandwich();
        sandwichBuilder.putMeat();
        sandwichBuilder.putSauce();
        sandwichBuilder.putVegetables();
    }
}