package uz.online.payment.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import uz.online.payment.domein.Transaction;
import uz.online.payment.repository.TransactionRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TransactionService {

    private final TransactionRepository transactionRepository;

    public Transaction save(Transaction transaction) {
        return transactionRepository.save(transaction);
    }

    public List<Transaction> findAll() {
        return transactionRepository.findAll();
    }
}
