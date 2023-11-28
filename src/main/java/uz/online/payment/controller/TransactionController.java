package uz.online.payment.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uz.online.payment.domein.Transaction;
import uz.online.payment.service.TransactionService;

@RestController
@RequestMapping("/payment")
@RequiredArgsConstructor
public class TransactionController {

    private final TransactionService transactionService;


    @PostMapping("/save")
    public ResponseEntity create(@RequestBody Transaction transaction) {
        Transaction result = transactionService.save(transaction);
        return ResponseEntity.ok(result);
    }

    @PutMapping("/update")
    public ResponseEntity update(@RequestBody Transaction transaction) {
        Transaction result = transactionService.save(transaction);
        return ResponseEntity.ok(result);
    }

    @GetMapping("/getAll")
    public ResponseEntity findAll() {
        return ResponseEntity.ok(transactionService.findAll());
    }

    @GetMapping("/getMsg")
    public ResponseEntity getMsg() {
       return ResponseEntity.ok("Application connect !");
    }
}
