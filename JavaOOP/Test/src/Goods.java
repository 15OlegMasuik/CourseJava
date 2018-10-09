/**
 * Created by Marta on 09.10.2018.
 */
public class Goods  {
    private  double price;
    private  double weight;
    private double size;
    private  String description;
    private  String adress;
    private int expiryDate;

    public Goods(double price, double weight, double size, String description, String adress, int expiryDate) {
        this.price = price;
        this.weight = weight;
        this.size = size;
        this.description = description;
        this.adress = adress;
        this.expiryDate = expiryDate;
    }

    public Goods() {
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public int getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(int expiryDate) {
        this.expiryDate = expiryDate;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "price=" + price +
                ", weight=" + weight +
                ", size=" + size +
                ", description='" + description + '\'' +
                ", adress='" + adress + '\'' +
                ", expiryDate=" + expiryDate +
                '}';
    }

}
