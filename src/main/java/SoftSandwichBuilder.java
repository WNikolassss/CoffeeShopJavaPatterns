class SoftSandwichBuilder extends SandwichBuilder {
    public void putMeat() {
        sandwich.addChicken();
    }
    public void putVegetables() {
        sandwich.addTomatoes();
    }
    public void putSauce() {
        sandwich.addSauce("None");
        sandwich.setType(Sandwich.Type.SOFT);
    }
}