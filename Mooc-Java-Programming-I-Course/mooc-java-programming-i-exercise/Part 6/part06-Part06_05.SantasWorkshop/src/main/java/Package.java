import java.util.ArrayList;

public class Package {
    private ArrayList<Gift>giftPackage;
    public Package(){
        this.giftPackage = new ArrayList<>();
    }
    public  void addGift(Gift gift){
        this.giftPackage.add(gift);
    }
    public int totalWeight(){
        int weight =0;
        for(Gift gift:giftPackage){
            weight=weight+gift.getWeight();
        }
        return weight;
    }

}
