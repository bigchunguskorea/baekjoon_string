import java.util.Scanner;

public class baekjoon_2754 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String c_score = sc.next();
        sc.close();

        if (c_score.equals("F")) {
            System.out.println("0.0");
            System.exit(0);
        }
        //char형 타입으로 받는 메소드가 없으므로 string으로 받아 charAt() 메소드로 반환
        char c_alph = c_score.charAt(0);
        double c_avg = 0.0;

        switch (c_alph) {
            case 'A': c_avg = 4.0; break;
            case 'B': c_avg = 3.0; break;
            case 'C': c_avg = 2.0; break;
            case 'D': c_avg = 1.0; break;
        }
        /*
        switch (c_score) {
            case "A+": c_avg = 4.3; break;
            case "A0": c_avg = 4.0; break;
            case "A-": c_avg = 3.7; break;
            case "B+": c_avg = 3.3; break;
            case "B0": c_avg = 3.0; break;
            case "B-": c_avg = 2.7; break;
            case "C+": c_avg = 2.3; break;
            case "C0": c_avg = 2.0; break;
            case "C-": c_avg = 1.7; break;
            case "D+": c_avg = 1.3; break;
            case "D0": c_avg = 1.0; break;
            case "D-": c_avg = 0.7; break;
            default: c_avg = 0.0; break;
        }
        */

        char c_sign = c_score.charAt(1);
        if(c_sign == '+')
            c_avg += 0.3;
        else if (c_sign == '-')
            c_avg -= 0.3;

        System.out.println(c_avg);
    }
}
