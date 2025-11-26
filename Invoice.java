import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String billName, billCity, billAddress;
        String billContact;
        String billGSTIN;
        String billEmail;

        String shipName, shipAddress, shipCity;
        String shipContact;
        String shipGSTIN;
        String shipEmail;
        String paymentDate;
        String paymentTerms;

        int sNo1, sNo2, sNo3, sNo4, sNo5, sNo6, sNo7;
        String pCode1, pCode2, pCode3, pCode4, pCode5, pCode6, pCode7;
        String hsn1, hsn2, hsn3, hsn4, hsn5, hsn6, hsn7;
        String units1, units2, units3, units4, units5, units6, units7;
        double rate1, rate2, rate3, rate4, rate5, rate6, rate7;
        double tax1, tax2, tax3, tax4, tax5, tax6, tax7;

        String product1, product2, product3, product4, product5, product6, product7;
        double product1Qty, product2Qty, product3Qty, product4Qty, product5Qty, product6Qty, product7Qty;

        double discountRate = 0.006368;

        // BILL TO
        System.out.println("BILL TO:");
        System.out.print("Enter CUSTOMER NAME: ");
        billName = input.nextLine();
        System.out.print("Enter billCity: ");
        billCity = input.nextLine();
        System.out.print("Enter Billing Address: ");
        billAddress = input.nextLine();
        System.out.print("Enter GSTIN: ");
        billGSTIN = input.nextLine();
        System.out.print("Enter contact: ");
        billContact = input.nextLine();
        System.out.print("Enter Email: ");
        billEmail = input.nextLine();

        // SHIP TO
        System.out.println("\nSHIP TO:");
        System.out.print("Enter Recipient Name: ");
        shipName = input.nextLine();
        System.out.print("Enter Shipping City: ");
        shipCity = input.nextLine();
        System.out.print("Enter Shipping Address: ");
        shipAddress = input.nextLine();
        System.out.print("Enter GSTIN: ");
        shipGSTIN = input.nextLine();
        System.out.print("Enter Contact: ");
        shipContact = input.nextLine();
        System.out.print("Enter Email: ");
        shipEmail = input.nextLine();

        paymentDate = "7 days from date of delivery";
        paymentTerms = "100% against invoice";

        // PRODUCT INPUT
        System.out.println("\nPRODUCT 1");
        System.out.print("Enter S.No: ");
        sNo1 = input.nextInt();
        input.nextLine(); // Clear buffer
        System.out.print("Enter Product Code: ");
        pCode1 = input.nextLine();
        System.out.print("Enter Product Name: ");
        product1 = input.nextLine();
        System.out.print("Enter HSN Code: ");
        hsn1 = input.nextLine();
        System.out.print("Enter Quantity: ");
        product1Qty = input.nextDouble();
        input.nextLine(); // Clear buffer
        System.out.print("Enter Units: ");
        units1 = input.nextLine();
        System.out.print("Enter Rate: ");
        rate1 = input.nextDouble();
        System.out.print("Enter Tax (%): ");
        tax1 = input.nextDouble();
        input.nextLine(); // Clear buffer

        // PRODUCT 2
        System.out.println("\nPRODUCT 2");
        System.out.print("Enter S.No: ");
        sNo2 = input.nextInt();
        input.nextLine();
        System.out.print("Enter Product Code: ");
        pCode2 = input.nextLine();
        System.out.print("Enter Product Name: ");
        product2 = input.nextLine();
        System.out.print("Enter HSN Code: ");
        hsn2 = input.nextLine();
        System.out.print("Enter Quantity: ");
        product2Qty = input.nextDouble();
        input.nextLine();
        System.out.print("Enter Units: ");
        units2 = input.nextLine();
        System.out.print("Enter Rate: ");
        rate2 = input.nextDouble();
        System.out.print("Enter Tax (%): ");
        tax2 = input.nextDouble();
        input.nextLine();

        // PRODUCT 3
        System.out.println("\nPRODUCT 3");
        System.out.print("Enter S.No: ");
        sNo3 = input.nextInt();
        input.nextLine();
        System.out.print("Enter Product Code: ");
        pCode3 = input.nextLine();
        System.out.print("Enter Product Name: ");
        product3 = input.nextLine();
        System.out.print("Enter HSN Code: ");
        hsn3 = input.nextLine();
        System.out.print("Enter Quantity: ");
        product3Qty = input.nextDouble();
        input.nextLine();
        System.out.print("Enter Units: ");
        units3 = input.nextLine();
        System.out.print("Enter Rate: ");
        rate3 = input.nextDouble();
        System.out.print("Enter Tax (%): ");
        tax3 = input.nextDouble();
        input.nextLine();

        // PRODUCT 4
        System.out.println("\nPRODUCT 4");
        System.out.print("Enter S.No: ");
        sNo4 = input.nextInt();
        input.nextLine();
        System.out.print("Enter Product Code: ");
        pCode4 = input.nextLine();
        System.out.print("Enter Product Name: ");
        product4 = input.nextLine();
        System.out.print("Enter HSN Code: ");
        hsn4 = input.nextLine();
        System.out.print("Enter Quantity: ");
        product4Qty = input.nextDouble();
        input.nextLine();
        System.out.print("Enter Units: ");
        units4 = input.nextLine();
        System.out.print("Enter Rate: ");
        rate4 = input.nextDouble();
        System.out.print("Enter Tax (%): ");
        tax4 = input.nextDouble();
        input.nextLine();

        // PRODUCT 5
        System.out.println("\nPRODUCT 5");
        System.out.print("Enter S.No: ");
        sNo5 = input.nextInt();
        input.nextLine();
        System.out.print("Enter Product Code: ");
        pCode5 = input.nextLine();
        System.out.print("Enter Product Name: ");
        product5 = input.nextLine();
        System.out.print("Enter HSN Code: ");
        hsn5 = input.nextLine();
        System.out.print("Enter Quantity: ");
        product5Qty = input.nextDouble();
        input.nextLine();
        System.out.print("Enter Units: ");
        units5 = input.nextLine();
        System.out.print("Enter Rate: ");
        rate5 = input.nextDouble();
        System.out.print("Enter Tax (%): ");
        tax5 = input.nextDouble();
        input.nextLine();

        // PRODUCT 6
        System.out.println("\nPRODUCT 6");
        System.out.print("Enter S.No: ");
        sNo6 = input.nextInt();
        input.nextLine();
        System.out.print("Enter Product Code: ");
        pCode6 = input.nextLine();
        System.out.print("Enter Product Name: ");
        product6 = input.nextLine();
        System.out.print("Enter HSN Code: ");
        hsn6 = input.nextLine();
        System.out.print("Enter Quantity: ");
        product6Qty = input.nextDouble();
        input.nextLine();
        System.out.print("Enter Units: ");
        units6 = input.nextLine();
        System.out.print("Enter Rate: ");
        rate6 = input.nextDouble();
        System.out.print("Enter Tax (%): ");
        tax6 = input.nextDouble();
        input.nextLine();

        // PRODUCT 7
        System.out.println("\nPRODUCT 7");
        System.out.print("Enter S.No: ");
        sNo7 = input.nextInt();
        input.nextLine();
        System.out.print("Enter Product Code: ");
        pCode7 = input.nextLine();
        System.out.print("Enter Product Name: ");
        product7 = input.nextLine();
        System.out.print("Enter HSN Code: ");
        hsn7 = input.nextLine();
        System.out.print("Enter Quantity: ");
        product7Qty = input.nextDouble();
        input.nextLine();
        System.out.print("Enter Units: ");
        units7 = input.nextLine();
        System.out.print("Enter Rate: ");
        rate7 = input.nextDouble();
        System.out.print("Enter Tax (%): ");
        tax7 = input.nextDouble();

        // CALCULATIONS
        // Calculate amount with tax included: (Rate * Quantity) * (1 + Tax/100)
        double total1 = rate1 * product1Qty * (1 + tax1 / 100);
        double total2 = rate2 * product2Qty * (1 + tax2 / 100);
        double total3 = rate3 * product3Qty * (1 + tax3 / 100);
        double total4 = rate4 * product4Qty * (1 + tax4 / 100);
        double total5 = rate5 * product5Qty * (1 + tax5 / 100);
        double total6 = rate6 * product6Qty * (1 + tax6 / 100);
        double total7 = rate7 * product7Qty * (1 + tax7 / 100);

        double GrandTotal = total1 + total2 + total3 + total4 + total5 + total6 + total7;
        double discountAmount = GrandTotal * discountRate;
        double totalDue = GrandTotal - discountAmount;

        // OUTPUT
        System.out.println("\n\n================================================================================");
        System.out.println("                              SALES INVOICE");
        System.out.println("================================================================================");
        System.out.println("\nPayment Date: " + paymentDate);
        System.out.println("Payment Terms: " + paymentTerms);

        System.out.println("\n--------------------------------------------------------------------------------");
        System.out.println("Bill To:                                    Ship To:");
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println(billName + "                            " + shipName);
        System.out.println(billAddress + "                   " + shipAddress);
        System.out.println(billCity + "                              " + shipCity);
        System.out.println("GSTIN: " + billGSTIN + "                    GSTIN: " + shipGSTIN);
        System.out.println("Contact: " + billContact + "               Contact: " + shipContact);
        System.out.println("Email: " + billEmail + "     Email: " + shipEmail);

        System.out.println("\n=============================================================================================");
        System.out.println("S.No | Product Code | Product Name      | HSN code   | Quantity | Units | Rate   | Tax  | Total");
        System.out.println("===============================================================================================");

        System.out.println(sNo1 + "    | " + pCode1 + "         | " + product1 + "        | " + hsn1 + " | " + (int)product1Qty + "        | " + units1 + "   | " + rate1 + " | " + (int)tax1 + "%  | " + total1);
        System.out.println(sNo2 + "    | " + pCode2 + "         | " + product2 + "              | " + hsn2 + " | " + (int)product2Qty + "        | " + units2 + "   | " + rate2 + "  | " + (int)tax2 + "%  | " + total2);
        System.out.println(sNo3 + "    | " + pCode3 + "         | " + product3 + "    | " + hsn3 + " | " + (int)product3Qty + "        | " + units3 + "   | " + rate3 + "  | " + (int)tax3 + "%  | " + total3);
        System.out.println(sNo4 + "    | " + pCode4 + "         | " + product4 + "       | " + hsn4 + " | " + (int)product4Qty + "        | " + units4 + "   | " + rate4 + "  | " + (int)tax4 + "%  | " + total4);
        System.out.println(sNo5 + "    | " + pCode5 + "         | " + product5 + "      | " + hsn5 + " | " + (int)product5Qty + "        | " + units5 + "   | " + rate5 + "  | " + (int)tax5 + "%  | " + total5);
        System.out.println(sNo6 + "    | " + pCode6 + "         | " + product6 + "         | " + hsn6 + " | " + (int)product6Qty + "        | " + units6 + "   | " + rate6 + "  | " + (int)tax6 + "%  | " + total6);
        System.out.println(sNo7 + "    | " + pCode7 + "         | " + product7 + "    | " + hsn7 + " | " + (int)product7Qty + "        | " + units7 + "   | " + rate7 + "  | " + (int)tax7 + "% | " + total7);

        System.out.println("======================================================================================");
        System.out.println("                                                              Total: " + GrandTotal);
        System.out.println("                                                          Discounts: " + discountAmount);
        System.out.println("======================================================================================");
        System.out.println("                                                        Grand total: " + totalDue);
        System.out.println("======================================================================================");

        input.close();
    }
}