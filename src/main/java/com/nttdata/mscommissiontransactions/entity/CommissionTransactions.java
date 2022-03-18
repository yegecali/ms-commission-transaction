package com.nttdata.mscommissiontransactions.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@Document
public class CommissionTransactions extends BaseEntity {
    private String documentType;
    private String numberDocument;
    private String movementType;
    private Float balance;
    private Float commission;
}
