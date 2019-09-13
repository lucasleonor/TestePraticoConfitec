package br.com.confitec.teste.genius.api;

import br.com.confitec.teste.genius.model.Response;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import static br.com.confitec.teste.genius.api.GeniusConstants.ACCESS_TOKEN;

abstract class Client<T extends Response> {

    T request(String uri, Class<T> clazz) {
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.set("Authorization", ACCESS_TOKEN);
        // todo: ponto para melhoria, tratar diferentes codigos HTTP para caso de erro
        ResponseEntity<T> response = restTemplate
                .exchange(uri, HttpMethod.GET, new HttpEntity<>(httpHeaders), clazz);
        return response.getBody();
    }
}
