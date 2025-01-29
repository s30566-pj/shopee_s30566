package pj.s30566.shopee_s30566.Objects;

import java.util.Map;

public class Cart {

    private int id;
    private Customer customer;
    private Map<String, Integer> items;

    public Cart(int id, Customer customer, Map<String, Integer> items) {
        this.id = id;
        this.customer = customer;
        this.items = items;
    }

    public Cart(Customer customer, Map<String, Integer> items) {
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

    public Map<String, Integer> getItems() {
        return items;
    }

    public void setItems(Map<String, Integer> items) {
        this.items = items;
    }


}
