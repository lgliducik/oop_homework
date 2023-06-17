package HomeWork;

public class Persister extends PersisterAbstract implements Saver {
	private User user;

	public Persister(User user) {
		super(user);
	}

	@Override
	public void save(){
		System.out.println("Save user: " + super.toString());
	}
}