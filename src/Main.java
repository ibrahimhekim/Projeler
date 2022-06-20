import java.util.Scanner;

public class Main {

    public static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        Customer ibrahim = new Customer("ibrahim","ibrahim@mail",555);
        /*System.out.println(ibrahim.getBankAccount());

        ibrahim.withdraw(1200.00);
        System.out.println(ibrahim.getBankAccount());
        ibrahim.withdraw(800);
        System.out.println(ibrahim.getBankAccount());*/

        Customer safak = new Customer("safak","safak@mail",444);
        /*System.out.println(safak.getBankAccount());
        safak.deposit(-555);
        System.out.println(safak.getBankAccount());
        safak.deposit(5000.45);
        System.out.println(safak.getBankAccount());
        System.out.println(safak.getMail());
        safak.setMail("abc@mail");
        System.out.println(safak.getMail());*/
        TotalAccountList accountList = new TotalAccountList();
        accountList.addCustomer(ibrahim);
        accountList.addCustomer(safak);


        boolean flag = true;

        while (flag) {
            String answer = showAction();
            switch (answer) {
                case "0":
                    for (Customer c:accountList.getCustomerList()) {
                        System.out.println(c);
                    }
                    flag=false;
                    break;
                case "1":
                    Customer newCustomer = addNewCustoemr();
                    accountList.addCustomer(newCustomer);
                    break;
                default:
                    System.out.println("yanlis islem");
                    break;
            }
        }

        /*for (Customer c:accountList.getCustomerList()) {
            System.out.println(c);
        }*/

        //System.out.println(accountList);
    }
    public static String showAction(){
        System.out.println("işlem seçin\n(0)çıkmak\n(1)eklemek");
        String answer=scanner.next();
        return answer;
    }
  public static Customer addNewCustoemr(){
      System.out.println("yeni kullanıcı bilgileri gir :");
      System.out.println("isim : \n");
      String name = scanner.next();
      System.out.println("mail : \n");
      String mail = scanner.next();
      System.out.println("numara : \n");
      int number = scanner.nextInt();
      Customer newCustomer = new Customer(name, mail,number);
      return newCustomer;
  }

}
