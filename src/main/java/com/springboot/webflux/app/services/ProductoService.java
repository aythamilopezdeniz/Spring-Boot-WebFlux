package com.springboot.webflux.app.services;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import com.springboot.webflux.app.models.documents.Producto;

public interface ProductoService {
	
	public Flux<Producto> findAll();

	public Flux<Producto> findAllConNombreUpperCase();
	
	public Flux<Producto> findAllConNombreUpperCaseRepeat();
	
	public Mono<Producto> findById(String id);
	
	public Mono<Producto> save(Producto producto);
	
	public Mono<Void> delete(Producto producto);
}