package pj.s30566.shopee_s30566.Services;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import pj.s30566.shopee_s30566.Components.Storage;
import pj.s30566.shopee_s30566.Objects.Cart;
import pj.s30566.shopee_s30566.Objects.Customer;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@ExtendWith(MockitoExtension.class)
@SpringBootTest
public class CheckoutIntegrationTest {

    @Autowired
    private Checkout checkout;
    @Autowired
    private Storage storage;

    @Test
    void finalizePurchaseIntegrationTest(){
        Customer customer = new Customer(1, "Adam", 30);
        Cart cart = new Cart(1, customer);
        cart.addItemsToCart("milk");
        cart.addItemsToCart("Rodzynki");

        boolean result = checkout.finalizePurchase(cart);

        assertTrue(result);
        assertEquals((30 - storage.getPrice("milk") - storage.getPrice("Rodzynki")), customer.getBalance());
    }
}
