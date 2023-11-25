package com.metaphorce.FabianLanderos.cineMagic.Repository;

import com.metaphorce.FabianLanderos.cineMagic.Entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPaymentRepository extends JpaRepository<Payment, Long> {
}
