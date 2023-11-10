import java.util.Scanner;

public class baekjoon_9086 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();

        String[] input = new String[no];

        /*
        for (int i = 0; i < no; i++) {
            String str = sc.next();
            input[i] = Character.toString(str.charAt(0)) + str.charAt(str.length()-1);
        }
        sc.close();

        for (int i = 0; i < no; i++) {
            System.out.println(input[i]);
        }
        */
        for (int i = 0; i < no; i++) {
            String str = sc.next();
            input[i] = str;
        }
        sc.close();

        for (int i = 0; i < no; i++) {
            System.out.print(input[i].charAt(0));
            System.out.print(input[i].charAt(input[i].length() - 1));
            System.out.println();
        }
    }
}
