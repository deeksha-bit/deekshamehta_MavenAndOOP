package Sweets;

public class Cake extends Sweet {

    public String nature;

    public String getNature() {
        return nature;
    }

    public Cake(String sweetname, String type, String sweetness, double weight, String nature) {
        super(sweetname, type, sweetness, weight);
        this.nature=nature;
    }
}
