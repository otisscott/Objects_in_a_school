public class Person {
    double id = 1000000 + (Math.random() * 9000000);
    String first;
    String last;
    public Person(String first_name, String last_name) {
        this.first = first_name;
        this.last = last_name;
    }
}
