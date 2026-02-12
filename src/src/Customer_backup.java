//public class Customer_backup {
//    private String firstName;
//    private String lastName;
//    private Account[] acct;
//    private int numOfAccount;
//
//    public Customer(String firstName, String lastName) {
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.acct = new Account[5];
//        this.numOfAccount = 0;
//    }
//
//    public Customer() {
//        this("", "");
//    }
//
//    public void setFirstName(String firstName) { this.firstName = firstName; }
//    public void setLastName(String lastName) { this.lastName = lastName; }
//
//    public String getFirstName() { return firstName; }
//    public String getLastName() { return lastName; }
//
//
//    public void addAccount(Account ac) {
//        acct[numOfAccount] = ac;
//        numOfAccount++;
//    }
//
//    public Account getAccount(int index) {
//        return acct[index];
//    }
//
//    public int getNumOfAccount() {
//        return numOfAccount;
//    }
//
//    @Override
//    public String toString() {
//        return firstName + " " + lastName + " has " + numOfAccount + " accounts.";
//    }
//    
//     public boolean equals(Customer c) {
//        return this.firstName.equals(c.getFirstName()) && this.lastName.equals(c.getLastName());
//    }
//}