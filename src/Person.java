public class Person {
    double rando = 1000000 + (Math.random() * 9000000);
    int id = (int) rando;
    String first;
    String last;
    public Person(String first_name, String last_name) {
        this.first = first_name;
        this.last = last_name;
    }
}
