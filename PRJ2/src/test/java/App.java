import ProductSys.Document;
import ProductSys.ViewDoc;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        ViewDoc viewDocument = new ViewDoc();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter id: ");
        int id = scanner.nextInt();
        viewDocument.displayDocumentById(id);
        System.out.println((Document) viewDocument.getDocumentById(id));
    }
}