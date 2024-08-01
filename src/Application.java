import java.util.Scanner;

public class Application {
    //Метод запуска системы
    public void exec_app(){
        String input ="";
        String action_input = "";
        Scanner scan = new Scanner(System.in);
        while(input != "!"){
            input = scan.nextLine();
            Calculator.SetNum1(Integer.parseInt(input));
            input = scan.nextLine();
            action_input = input;
            input = scan.nextLine();
            Calculator.SetNum2(Integer.parseInt(input));
            
        }
    }

}
