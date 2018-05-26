public class Sandwich extends Product {
    private Type type;
    public enum Type {
        SOFT, SPICY
    }

    public int price = 10;

    public Sandwich copy() {
        return new Sandwich();
    }

    public void setType(Type type) {
        this.type = type;
    }

    private boolean tomatoes = false;
    private boolean chicken = false;
    private boolean pork = false;
    private boolean onions = false;
    private String sauce;

    public void addTomatoes() {
        this.tomatoes = true;
    }
    public void addChicken() {
        this.chicken = true;
    }
    public void addSauce(String s) {
        this.sauce = s;
    }

    public void addPork() {
        this.pork = true;
    }
    public void addOnions() {
        this.onions = true;
    }
}
