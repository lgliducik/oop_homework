package HomeWork;

public class Main{
	public static void main(String[] args){
		User user = new User("Bob");
		Report report = new Report(user);
		report.report();
		Persister persister = new Persister(user);
		persister.save();
	}
}