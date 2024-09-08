import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Save {
    Input inputsave;

    
    public Save() {
        inputsave = new Input(null);
        inputsave.getInput();
    }
    
    public void savefile(){  
        String file = inputsave.takeSurname() + ".txt";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {

            writer.write(inputsave.takeSurname()+" "+inputsave.takeName()+" "+inputsave.takeMiddlename()+" "+inputsave.takeBirthday()+" "+inputsave.takeNumber());
            writer.newLine();
        } catch (IOException e) {
            System.out.println("Ошибка записи!");
        }

    }
}
