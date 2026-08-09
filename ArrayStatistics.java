import java.io.*;

class ArrayStatistics {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[10];
        
        System.out.println("Enter 10 integers:");
        for (int i = 0; i < 10; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        
        int max = arr[0];
        int min = arr[0];
        int sum = 0;
        int evenCount = 0;
        int oddCount = 0;
        
        for (int i = 0; i < 10; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
            sum = sum + arr[i];
            
            if (arr[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        
        double average = (double) sum / 10;
        
        System.out.print("Enter a number to search: ");
        int searchNum = Integer.parseInt(br.readLine());
        boolean found = false;
        
        for (int i = 0; i < 10; i++) {
            if (arr[i] == searchNum) {
                found = true;
                break;
            }
        }
        
        System.out.println("\n--- Array Statistics ---");
        System.out.println("Maximum Element = " + max);
        System.out.println("Minimum Element = " + min);
        System.out.println("Average = " + average);
        System.out.println("Even Numbers Count = " + evenCount);
        System.out.println("Odd Numbers Count = " + oddCount);
        
        if (found) {
            System.out.println(searchNum + " is found in the array.");
        } else {
            System.out.println(searchNum + " is not found in the array.");
        }
        
        System.out.println("\nArray in reverse order:");
        for (int i = 9; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
