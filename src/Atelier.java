public class Atelier {
    public static void dressingWomen(Clothes[] clothes){
        for (Clothes i : clothes){
            if(i instanceof WomenClothes) {
                ((WomenClothes) i).dressWomen();
            }
        }
    }
    public static void dressingMen(Clothes[] clothes){
        for (Clothes i : clothes){
            if(i instanceof MenClothes){
                ((MenClothes) i).dressMen();
            }
        }
    }
}
