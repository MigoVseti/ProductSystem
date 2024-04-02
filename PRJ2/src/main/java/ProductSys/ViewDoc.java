package ProductSys;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class ViewDoc {
    private List<Document> documents = new ArrayList<>();

    public void ViewDoc() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Order name: ");
        String orderName = scanner.nextLine();
        System.out.println("Enter Order quantity: ");
        int orderQuantity = Integer.parseInt(scanner.nextLine());
        Order order = new Order(orderName, orderQuantity);

        System.out.println("Enter Invoice amount: ");
        int invoiceAmount = Integer.parseInt(scanner.nextLine());
        Invoice invoice = new Invoice(invoiceAmount);

        System.out.println("Payment total cost: ");
        int paymentTotalCost = orderQuantity * invoiceAmount;
        System.out.println(paymentTotalCost);
        Payment payment = new Payment(paymentTotalCost);

        System.out.println("Enter Waybill payment type(Нал/БезНал): ");
        String waybillPaymentType = scanner.nextLine();
        Waybill waybill = new Waybill(waybillPaymentType);

        order.setInvoice(invoice);
        invoice.setPayment(payment);
        payment.setWaybill(waybill);

        documents.add(order);

    }

    private Document getDocumentById(int id) {
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

    public void deleteDoccumentByID(int id){
        Document document = getDocumentById(id);
        if (document != null){
            documents.remove(document);
            System.out.println("Document has been deleted");
        }
        else{
            System.out.println("Document with ID " + id + " not found.");
        }
    }

    public void showAllDocuments(){
        System.out.println(documents.toString());
    }
}