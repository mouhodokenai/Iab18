public class TShirt extends Clothes implements WomenClothes, MenClothes{
    public TShirt(Size size, double cost, String color) {
        super(size, cost, color);
        type = "T-shirt";
    }

    @Override
    public void dressMen() {
        System.out.println("dress a man in " + type + " " + size + " " + size.getEuroSize() + " " + size.getDescription() + ", color: " + color + ", cost: " + cost);
    }

    @Override
    public void dressWomen() {
        System.out.println("dress a woman in " + type + " " + size + " " + size.getEuroSize() + " " + size.getDescription() + ", color: " + color + ", cost: " + cost);
    }
}
