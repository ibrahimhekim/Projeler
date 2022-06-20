import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private String mail;
    private double bankAccount =1000.00;
    private int number;
    public Customer(String name, String mail, int number) {
        this.name = name;
        this.mail = mail;
        this.number = number;

    }

    public void withdraw(double value){
        double newAccount = this.bankAccount-value;
        if (newAccount<0){
            System.out.println("bakiye yetersiz");
        }
        else {
            System.out.println("işleminiz gerçekleştirilmiştir");
            this.bankAccount = newAccount;
        }
    }
    public void deposit(double value){
        if (value<0){
            System.out.println("geçersiz işlem");
        }
        else{
            this.bankAccount = bankAccount+ value;
            System.out.println("bakiyeniz : "+bankAccount);
        }
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
    public double getBankAccount(){
        return bankAccount;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", mail='" + mail + '\'' +
                ", bankAccount=" + bankAccount +
                //", number=" + number +
                '}';
    }
}
