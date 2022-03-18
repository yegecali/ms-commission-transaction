package com.nttdata.mscommissiontransactions.webclient;

import com.nttdata.mscommissiontransactions.webclient.dto.MovementAccountDto;
import com.nttdata.mscommissiontransactions.webclient.exception.AccountNotTransaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.WebClientResponseException;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class AccountTransactionService {

    private static final String URL="lb://ms-account-transactions";

    @Autowired
    private WebClient.Builder webclient;

    public Flux<MovementAccountDto> findAllByOriginAccount(String OriginAccount){

        return webclient.baseUrl(URL).build().get().uri("/api/movements")
                .retrieve()
                .bodyToFlux(MovementAccountDto.class)
                .filter(mov -> mov.getOriginDocumentNumber().equals(OriginAccount))
                .onErrorResume(error -> {
                    WebClientResponseException response = (WebClientResponseException) error;
                    if (response.getStatusCode() == HttpStatus.NOT_FOUND) {
                        return Mono.error( new AccountNotTransaction());
                    }
                    return Mono.error(error);
                });
    }
}
