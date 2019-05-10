public class Contact {

    private final String name;
    private final String lastname;
    private final String mail;
    private final String phone;

    Contact(final ContactBuilder contactBuilder) {
        this.name = contactBuilder.getName();
        this.lastname = contactBuilder.getLastname();
        this.mail = contactBuilder.getMail();
        this.phone = contactBuilder.getPhone();
    }
    
    public class ContactBuilder {

    private String name;
    private String lastname;
    private String mail;
    private String phone;

    public ContactBuilder name(final String name) {
        this.name = name;
        return this;
    }

    public ContactBuilder lastname(final String lastname) {
        this.lastname = lastname;
        return this;
    }

    public ContactBuilder mail(final String mail) {
        this.mail = mail;
        return this;
    }

    public ContactBuilder phone(final String phone) {
        this.phone = phone;
        return this;
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public String getMail() {
        return mail;
    }

    public String getPhone() {
        return phone;
    }

    public Contact build() {
        return new Contact(this);
    }
} 
}