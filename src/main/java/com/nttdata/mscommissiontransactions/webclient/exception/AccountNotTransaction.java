package com.nttdata.mscommissiontransactions.webclient.exception;

public class AccountNotTransaction extends RuntimeException{
    private static final String MESSAGE="ACCOUNT HAS NO TRANSACTION";
    public AccountNotTransaction(){
        super(MESSAGE);
    }
}
