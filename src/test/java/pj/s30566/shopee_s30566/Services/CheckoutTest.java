package pj.s30566.shopee_s30566.Services;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import pj.s30566.shopee_s30566.Components.Storage;
import pj.s30566.shopee_s30566.Objects.Cart;
import pj.s30566.shopee_s30566.Objects.Customer;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class CheckoutTest {

    @Mock
    private Storage storage;

    @InjectMocks
    private Checkout checkout;

    @Test
    void doesFinalizePurchase(){
        Customer customer = new Customer(1, "Jan", 20);
        Cart cart = new Cart(1, customer);
        cart.addItemsToCart("mleko");
        cart.addItemsToCart("mleko");
        cart.addItemsToCart("piwo");

        when(storage.hasProduct("mleko")).thenReturn(true);
        when(storage.getPrice("mleko")).thenReturn(7.50);
        when(storage.hasProduct("piwo")).thenReturn(true);
        when(storage.getPrice("piwo")).thenReturn(3.0);

        boolean result = checkout.finalizePurchase(cart);

        assertTrue(result);
        assertEquals((20 - 7.5 - 7.5 - 3.0), customer.getBalance());
    }

}
