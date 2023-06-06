public class Skirt extends Clothes implements WomenClothes{
    public Skirt(Size size, double cost, String color) {
        super(size, cost, color);
        type = "Skirt";
    }

    @Override
    public void dressWomen() {
        System.out.println("dress a woman in " + type + " " + size + " " + size.getEuroSize() + " " + size.getDescription() + ", color: " + color + ", cost: " + cost);
    }
}

