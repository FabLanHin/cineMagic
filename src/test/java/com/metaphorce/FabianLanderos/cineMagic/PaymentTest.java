package com.metaphorce.FabianLanderos.cineMagic;

import com.metaphorce.FabianLanderos.cineMagic.Entity.Payment;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class PaymentTest {

    @Test
    public void testSubmitAdminName(){
        List<Payment> payments = new ArrayList<>();

        for (Payment payment : payments) {
            String name = payment.getUserName();
            assertNotEquals("", name);
        }
    }
}
