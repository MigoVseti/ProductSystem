import ProductSys.Document;
import ProductSys.ViewDoc;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        ViewDoc viewDocument = new ViewDoc();
        Scanner scanner = new Scanner(System.in);

        System.out.println("1.Add document\n2.Display document by id\n3.Delete document\n4.Show all documents\n5.Exit");

        while (true){
            int opp = scanner.nextInt();
            switch (opp){
                case 1:
                    viewDocument.ViewDoc();
                    break;
                case 2:
                    System.out.print("Enter id: ");
                    int id1 = scanner.nextInt();
                    viewDocument.displayDocumentById(id1);
                    break;
                case 3:
                    System.out.print("Enter id: ");
                    int id2 = scanner.nextInt();
                    viewDocument.deleteDoccumentByID(id2);
                    break;
                case 4:
                    viewDocument.showAllDocuments();
                case 5:
                    System.exit(0);
            }
        }

    }
}