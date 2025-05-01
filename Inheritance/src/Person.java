public class Person {
    private String firstName;
    private String lastName;
    private String ID;
    private String title;
    private int YOB;

    public Person(String firstName, String lastName, String ID, String title, int YOB) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ID = ID;
        this.title = title;
        this.YOB = YOB;
    }

    // Setters
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setYOB(int YOB) {
        this.YOB = YOB;
    }

    // Getters
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getID() {
        return ID;
    }

    public String getTitle() {
        return title;
    }

    public int getYOB() {
        return YOB;
    }

    public String fullName() {
        return firstName + " " + lastName;
    }

    public String formalName() {
        return title + " " + fullName();
    }

    public String toCSV() {
        return firstName + "," + lastName + "," + ID + "," + title + "," + YOB;
    }

    public String toXML() {
        return "<Person>" +
                "<firstName>" + firstName + "</firstName>" +
                "<lastName>" + lastName + "</lastName>" +
                "<ID>" + ID + "</ID>" +
                "<title>" + title + "</title>" +
                "<YOB>" + YOB + "</YOB>" +
                "</Person>";
    }

    public String toJSON() {
        return "{ \"firstName\": \"" + firstName + "\", " +
                "\"lastName\": \"" + lastName + "\", " +
                "\"ID\": \"" + ID + "\", " +
                "\"title\": \"" + title + "\", " +
                "\"YOB\": " + YOB + " }";
    }
}
