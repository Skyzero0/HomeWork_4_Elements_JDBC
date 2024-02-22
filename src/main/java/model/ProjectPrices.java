package model;

public class ProjectPrices {
    private String name;
    private int price;

    public ProjectPrices(String name, int price) {
        this.name = name;
        this.price = price;
    }

//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getPrice() {
//        return price;
//    }
//
//    public void setPrice(int price) {
//        this.price = price;
//    }

    @Override
    public String toString() {
        return "PricesOfProject: " +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
