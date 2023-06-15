package gr.aueb.cf.ch12.bankApp;
import gr.aueb.cf.ch12.bankApp.model.overDraftAccount;
import gr.aueb.cf.ch12.bankApp.model.JointAccount;

public class main {
    public static void main(String[] args) {
        overDraftAccount alice = new overDraftAccount(1,"GR12345", "Alice","W.","F12345", 350.0,0);
        JointAccount bob = new JointAccount(1,"GR123","Alice","W.","F123",153.0,2,"GR698","Bob","M.","F984",6548.5,"965");
        try{

            alice.OverDraftAccount(500,"F12345");
            System.out.println(alice.overDraftAccountToString());
            System.out.println("The new balance is: "+ alice.getLoan());

            bob.jointAccount("F123","F984");
            System.out.println(bob.joinAccountToString());
            System.out.println();

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
