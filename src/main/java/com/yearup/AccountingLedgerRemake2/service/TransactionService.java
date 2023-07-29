package com.yearup.AccountingLedgerRemake2.service;

import com.yearup.AccountingLedgerRemake2.DAO.TransactionDAO;
import com.yearup.AccountingLedgerRemake2.model.Transaction;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionService {
    private TransactionDAO transactionDAO;

    public List<Transaction> getAll(){
        return this.transactionDAO.findAll();
    }
}

