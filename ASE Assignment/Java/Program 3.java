import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine().toLowerCase();
        boolean[] mark = new boolean[26];
        int index = 0;
        for (int i = 0; i < input.length(); i++) {
            if ('a' <= input.charAt(i) && input.charAt(i) <= 'z') {
                index = input.charAt(i) - 'a';
            }
            mark[index] = true;
        }
        boolean pangram = true;
        for (int i = 0; i <= 25; i++) {
            if (mark[i] == false) {
                pangram = false;
            }
        }
        if (pangram) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }
}


   
