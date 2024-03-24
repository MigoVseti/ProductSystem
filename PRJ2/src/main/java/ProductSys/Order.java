package ProductSys;

public class Order implements Document {
    private static int idCounter = 1;
    private int id;
    private String name;
    private int quantity;
    private Invoice invoice;

    public Order(String name, int quantity) {
        this.id = idCounter++;
        this.name = name;
        this.quantity = quantity;
    }

    public int getId() {
        return this.id;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }

    public Invoice getInvoice() {
        return this.invoice;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", quantity=" + quantity +
                ", invoice=" + invoice +
                '}';
    }
}
