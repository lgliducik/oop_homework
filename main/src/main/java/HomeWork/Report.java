package HomeWork;

public class Report implements Reportable {
    User user;

    public Report(User user) {
        this.user = user;
    }
    public void report(){
        System.out.println("Report for user: " + user.getName());
    }
}
