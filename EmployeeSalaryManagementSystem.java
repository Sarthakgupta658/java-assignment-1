import java.io.*;

class EmployeeSalaryManagementSystem {
    
    static void printHeader() {
        System.out.println("-------------------------------------------------------------------------------------");
        System.out.printf("%-5s %-15s %-10s %-10s %-10s %-10s %-10s %-10s\n", 
            "ID", "Name", "Basic", "DA", "HRA", "PF", "Gross", "Net");
        System.out.println("-------------------------------------------------------------------------------------");
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print("Enter number of employees: ");
        int n = Integer.parseInt(br.readLine());
        
        int[] empIds = new int[n];
        String[] empNames = new String[n];
        double[] basicSalaries = new double[n];
        
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Employee " + (i + 1) + ":");
            System.out.print("Employee ID: ");
            empIds[i] = Integer.parseInt(br.readLine());
            
            System.out.print("Employee Name: ");
            empNames[i] = br.readLine();
            
            System.out.print("Basic Salary: ");
            basicSalaries[i] = Double.parseDouble(br.readLine());
        }
        
        double totalNetSalary = 0;
        double maxSalary = 0;
        double minSalary = Double.MAX_VALUE;
        String highestPaid = "";
        String lowestPaid = "";
        
        System.out.println("\n--- Employee Salary Details ---");
        printHeader();
        
        for (int i = 0; i < n; i++) {
            double basic = basicSalaries[i];
            double da = basic * 0.40;
            double hra = basic * 0.20;
            double pf = basic * 0.12;
            double gross = basic + da + hra;
            double net = gross - pf;
            
            totalNetSalary += net;
            
            if (net > maxSalary) {
                maxSalary = net;
                highestPaid = empNames[i] + " (ID: " + empIds[i] + ")";
            }
            if (net < minSalary) {
                minSalary = net;
                lowestPaid = empNames[i] + " (ID: " + empIds[i] + ")";
            }
            
            System.out.printf("%-5d %-15s %-10.2f %-10.2f %-10.2f %-10.2f %-10.2f %-10.2f\n", 
                empIds[i], empNames[i], basic, da, hra, pf, gross, net);
        }
        System.out.println("-------------------------------------------------------------------------------------");
        
        double avgSalary = totalNetSalary / n;
        
        System.out.println("\nHighest Paid Employee: " + highestPaid + " with Rs. " + maxSalary);
        System.out.println("Lowest Paid Employee: " + lowestPaid + " with Rs. " + minSalary);
        System.out.println("Average Salary of all employees: Rs. " + avgSalary);
    }
}
