package pj.s30566.shopee_s30566.Objects;

public class Customer {
    private int id;
    private String username;
    private double balance;

    public Customer(int id, String username, double balance){
        this.id = id;
        this.username = username;
        this.balance = balance;
    }

    public Customer(String username, double balance){
        this.username = username;
        this.balance = balance;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }




}
