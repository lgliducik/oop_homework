package personal.views.validator;

public class NameSurnameValidator {
    String userInput;

    public NameSurnameValidator(String userInput) {
        this.userInput = userInput;
    }

    public void Validate() throws Exception{
        if (!userInput.matches("^\\S+$")){
            throw new Exception("Валидация не прошла");
        }
    }
}
