import java.util.Scanner;

public class baekjoon_2744 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input_word = sc.nextLine();
        sc.close();

        String output_word = "";
        char tmp;

        for (int i = 0; i < input_word.length(); i++) {
            tmp = input_word.charAt(i);
            if ((tmp >= 65) && (tmp <= 90))
                output_word += (char)(tmp + 32);
            else // ((tmp >= 97) && (tmp <= 122))
                output_word += (char)(tmp - 32);
        }

        /*
        for (int i = 0; i < input_word.length(); i++) {
            if (Character.isLowerCase(input_word.charAt(i)))
                output_word += Character.toUpperCase(input_word.charAt(i));
            else
                output_word += Character.toLowerCase(input_word.charAt(i));
        }

         */
        System.out.println(output_word);
    }
}
