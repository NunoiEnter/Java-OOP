 public class Customer {
    private String firstName;
    private String lastName;
    private CheckingAccount acct;

    public Customer(String firstName, String lastName, CheckingAccount acct) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.acct = acct;
    }
    public Customer(String firstName, String lastName) {
        this(firstName, lastName, null);
    }
    public Customer() {
        this("", "", null);
    }
    // Setters
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setAcct(CheckingAccount acct) {
        this.acct = acct;
    }
    // Getters
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public CheckingAccount getAcct() {
        return acct;
    }
    @Override
    public String toString() {
        if (acct == null) {
            return firstName + " " + lastName + " doesn’t have account.";
        } else {
            return "The " + firstName + " account has " + acct.getBalance() + " baht and " + acct.getCredit() + " credits.";
        }
    }
    public boolean equals(Customer c) {
        return this.firstName.equals(c.getFirstName()) && this.lastName.equals(c.getLastName());
    }
} 