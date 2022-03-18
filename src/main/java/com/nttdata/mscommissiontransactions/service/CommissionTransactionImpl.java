package com.nttdata.mscommissiontransactions.service;

import com.nttdata.mscommissiontransactions.entity.CommissionTransactions;
import com.nttdata.mscommissiontransactions.repository.ICommissionTransactionsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class CommissionTransactionImpl implements ICommissionTransactionsService{

    @Autowired
    private ICommissionTransactionsRepository commissionTransactionsRepository;

    @Override
    public Mono<CommissionTransactions> save(CommissionTransactions v) {
        return commissionTransactionsRepository.save(v);
    }

    @Override
    public Mono<Void> deleteById(String s) {
        return commissionTransactionsRepository.deleteById(s);
    }

    @Override
    public Mono<CommissionTransactions> findById(String s) {
        return commissionTransactionsRepository.findById(s);
    }

    @Override
    public Flux<CommissionTransactions> findAll() {
        return commissionTransactionsRepository.findAll();
    }
}
