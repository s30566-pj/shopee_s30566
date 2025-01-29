package pj.s30566.shopee_s30566.Components;

import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

@Component
public class Storage {


    private Map<String, BigDecimal> products;

    public Storage(){
        products = new HashMap<>();
        products.put("Rodzynki", new BigDecimal("2.50"));
        products.put("Paluszki", new BigDecimal("5.50"));
        products.put("Proszek do prania", new BigDecimal("5.50"));
    }

    public void addItem(String itemName, double itemPrice){
        products.put(itemName, BigDecimal.valueOf(itemPrice));
    }

    public double getPrice(String item) {
        return products.get(item).doubleValue();
    }

    public boolean hasProduct(String item){
        return products.containsKey(item);
    }

    public Map<String, BigDecimal> getProducts() {
        return products;
    }

    public void setProducts(Map<String, BigDecimal> products) {
        this.products = products;
    }

}
