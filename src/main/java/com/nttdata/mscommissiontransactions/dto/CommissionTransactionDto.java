package com.nttdata.mscommissiontransactions.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CommissionTransactionDto {
    private String documentType;
    private String numberDocument;
    private String movementType;
    private Float balance;
    private Float commission;
}
