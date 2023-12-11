package main;

class Account{
    private long acc_no;
    private String name,email;
    private float amount;

    public long getAcc_no() {
        return acc_no;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public float getAmount() {
        return amount;
    }

    public void setAcc_no(long acc_no) {
        this.acc_no = acc_no;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }
}
public class Encapsulation {

    public static void main(String[] args) {
        Account ac = new Account();
        ac.setAcc_no(12345);
        ac.setAmount(21000);
        ac.setEmail("manuraj0307@gmail.com");
        ac.setName("Manoranjan Kumar Jha");

        System.out.println(ac.getName()+" "+ac.getAcc_no()+" "+ac.getAmount()+" "+ac.getEmail());

        ac.setAcc_no(7560504000L);
        ac.setName("Raj Kumar");
        ac.setEmail("raj@gmail.com");
        ac.setAmount(500000);

        System.out.println(ac.getAcc_no()+" "+ac.getName()+" "+ac.getEmail()+" "+ac.getAmount());

    }
}
