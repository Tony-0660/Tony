package API.classes;

public class Mentor {
    String name;
    int id;

    public Mentor(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Mentor{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
