package com.yearup.AccountingLedgerRemake2.DAO;

import com.yearup.AccountingLedgerRemake2.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

// Works with transactions by there ID
public interface TransactionDAO extends JpaRepository<Transaction, Integer > {
}
