package com.nttdata.mscommissiontransactions.controller;

import com.nttdata.mscommissiontransactions.dto.CommissionTransactionDto;
import com.nttdata.mscommissiontransactions.dto.DateStartAndFinishDto;
import com.nttdata.mscommissiontransactions.resource.CommissionTransactionsResource;

import java.time.LocalDateTime;

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
    
    @GetMapping("/range")
    public Flux<CommissionTransactionDto> getRangeNow(){
    	return commissionResource.findCommissionOfRangeDateAndNow(LocalDateTime.now());
    }
    @GetMapping("/range/date")
    public Flux<CommissionTransactionDto> getRangeStartAndFinish(@RequestBody DateStartAndFinishDto rangeDate){
    	return commissionResource.findCommissionOfRange(rangeDate.getStartDate(), rangeDate.getFinishDate());
    }

}
