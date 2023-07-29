package com.yearup.AccountingLedgerRemake2.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalTime;
// makes getters and setters for ya
@Data
//makes constructor
@AllArgsConstructor
//entity tells it to make a table for transactions
@Entity
public class Transaction {
        //    type (a String representing the type of transaction)
        private String type;
        //        date (a LocalDate representing the date of the transaction)
        private LocalDate date;
        //        time (a LocalTime representing the time of the transaction)
        private LocalTime time ;
        //        amount (a double representing the amount of the transaction),
        private double amount;
        //        vendor (a String representing the vendor involved in the transaction).
        private String vendor;
//        ID makes it primary key
        @Id
//        makes it auto increment
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int ID;
}
