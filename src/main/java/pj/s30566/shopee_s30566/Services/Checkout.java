package pj.s30566.shopee_s30566.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pj.s30566.shopee_s30566.Components.Storage;
import pj.s30566.shopee_s30566.Objects.Cart;

import java.math.BigDecimal;
import java.util.Map;

@Service
public class Checkout {
    private Storage storage;
    @Autowired
    public Checkout(Storage storage){
        this.storage = storage;
    }

    public boolean finalizePurchase(Cart cart){
        double total = 0;

        for (Map.Entry<String, Integer> entry : cart.getItems().entrySet()){
            String item = entry.getKey();
            int quantity = entry.getValue();
            if (storage.hasProduct(item)){
                total = storage.getPrice(item)*quantity;
            }
        }

        if (cart.getCustomer().getBalance() >= total){
            cart.getCustomer().substractBalance(total);
            return true;
        }

        return false;
    }



}
