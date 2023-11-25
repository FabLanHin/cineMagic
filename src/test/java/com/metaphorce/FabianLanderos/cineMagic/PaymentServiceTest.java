package com.metaphorce.FabianLanderos.cineMagic;

import com.metaphorce.FabianLanderos.cineMagic.Entity.Payment;
import com.metaphorce.FabianLanderos.cineMagic.Repository.IPaymentRepository;
import com.metaphorce.FabianLanderos.cineMagic.Service.PaymentService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class PaymentServiceTest {

    @InjectMocks
    PaymentService paymentService;

    @Mock
    IPaymentRepository iPaymentRepository;

    Payment payment;

    @BeforeEach
    public void SetUp(){
        payment = new Payment(1L, "Lorena", "Paseo de las Golondrinas 304", "BBVA", 478016002, 456, 12.66, 3);
    }

    @Test
    public void testIAdminRepositoryById(){
        when(iPaymentRepository.findById(1L)).thenReturn(Optional.ofNullable(payment));
        Payment actualPayment = paymentService.getPaymentById(1L);

        assertEquals(payment, actualPayment);
    }
}
