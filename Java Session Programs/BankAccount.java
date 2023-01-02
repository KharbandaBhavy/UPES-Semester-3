public class BankAccount {
    private String accountNumber;
    private double totalBalance;
    private String accountOwnerName;
    private int accountOwnerAge;
    private String accountOwnerEmail;

    //alt + insert can allow us to generate all field quickly

    public void deposit(double amount){
        totalBalance+=amount;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getTotalBalance() {
        return totalBalance;
    }

    public void setTotalBalance(double totalBalance) {
        this.totalBalance = totalBalance;
    }

    public String getAccountOwnerName() {
        return accountOwnerName;
    }

    public void setAccountOwnerName(String accountOwnerName) {
        this.accountOwnerName = accountOwnerName;
    }

    public int getAccountOwnerAge() {
        return accountOwnerAge;
    }

    public void setAccountOwnerAge(int accountOwnerAge) {
        this.accountOwnerAge = accountOwnerAge;
    }

    public String getAccountOwnerEmail() {
        return accountOwnerEmail;
    }

    public void setAccountOwnerEmail(String accountOwnerEmail) {
        this.accountOwnerEmail = accountOwnerEmail;
    }
}