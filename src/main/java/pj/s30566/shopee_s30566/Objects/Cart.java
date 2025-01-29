package pj.s30566.shopee_s30566.Objects;

import java.util.ArrayList;
import java.util.List;

public class Cart {

    private int id;
    private Customer customer;
    private List<String> items;

    public Cart(int id, Customer customer, List<String> items) {
        this.id = id;
        this.customer = customer;
        this.items = items;
    }
    public Cart(int id, Customer customer) {
        this.id = id;
        this.customer = customer;
        this.items = new ArrayList<String>();
    }

    public Cart(Customer customer, List<String> items) {
        this.customer = customer;
        this.items = items;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<String> getItems() {
        return items;
    }

    public void setItems(List<String> items) {
        this.items = items;
    }


}
