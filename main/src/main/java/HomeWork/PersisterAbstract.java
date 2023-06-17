package HomeWork;

public abstract class PersisterAbstract {

    private User user;

    public PersisterAbstract(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "PersisterAbstract{" +
                "user=" + this.user.getName() +
                '}';
    }
}
