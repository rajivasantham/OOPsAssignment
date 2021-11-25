package abstraction;

import java.util.Scanner;

public class MainBank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Amount in Rupees : ");
        int totalAmount = 0;
        IciciBank iciciBank = new IciciBank();
        totalAmount = sc.nextInt();
        iciciBank.denominations(totalAmount);
        HdfcBank hdfcBank = new HdfcBank();
        hdfcBank.denominations(totalAmount);

        sc.close();
    }
}
