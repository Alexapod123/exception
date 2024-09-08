import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите ФИО, дату рождения в формате dd.mm.yyyy, номер телефона, пол");
        Scanner scanner = new Scanner((System.in));
        String inp = scanner.nextLine();
        Input input = new Input(inp);
        input.splitInput();
        Save save = new Save();
        save.savefile();
       
        scanner.close();
    }

}
