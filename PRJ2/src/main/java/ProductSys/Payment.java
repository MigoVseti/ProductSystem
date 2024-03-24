package ProductSys;

public class Payment implements Document {
    private static int idCounter = 1;
    private int id;
    private int totalCost;
    private Waybill waybill;

    public Payment(int totalCost) {
        this.id = idCounter++;
        this.totalCost = totalCost;
    }

    public int getId() {
        return this.id;
    }

    public void setWaybill(Waybill waybill) {
        this.waybill = waybill;
    }

    public Waybill getWaybill() {
        return this.waybill;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "id=" + id +
                ", totalCost=" + totalCost +
                ", waybill=" + waybill +
                '}';
    }
}