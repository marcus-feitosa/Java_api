package io.github.marcus.service.impl;

import io.github.marcus.domain.repository.Pedidos;
import io.github.marcus.service.PedidoService;
import org.springframework.stereotype.Service;

@Service
public class PedidoServiceImpl implements PedidoService {

    private Pedidos repository;

    public PedidoServiceImpl(Pedidos repository) {
        this.repository = repository;
    }
}
