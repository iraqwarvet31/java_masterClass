public class Main {
    public static void main(String[] args) {
        Contact larry = Contact.createContact("Larry", "6612257267");
        Contact araceli = Contact.createContact("Araceli", "6192134576");
        Contact crystal = Contact.createContact("Crystal", "6618866734");
        Contact joe = Contact.createContact("Joe", "2132223333");

        MobilePhone billsPhone = new MobilePhone("8182394012");
        billsPhone.addNewContact(larry);
        billsPhone.addNewContact(araceli);
        billsPhone.addNewContact(crystal);
        billsPhone.addNewContact(joe);
//        billsPhone.printContacts();
//        [larry, araceli, crystal, joe]

        billsPhone.removeContact(larry);
//        billsPhone.printContacts(); // [araceli, crystal, joe]

        billsPhone.updateContact(araceli, new Contact("Tom", "66122222222"));
        billsPhone.printContacts();
    }
}
