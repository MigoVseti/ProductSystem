package ProductSys;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        ViewDoc viewDocument = new ViewDoc();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите id: ");
        int id = scanner.nextInt();
        viewDocument.displayDocumentById(id);
        System.out.println(viewDocument.getDocumentById(id));
    }
}