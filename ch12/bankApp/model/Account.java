package gr.aueb.cf.ch12.bankApp.model;

    public class Account {
        private int id;
        private String iban;
        private  String firtname;
        private String lastname;
        private  String ssn;
        private double balance;

        public Account(){};

        public Account(int id, String iban, String firtname, String lastname, String ssn, double balance) {
            this.id = id;
            this.iban = iban;
            this.firtname = firtname;
            this.lastname = lastname;
            this.ssn = ssn;
            this.balance = balance;
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


        //Public API


        /**
         * Deposits a ceratain amount of money.
         *
         * @param amount the amount of money
         *
         * @throws Exception if the amount is negative
         */
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


        /**
         * Withdraw an amount of money from an account based on valid ssn
         * @param amount        the money to be withdrawn
         * @param ssn           the given ssn
         * @throws Exception    if the ammount is greater tha the balance or the ssn is not valid
         */

        public void withdraw(double amount, String ssn) throws Exception{
            try {
                if(!isSsnValid(ssn)){
                    throw new Exception("Ssn not valid exception");
                }
                if(amount > balance){
                    throw new Exception("Insufficient balance exception");
                }
                balance -= amount;
            }catch (Exception e){
                e.printStackTrace();
                throw e;
            }
        }

        /**
         * Returns the balance of the account
         * @return the accounts balance
         */
        public double getAccountBalance(){
            return getBalance();
        }

        /**
         * returns the accounts state in string format
         * @return  the string-representation of the  state of the account
         */
        public String accountToString(){
            return "(" + id + ", " + iban + ", " + firtname + ", " + lastname + ", " + ssn + ", " + balance + ")";
        }

        public boolean isSsnValid(String ssn){
            return this.ssn.equals(ssn);
        }
}
