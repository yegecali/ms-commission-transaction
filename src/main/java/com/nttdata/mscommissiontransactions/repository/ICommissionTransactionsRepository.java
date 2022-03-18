package com.nttdata.mscommissiontransactions.repository;

import com.nttdata.mscommissiontransactions.entity.CommissionTransactions;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICommissionTransactionsRepository extends ReactiveMongoRepository<CommissionTransactions, String> {
}
