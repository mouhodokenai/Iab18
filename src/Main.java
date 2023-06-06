public class Main {
    public static void main(String[] args) {
        Clothes clothing1 = new TShirt(Size.XXS,500.99, "red");
        Clothes clothing2 = new Pants(Size.XS,1500.99, "white");
        Clothes clothing3 = new Tie(Size.L,300.49, "green");
        Clothes clothing4 = new Skirt(Size.M,1000, "black");
        Clothes clothing5 = new TShirt(Size.S,800.49, "mint");

        Clothes[] clothes = {clothing1, clothing2, clothing3, clothing4, clothing5};
        System.out.println("Men's clothing");
        Atelier.dressingMen(clothes);
        System.out.println("Women's clothing");
        Atelier.dressingWomen(clothes);
    }

}