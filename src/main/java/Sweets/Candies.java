package Sweets;

public class Candies extends Sweet {

    public String shape;

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public Candies(String sweetname, String type, String sweetness, double weight, String shape) {
        super(sweetname, type, sweetness, weight);
        this.shape=shape;
    }
}
