package com.nttdata.mscommissiontransactions.webclient.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MovementAccountDto extends TransactionAccountDto {

    private String movementType;

    private String movementShape;

    private String movementOriginName;

}
