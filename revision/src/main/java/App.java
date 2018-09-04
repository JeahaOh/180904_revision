import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        
        //  1)  키보드 입력을 처리할 객체 준비.
        Scanner keyIn = new Scanner(System.in);
        
        //  2)  반복문을 이용해서 사용자로부터 회원정보 입력 받기.
        while(true) {            
            System.out.print("Name : ");
            String name = keyIn.nextLine();
            
            System.out.print("eMail : ");
            String email = keyIn.nextLine();
            
            System.out.print("Password : ");
            String password = keyIn.nextLine();
            
            //  3)  printf로 출력.
            System.out.printf("%s, %s, %s\n", name, email, password);
            
            //  4)  탈출 조건
            System.out.print("Continue? (Y/n)");
            String answer = keyIn.nextLine();
            if(answer.toLowerCase().equals("n")) {
                break;
            }
        }
    }
}
