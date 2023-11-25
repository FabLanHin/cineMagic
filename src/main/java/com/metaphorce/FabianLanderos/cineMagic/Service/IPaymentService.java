package com.metaphorce.FabianLanderos.cineMagic.Service;

import com.metaphorce.FabianLanderos.cineMagic.Entity.Payment;

import java.util.List;

public interface IPaymentService {

    List<Payment> getPayment();
    Payment getPaymentById(Long id);
    Payment addPayment(Payment payment);
    void deletePayment(Payment payment);
    List<Payment> updatePayment(int id, Payment payment);
}
