import java.util.Scanner;

public class Solution {
	
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner scan = new Scanner(System.in);
        int nextInt = scan.nextInt();        
        double nextDouble = scan.nextDouble();
        scan.nextLine();
        String nextString = scan.nextLine();
        System.out.println(i+nextInt);
        System.out.printf("%.1f%n", d+nextDouble);
        System.out.println(s + nextString);
        
        scan.close();
    }
}