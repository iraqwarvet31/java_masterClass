public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public String getFirstName() {
        System.out.println(this.firstName);
        return this.firstName;
    }
    public String getLastName() {
        System.out.println(this.lastName);
        return this.lastName;
    }
    public int getAge() {
        System.out.println(this.age);
        return this.age;
    }
    public void setFirstName(String name) {
        this.firstName = name;
        System.out.println("First name = " + this.firstName);
    }
    public void setLastName(String name) {
        this.lastName = name;
        System.out.println("Last name = " + this.lastName);
    }
    public void setAge(int newAge) {
        if (newAge > -1 && newAge < 101) {
            this.age = newAge;
        } else {
            this.age = 0;
        }
    }
    public boolean isTeen() {
        return this.age > 12 && this.age < 20;
    }
    public String getFullName() {
        String first = this.firstName;
        String last = this.lastName;

        if (first.isEmpty() && last.isEmpty()) {
            return "";
        } else if (last.isEmpty()) {
            return first;
        } else if (first.isEmpty()) {
            return last;
        } else {
            return first + " " + last;
        }
    }
}
