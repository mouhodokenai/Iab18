public class Tie extends Clothes implements MenClothes{
    public Tie(Size size, double cost, String color) {
        super(size, cost, color);
        type = "Tie";
    }


    @Override
    public void dressMen() {
        System.out.println("dress a man in " + type + " " + size + " " + size.getEuroSize() + " " + size.getDescription() + ", color: " + color + ", cost: " + cost);
    }
}

