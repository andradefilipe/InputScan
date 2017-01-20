import java.util.Scanner;

public class Solution {
	
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner scan = new Scanner(System.in);
        int nextInt = scan.nextInt();        
        scan.nextLine();
        String nextString = scan.nextLine();
        System.out.println(i+nextInt);
        System.out.println(2*d);
        System.out.println(s + nextString);
        scan.close();
    }
}