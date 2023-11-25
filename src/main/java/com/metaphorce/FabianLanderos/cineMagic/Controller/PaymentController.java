package com.metaphorce.FabianLanderos.cineMagic.Controller;

import com.metaphorce.FabianLanderos.cineMagic.Entity.Payment;
import com.metaphorce.FabianLanderos.cineMagic.Exception.DigitCardIncorrectException;
import com.metaphorce.FabianLanderos.cineMagic.Exception.EmptyErrorException;
import com.metaphorce.FabianLanderos.cineMagic.Exception.NumCharException;
import com.metaphorce.FabianLanderos.cineMagic.Service.IPaymentService;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/payments/v0")
public class PaymentController {

    @Autowired
    IPaymentService iPaymentService;

    @GetMapping("/payment")
    public List<Payment> getPayment(){
        List<Payment> payment = new ArrayList<>();
        payment = iPaymentService.getPayment();
        return payment;
    }

    @GetMapping("/payment/{id}")
    public Payment getPaymentById(@PathVariable Long id){
        return iPaymentService.getPaymentById(id);
    }

    @PostMapping("/payment")
    public Payment addPayment(@Valid @RequestBody Payment payment, BindingResult result){

        if(result.hasErrors()){
            throw new EmptyErrorException("Empty Errors", "Error 408", HttpStatus.BAD_REQUEST, result);
        } else if (payment.getUserName().length() > 2) {
            throw new NumCharException("Number of characters incorrect (Length)", "Error 411", HttpStatus.BAD_REQUEST, result);
        } else if (payment.getCardNumber() == 16){
            throw new DigitCardIncorrectException("The number of digits in a card must be 16", "Error 411", HttpStatus.BAD_REQUEST, result);
        }

        return iPaymentService.addPayment(payment);
    }

    @DeleteMapping("/payment")
    public void deletePayment(@RequestBody Payment payment){
        iPaymentService.deletePayment(payment);
    }

    @PutMapping("/payment/{id}")
    public List<Payment> updatePayment(@PathVariable int id, Payment payment){
        return iPaymentService.updatePayment(id, payment);
    }
}
