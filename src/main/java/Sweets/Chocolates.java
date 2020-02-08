package Sweets;

public class Chocolates extends Sweet{

    public String company;

    public Chocolates(String sweetname, String type, String sweetness, double weight, String company) {
        super(sweetname, type, sweetness, weight);
        this.company = company;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
}
