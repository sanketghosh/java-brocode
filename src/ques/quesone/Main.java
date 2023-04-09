package ques.quesone;

public class Main {
    public static void main(String[] args) {

        Invoice invoice = new Invoice("One","iron wheel",2,1220.00);
        System.out.println(invoice.getInvoiceAmount());

        System.out.println(invoice.setPartDescription("iron bolt"));
        System.out.println(invoice.getPartDescription());

        // error code

    }
}
