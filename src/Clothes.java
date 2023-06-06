public abstract class Clothes {
    String type;
    Size size;
    double cost;
    String color;

    public Clothes(Size size, double cost, String color) {
        this.size = size;
        this.cost = cost;
        this.color = color;
    }

}