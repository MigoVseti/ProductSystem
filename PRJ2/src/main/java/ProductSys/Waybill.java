package ProductSys;

public class Waybill implements Document {
    private int id;
    private String paymentType;

    public Waybill(int id, String paymentType) {
        this.id = id;
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