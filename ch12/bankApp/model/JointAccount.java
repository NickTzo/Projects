package gr.aueb.cf.ch12.bankApp.model;

/**
 * An app that joins two accounts
 * @version 1.0
 * @author Nikos
 * @since 1.0
 */
public class JointAccount {

    private int id;
    private String iban;
    private  String firstname;
    private String lastname;
    private  String ssn;

    private double balance;
    private int id2;
    private String iban2;
    private  String firstname2;
    private String lastname2;
    private  String ssn2;

    private double balance2;

    private String newIban;

    public JointAccount() {
    }

    public JointAccount(int id, String iban, String firtname, String lastname, String ssn, double balance, int id2, String iban2, String firtname2, String lastname2, String ssn2, double balance2, String newIban) {
        this.id = id;
        this.iban = iban;
        this.firstname = firtname;
        this.lastname = lastname;
        this.ssn = ssn;
        this.balance = balance;
        this.id2 = id2;
        this.iban2 = iban2;
        this.firstname2 = firtname2;
        this.lastname2 = lastname2;
        this.ssn2 = ssn2;
        this.balance2 = balance2;
        this.newIban = newIban;
    }

    public String getNewIban() {
        return newIban;
    }

    public void setNewIban(String newIban) {
        this.newIban = newIban;
    }

    public int getId2() {
        return id2;
    }

    public void setId2(int id2) {
        this.id2 = id2;
    }

    public String getIban2() {
        return iban2;
    }

    public void setIban2(String iban2) {
        this.iban2 = iban2;
    }

    public String getFirstname2() {
        return firstname2;
    }

    public void setFirstname2(String firstname2) {
        this.firstname2 = firstname2;
    }

    public String getLastname2() {
        return lastname2;
    }

    public void setLastname2(String lastname2) {
        this.lastname2 = lastname2;
    }

    public String getSsn2() {
        return ssn2;
    }

    public void setSsn2(String ssn2) {
        this.ssn2 = ssn2;
    }

    public double getBalance2() {
        return balance2;
    }

    public void setBalance2(double balance2) {
        this.balance2 = balance2;
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

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
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

    public String joinAccountToString(){
        return "(" + id + ", " + iban + ", " + firstname + ", " + lastname + ", " + ssn + ")" +
                "(" + id2 + ", " + iban2 + ", " + firstname2 + ", " + lastname2 + ", " +ssn2 +")" +
                "(" + "New Iban: " +  newIban + " With the new balanec: " + balance + ")";
    }

    public boolean isSsnValid(String ssn){
        return this.ssn.equals(ssn);
    }

    /**
     * Calculate the total balance
     * @return  the tolal balance from the two accounts
     */
    public double getAccountBalance(){
        balance = getBalance2() + getBalance();
        return balance;
    }

    /**
     * Join two accounts if the have valid ssn
     * @param ssn from the first customer
     * @param ssn2 from the second customer
     * @throws Exception if someone has not filled his ssn
     */
    public void jointAccount(String ssn,String ssn2) throws Exception{
        try {
            if(ssn == null || ssn2 == null){
                throw new Exception("Not correct Ssn");
            }
            newIban = "GR13489";
            balance = getAccountBalance();

        }catch (Exception e){
            e.printStackTrace();
            throw e;
        }
    }
}
