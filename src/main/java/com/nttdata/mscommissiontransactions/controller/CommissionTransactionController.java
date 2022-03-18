package com.nttdata.mscommissiontransactions.controller;

import com.nttdata.mscommissiontransactions.dto.CommissionTransactionDto;
import com.nttdata.mscommissiontransactions.resource.CommissionTransactionsResource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/comission/transaction")
public class CommissionTransactionController {

    @Autowired
    private CommissionTransactionsResource commissionResource;

    @GetMapping
    public Flux<CommissionTransactionDto> getCommission(){
        return commissionResource.findAll();
    }

    @PostMapping
    public Mono<CommissionTransactionDto> createCommission(@RequestBody CommissionTransactionDto commission){
        return commissionResource.createComssion(commission);
    }

}
