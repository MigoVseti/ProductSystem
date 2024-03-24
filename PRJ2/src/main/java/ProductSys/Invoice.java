package ProductSys;

public class Invoice implements Document {
    private static int idCounter = 1;
    private int id;
    private int amount;
    private Payment payment;

    public Invoice(int amount) {
        this.id = idCounter++;
        this.amount = amount;
    }

    public int getId() {
        return this.id;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public Payment getPayment() {
        return this.payment;
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "id=" + id +
                ", amount=" + amount +
                ", payment=" + payment +
                '}';
    }
}