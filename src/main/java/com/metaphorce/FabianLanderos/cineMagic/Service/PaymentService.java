package com.metaphorce.FabianLanderos.cineMagic.Service;

import com.metaphorce.FabianLanderos.cineMagic.Entity.Payment;
import com.metaphorce.FabianLanderos.cineMagic.Repository.IPaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PaymentService implements IPaymentService{

    @Autowired
    IPaymentRepository iPaymentRepository;

    @Override
    public List<Payment> getPayment() {
        List<Payment> payments = new ArrayList<>();
        payments = iPaymentRepository.findAll();
        return payments;
    }

    @Override
    public Payment getPaymentById(Long id) {
        Payment payment = new Payment();
        payment = iPaymentRepository.findById(id).orElse(null);
        return payment;
    }

    @Override
    public Payment addPayment(Payment payment) {
        return iPaymentRepository.save(payment);
    }

    @Override
    public void deletePayment(Payment payment) {
        iPaymentRepository.delete(payment);
    }

    @Override
    public List<Payment> updatePayment(int id, Payment payment) {
        List<Payment> payments = new ArrayList<>();
        payments.set(id, payment);
        return payments;
    }
}
