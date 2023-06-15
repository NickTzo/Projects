package gr.aueb.cf.ch12.bankApp.model;

/**
 * An app that give you a loan if you need more money
 */
public class overDraftAccount {
    private int id;
    private String iban;
    private  String firtname;
    private String lastname;
    private  String ssn;
    private double balance;
    private double loan;

    public overDraftAccount() {
    }

    public overDraftAccount(int id, String iban, String firtname, String lastname, String ssn, double balance, double loan) {
        this.id = id;
        this.iban = iban;
        this.firtname = firtname;
        this.lastname = lastname;
        this.ssn = ssn;
        this.balance = balance;
        this.loan = loan;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public String getFirtname() {
        return firtname;
    }

    public void setFirtname(String firtname) {
        this.firtname = firtname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getLoan() {
        return loan;
    }

    public void setLoan(double loan) {
        this.loan = loan;
    }

    public boolean isSsnValid(String ssn){
        return this.ssn.equals(ssn);
    }

    public double getAccountBalance(){
        return getBalance();
    }

    public void deposit(double amount) throws Exception{
        try {
            if(amount < 0){
                throw new Exception("Negative amount exception");
            }
            balance += amount;
        }catch (Exception e){
            e.printStackTrace();
            throw e;
        }
    }

    public String overDraftAccountToString(){
        return "(" + id + ", " + iban + ", " + firtname + ", " + lastname + ", " + ssn + ", " + ", " + loan + ")";
    }

    /**
     * Withdraw an amount of money from an account based on valid ssn
     * @param amount  the money to be withdrawn
     * @param ssn the given ssn
     * @throws Exception The ssn is not valid
     */

    public void  OverDraftAccount(double amount,String ssn) throws  Exception{
        try {
            if(!isSsnValid(ssn)){
                throw new Exception("Ssn not valid exception");
            }
            if(amount < balance){
                balance -= amount;

            }else{
                loan = balance - amount;
            }


        }catch (Exception e){
            e.printStackTrace();
            throw e;
        }
    }

}
