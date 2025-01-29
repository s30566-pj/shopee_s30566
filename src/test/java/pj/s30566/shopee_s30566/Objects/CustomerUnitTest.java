package pj.s30566.shopee_s30566.Objects;

import org.junit.jupiter.api.Test;


import java.math.BigDecimal;

import static org.assertj.core.api.Assertions.assertThat;



public class CustomerUnitTest {


    @Test
    void doesSubstractBalance(){
        BigDecimal value = new BigDecimal("10.15");
        Customer customer = new Customer(1, "test", 11);

        customer.substractBalance(value.doubleValue());

        double newBalance = customer.getBalance();
        assertThat(newBalance).isEqualTo(11 - 10.15);


    }

}
