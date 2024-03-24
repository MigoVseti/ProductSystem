package ProductSys;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ViewDoc {
    private List<Document> documents = new ArrayList<>();

    public ViewDoc() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Order name: ");
        String orderName = scanner.nextLine();
        System.out.print("Enter Order quantity: ");
        int orderQuantity = scanner.nextInt();
        Order order = new Order(orderName, orderQuantity);

        System.out.print("Enter Invoice amount: ");
        int invoiceAmount = scanner.nextInt();
        Invoice invoice = new Invoice(invoiceAmount);

        System.out.print("Enter Payment total cost: ");
        int paymentTotalCost = scanner.nextInt();
        Payment payment = new Payment(paymentTotalCost);

        System.out.print("Enter Waybill payment type: ");
        String waybillPaymentType = scanner.next();
        Waybill waybill = new Waybill(waybillPaymentType);

        order.setInvoice(invoice);
        invoice.setPayment(payment);
        payment.setWaybill(waybill);

        documents.add(order);
    }

    public Document getDocumentById(int id) {
        for (Document doc : documents) {
            if (doc.getId() == id) {
                return doc;
            }
        }
        return null; // Document not found
    }

    public void displayDocumentById(int id) {
        Document doc = getDocumentById(id);
        if (doc != null) {
            System.out.println("Document found:");
            System.out.println(doc.toString());
        } else {
            System.out.println("Document with ID " + id + " not found.");
        }
    }
}