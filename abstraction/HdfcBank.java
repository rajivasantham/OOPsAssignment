package abstraction;

public class HdfcBank extends ReserveBank {
    @Override
    public void denominations(int totalAmount) {
        System.out.println( " ******* DENOMINATION FROM HDFC ******* ");
        int amt = totalAmount;
        int rs2000 = 0;
        int rs500 = 0;
        int rs100 = 0;
        int rs50 = 0;
        int rs5 = 0;
        int rs2 = 0;
        int rs1 = 0;
        int count = 0;

        if (amt >= 2000) {
            rs2000 = amt / 2000;
            amt = amt % 2000;
            System.out.println("Total Number Of Denominations of 2000 Rupees :" + rs2000);

        }
        if (amt >= 500) {
            rs500 = amt / 500;
            amt = amt % 500;
            System.out.println("Total Number Of Denominations 500 Rupees : " + rs500);

        }
        if (amt >= 100) {
            rs100 = amt / 100;
            amt = amt % 100;
            System.out.println("Total Number Of 100 Rupees Notes : " + rs100);

        }
        if (amt >= 50) {
            rs50 = amt / 50;
            amt = amt % 50;
            System.out.println("Total Number Of 50 Rupees Notes : " + rs50);

        }
        if (amt >= 5) {
            rs5 = amt / 5;
            amt = amt % 5;
            System.out.println("Total Number Of 5 Rupees Notes Or Coin : " + rs5);

        }
        if (amt >= 2) {
            rs2 = amt / 2;
            amt = amt % 2;
            System.out.println("Total Number Of 2 Rupees Notes Or Coin : " + rs2);

        }
        if (amt >= 1) {
            rs1 = amt / 1;
            amt = amt % 1;
            System.out.println("Total Number Of 1 Rupees Note Or Coin : " + rs1);

        }
        count = rs2000 + rs500 + rs100 + rs50 + rs5 + rs2 + rs1;
        System.out.println("Total Number Of Notes given " + count);

    }

}

