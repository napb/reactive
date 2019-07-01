package com.nico.reactive;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/controlador")
public class Controlador {


    @GetMapping("/obtenerMono")
    public Mono<ObjetoDominio> obtenerMono(){

        ObjetoDominio objetoDominio = new ObjetoDominio();

        return Mono.just(objetoDominio);
    }

}
