public class Apartment {

    private int rooms;
    private int squares;
    private int princePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
    }
    public boolean  largerThan(Apartment compared){
        return this.squares> compared.squares;
    }
    public  int getPrice(){
        return this.princePerSquare*this.squares;
    }
    public int priceDifference(Apartment compared){
        if(this.getPrice() > compared.getPrice()){
            return this.getPrice() - compared.getPrice();
        }
        return  compared.getPrice() - this.getPrice();
    }
    public boolean moreExpensiveThan(Apartment compared){
        return this.getPrice() > compared.getPrice();
    }

}
