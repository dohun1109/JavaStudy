package StandardOfJava.record;

public class student {

    private String id;
    private String name;
    private String dataOfBirth;
    private String classList;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDataOfBirth() {
        return dataOfBirth;
    }

    public void setDataOfBirth(String dataOfBirth) {
        this.dataOfBirth = dataOfBirth;
    }

    public String getClassList() {
        return classList;
    }

    public void setClassList(String classList) {
        this.classList = classList;
    }

    public student(String id, String name, String dataOfBirth, String classList) {
        this.id = id;
        this.name = name;
        this.dataOfBirth = dataOfBirth;
        this.classList = classList;
    }


    @Override
    public String toString() {
        return "student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", dataOfBirth='" + dataOfBirth + '\'' +
                ", classList='" + classList + '\'' +
                '}';
    }

}
