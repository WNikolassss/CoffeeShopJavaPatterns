class SpicySandwichBuilder extends SandwichBuilder {
    public void putMeat() {
        sandwich.addPork();
    }
    public void putVegetables() {
        sandwich.addOnions();
        sandwich.addTomatoes();
    }
    public void putSauce() {
        sandwich.addSauce("Tabasco");
        sandwich.setType(Sandwich.Type.SPICY);
    }
}