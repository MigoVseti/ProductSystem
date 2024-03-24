package ProductSys;

import java.util.ArrayList;

public class ViewDoc {
    private ArrayList<Document> documents = new ArrayList<>();

    public ViewDoc() {
        Order order = new Order(1, "Хлеб", 2);
        Invoice invoice = new Invoice(1, 35);
        Payment payment = new Payment(1, 70);
        Waybill waybill = new Waybill(1, "Наличные");

        Order order1 = new Order(2, "Мука", 4);
        Invoice invoice1 = new Invoice(2, 50);
        Payment payment1 = new Payment(2, 200);
        Waybill waybill1 = new Waybill(3, "Наличные");

        order.setInvoice(invoice);
        invoice.setPayment(payment);
        payment.setWaybill(waybill);

        order1.setInvoice(invoice1);
        invoice1.setPayment(payment1);
        payment1.setWaybill(waybill1);

        documents.add(order);
        documents.add(order1);
    }

    public Document getDocumentById(int id) {
        for (Document doc : documents) {
            if (doc.getId() == id) {
                return doc;
            }
        }
        return null;
    }

    public void displayDocumentById(int id) {
        Document document = getDocumentById(id);

        if (document != null) {
            if (document instanceof Order) {
                Order order = (Order) document;
                System.out.println("Документ найден с id: " + order.getId());
            }
        } else {
            System.out.println("Документ с таким id не найден.");
        }
    }
}