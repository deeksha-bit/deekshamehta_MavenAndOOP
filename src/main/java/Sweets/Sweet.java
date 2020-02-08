package Sweets;

public abstract class Sweet {
    private String sweetname;
    private String type;
    private String sweetness;
    private double weight;

    public Sweet(String sweetname, String type, String sweetness, double weight) {
        this.sweetname = sweetname;
        this.type = type;
        this.sweetness = sweetness;
        this.weight = weight;
    }

    public String getSweetname() {
        return sweetname;
    }

    public void setSweetname(String sweetname) {
        this.sweetname = sweetname;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSweetness() {
        return sweetness;
    }

    public void setSweetness(String sweetness) {
        this.sweetness = sweetness;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

}
