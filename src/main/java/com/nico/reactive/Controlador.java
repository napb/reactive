package com.nico.reactive;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.server.ServerRequest;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/controlador")
public class Controlador {

    ObjetoDominio objetoDominio;

    @GetMapping("/obtenerMono")
    public Mono<ObjetoDominio> obtenerMono(){
        objetoDominio = new ObjetoDominio();
        objetoDominio.setNombre("nombre de prueba");
        objetoDominio.setValor("valor de prueba");

        System.out.println("---------------------------------------");
        System.out.println("paso por aca (provider)");
        System.out.println("---------------------------------------");
        return Mono.just(objetoDominio);
    }

    public void setearMono(){
        objetoDominio = new ObjetoDominio();

        objetoDominio.setNombre("nombreeeeee");
        objetoDominio.setValor("valor");

    }
}
