package com.nttdata.mscommissiontransactions.resource;

import com.nttdata.mscommissiontransactions.dto.CommissionTransactionDto;
import com.nttdata.mscommissiontransactions.service.ICommissionTransactionsService;
import com.nttdata.mscommissiontransactions.webclient.dto.TransactionAccountDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


@Service
public class CommissionTransactionsResource{

    @Autowired
    private ICommissionTransactionsService commissionTransactionsService;

    private Mono<CommissionTransactionDto> ValidateComission(
            Flux<TransactionAccountDto> transactions,
            Long limitFreeMovements){
        return null;
    }

}
