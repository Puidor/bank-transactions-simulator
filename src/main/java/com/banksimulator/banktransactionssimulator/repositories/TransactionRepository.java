package com.banksimulator.banktransactionssimulator.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.banksimulator.banktransactionssimulator.domain.transaction.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {

}
