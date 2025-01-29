package pj.s30566.shopee_s30566.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pj.s30566.shopee_s30566.Components.Storage;
import pj.s30566.shopee_s30566.Objects.Cart;

import java.util.Iterator;

@Service
public class Checkout {
    private Storage storage;
    @Autowired
    public Checkout(Storage storage){
        this.storage = storage;
    }

    public boolean finalizePurchase(Cart cart){
        double total = 0;

        Iterator<String> iterator = cart.getItems().iterator();
        while (iterator.hasNext()){
            String item = iterator.next() ;
            if (storage.hasProduct(item)){
                total += storage.getPrice(item);
            }
        }

        if (cart.getCustomer().getBalance() >= total){
            cart.getCustomer().substractBalance(total);
            return true;
        }

        return false;
    }



}
