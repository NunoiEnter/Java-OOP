import java.util.ArrayList;

public class Customer {
    private String firstName;
    private String lastName;
    private ArrayList<Account> acct;

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        acct = new ArrayList<Account>(); 
    }

    public Customer() {
        this("", "");
    }

    public void setFirstName(String firstName) { this.firstName = firstName; }
    public void setLastName(String lastName) { this.lastName = lastName; }
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }


    public void addAccount(Account ac) {
        acct.add(ac);
    }

    public Account getAccount(int index) {
        return acct.get(index);
    }

    public int getNumOfAccount() {
        return acct.size();
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " has " + getNumOfAccount() + " accounts.";
    }
    
    public boolean equals(Customer c) {
        return this.firstName.equals(c.getFirstName()) && this.lastName.equals(c.getLastName());
    }
}