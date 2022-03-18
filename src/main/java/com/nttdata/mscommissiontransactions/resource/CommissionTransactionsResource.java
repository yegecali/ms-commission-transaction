package com.nttdata.mscommissiontransactions.resource;

import com.nttdata.mscommissiontransactions.dto.CommissionTransactionDto;
import com.nttdata.mscommissiontransactions.entity.CommissionTransactions;
import com.nttdata.mscommissiontransactions.jtil.MapperUtil;
import com.nttdata.mscommissiontransactions.service.ICommissionTransactionsService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


@Service
public class CommissionTransactionsResource extends MapperUtil {

    @Autowired
    private ICommissionTransactionsService commissionTransactionsService;

    public Flux<CommissionTransactionDto> findAll(){
        return commissionTransactionsService.findAll().map(c -> map(c, CommissionTransactionDto.class));
    }

    public Mono<CommissionTransactionDto> createComssion( CommissionTransactionDto commissionDto ){
        CommissionTransactions com = map(commissionDto, CommissionTransactions.class);
        return commissionTransactionsService.save(com).map(c -> map(c, CommissionTransactionDto.class));
    }



}
