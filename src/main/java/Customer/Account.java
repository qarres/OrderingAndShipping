package customer;

import builling.BankAccount;
import builling.BankAccountManager;
import ordering.Order;
import product.LineProduct;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by MARC LAZOLA TORRE on 21/01/2017.
 */

public class Account {

    private static int idCounter = 0;
    private int id;
    private Customer owner;
    private String userName, password;
    private BankAccount bankAccount;

    private List<Order> history;

    Account(Customer owner, String userName, String password) {
        this.owner = owner;
        this.userName = userName;
        this.password= password;
        history = new ArrayList<Order>();
    }

    public boolean connection (String userName, String password){
        return (this.password.equals(password) && this.userName.equals(userName));
    }

    public boolean order (List<LineProduct> commend) {
        Order order = new Order(commend, this);
        if (order.makeTheOrder()) {
            history.add(order);
            return true;
        }
        return false;

    }

    public String getOrderingAddress (){
        return owner.getAddress();
    }

    public List<Order> getHistory() {
        return history;
    }

    public void setBankAccount(int bankAccountNumber, int secretCode) {
        BankAccountManager bankAccountManager = BankAccountManager.getInstance();
        this.bankAccount = bankAccountManager.findBankAccount(bankAccountNumber, secretCode);
    }

    public BankAccount getBankAccount() {
        return bankAccount;
    }

    public String getFistNameCustomer (){
        return owner.getFirstName();
    }

    public String getSecondNameCustomer (){
        return owner.getSecondName();
    }
}
