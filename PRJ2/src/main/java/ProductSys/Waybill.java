package ProductSys;

public class Waybill implements Document {
    private static int idCounter = 1;
    private int id;
    private String paymentType;

    public Waybill(String paymentType) {
        this.id = idCounter++;
        this.paymentType = paymentType;
    }

    public int getId() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Waybill{" +
                "id=" + id +
                ", paymentType='" + paymentType + '\'' +
                '}';
    }
}