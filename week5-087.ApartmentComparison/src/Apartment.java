
public class Apartment {

    private int rooms;
    private int squareMeters;
    private int pricePerSquareMeter;

    public Apartment(int rooms, int squareMeters, int pricePerSquareMeter) {
        this.rooms = rooms;
        this.squareMeters = squareMeters;
        this.pricePerSquareMeter = pricePerSquareMeter;
    }

    public boolean larger (Apartment apartment) {
        if (this.squareMeters > apartment.squareMeters) { return true; }
        return false;
    }

    public int priceDifference (Apartment apartment) {
        int p1 = this.pricePerSquareMeter * this.squareMeters;
        int p2 = apartment.pricePerSquareMeter * apartment.squareMeters;

        int diff = (Math.max(p1,p2) - Math.min(p1,p2));

        return diff;
    }

    public boolean moreExpensiveThan (Apartment apartment) {
        int p1 = this.pricePerSquareMeter * this.squareMeters;
        int p2 = apartment.pricePerSquareMeter * apartment.squareMeters;

        if (p1 > p2) { return true; }
        return false;
    }

}
