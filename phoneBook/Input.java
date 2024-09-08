import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;



public class Input {
    private String input;
    private String[] data;
   

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }


    public Input(String input) {
        this.input = input;
    }

    public String[] splitInput(){
       data= input.split(" ");
        if (data.length!=6){
            System.err.println("Введено неверное количество данных!");
        }
    
        return data;
    }
    
  
    public String takeSurname(){
        String surname = data[0];
        return surname;
    }
    
    public String takeName(){
        String name = data[1];
        return name;
    }
    public String takeMiddlename(){
        String middlename = data[2];
        return middlename;
    }
    public LocalDate takeBirthday(){
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
            LocalDate birthDate = LocalDate.parse(data [3], formatter);
            return birthDate;
        } catch (DateTimeParseException e) {
            System.out.println("Неверный формат даты");
        }
        return null;
        

    }
    public long takeNumber(){
        try {
            long phoneNumber = Long.parseLong(data[4]);
            return phoneNumber;
        } catch (NumberFormatException e) {
            System.err.println("Неверный формат телефона");
        }
        return 0;

    }
    public String takeGender(){
        String gender = data[5];
        if ((!"m".equals(gender)) && (!"f".equals(gender))){
            System.err.println("Необходимо ввести f или m");
        }
        return gender;

    }

}
