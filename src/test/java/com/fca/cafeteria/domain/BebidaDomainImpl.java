package com.fca.cafeteria.domain;

import com.fca.cafeteria.data.BebidaData;
import com.fca.cafeteria.repository.BebidaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BebidaDomainImpl implements BebidaDomain {

    private final BebidaRepository bebidaRepository;

    public BebidaDomainImpl(BebidaRepository bebidaRepository) {
        this.bebidaRepository = bebidaRepository;
    }

    @Override
    public List<BebidaData> listar() {
        return bebidaRepository.findAll();
    }

    @Override
    public BebidaData buscarPorId(int id) {
        return bebidaRepository.findById(id).orElse(null);
    }

    @Override
    public BebidaData guardar(BebidaData bebida) {
        return bebidaRepository.save(bebida);
    }

    @Override
    public void eliminar(int id) {
        bebidaRepository.deleteById(id);
    }
}
