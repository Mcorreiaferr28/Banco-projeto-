package com.git.banco.service;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.git.banco.model.Cartoes;
import com.git.banco.repository.CartoesRepository;

@Service
public class CartoesService {

    private final CartoesRepository cartoesRepository;

    public CartoesService(CartoesRepository cartoesRepository) {
        this.cartoesRepository = cartoesRepository;
    }

    public Cartoes cadastrar(Cartoes cartoes) {
        
        return cartoesRepository.save(cartoes);
    }

    public List<Cartoes> listar() {
        return cartoesRepository.findAll();
    }

    public Cartoes buscarPorId(Long id) {
        return cartoesRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND,
                        "Cartoes" + id + " nao encontrado."));
    }
}