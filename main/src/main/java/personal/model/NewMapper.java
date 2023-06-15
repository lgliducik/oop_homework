package personal.model;

public class NewMapper implements Mapper{
    @Override
    public String map(User user) {
        return String.format("%s %s %s %s", user.getId(), user.getFirstName(), user.getLastName(), user.getPhone());
    }

    @Override
    public User map(String line) {
        String[] lines = line.split(" ");
        System.out.println(lines);
        return new User(lines[0], lines[1], lines[2], lines[3]);
    }
}
