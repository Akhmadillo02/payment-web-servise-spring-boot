package uz.online.payment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.online.payment.domein.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {

}
