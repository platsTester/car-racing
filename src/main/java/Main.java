import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("수식을 입력해주세요 ..\n>>>");
        String formula = sc.nextLine();
        System.out.println("결과 : "+formula);

    }
}
