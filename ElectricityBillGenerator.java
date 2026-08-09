import java.io.*;

class ElectricityBillGenerator {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print("Enter Consumer Name: ");
        String name = br.readLine();
        
        System.out.print("Enter Consumer Number: ");
        String consumerNo = br.readLine();
        
        System.out.print("Enter Units Consumed: ");
        int units = Integer.parseInt(br.readLine());
        
        double totalBill = 0;
        
        if (units <= 100) {
            totalBill = units * 3;
        } else if (units <= 200) {
            totalBill = (100 * 3) + ((units - 100) * 5);
        } else if (units <= 500) {
            totalBill = (100 * 3) + (100 * 5) + ((units - 200) * 7);
        } else {
            totalBill = (100 * 3) + (100 * 5) + (300 * 7) + ((units - 500) * 10);
        }
        
        if (totalBill > 5000) {
            totalBill = totalBill + (totalBill * 0.05); // 5% surcharge
        }
        
        System.out.println("\n--- Consumer Details ---");
        System.out.println("Consumer Name: " + name);
        System.out.println("Consumer Number: " + consumerNo);
        System.out.println("Total Bill Amount: Rs " + totalBill);
    }
}
