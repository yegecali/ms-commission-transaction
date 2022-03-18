package com.nttdata.mscommissiontransactions.webclient.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TransactionAccountDto {

    private Float amount;

    private String originAccount;

    private String originDocumentNumber;

    private String originDocumentType;

    private String transactionId;

    private String clientType;

    private LocalDateTime transactionDate;
}
