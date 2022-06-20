import java.util.ArrayList;
import java.util.List;

public class TotalAccountList {
    private List<Customer> customerList;

    public TotalAccountList() {
        this.customerList = new ArrayList<>();
    }
    public void addCustomer(Customer customer){
        customerList.add(customer);
    }
    public ArrayList<Customer> getCustomerList() {
        return ((ArrayList) this.customerList);
    }

    @Override
    public String toString() {
        return customerList.toString();
    }
}
