public class Main {
    public static void main(String[] args) {
        Person person1 = new Person();

        person1.setFirstName("Larry");
        person1.setLastName("");
        person1.setAge(18);
        System.out.println(person1.isTeen());
        System.out.println(person1.getFullName());
    }
}
