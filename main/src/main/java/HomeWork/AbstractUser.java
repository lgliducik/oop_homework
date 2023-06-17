package HomeWork;

public abstract class AbstractUser {
    protected  String name;
    public AbstractUser(String name) {
        this.name = name;
    }

    String getName(){
        return name;
    };
}
