package com.fca.cafeteria.domain;

import com.fca.cafeteria.data.BebidaData;
import com.fca.cafeteria.data.TipoBebidaData;
import com.fca.cafeteria.repository.BebidaRepository;
import com.fca.cafeteria.repository.TipoBebidaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BebidaDomainImpl implements BebidaDomain {

    private final BebidaRepository bebidaRepository;
    private final TipoBebidaRepository tipoBebidaRepository;

    @Override
    public List<BebidaData> listar() {
        return bebidaRepository.findAll();
    }

    @Override
    public BebidaData buscarPorId(int id) {
        return bebidaRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Bebida no encontrada"));
    }

    @Override
    public BebidaData agregar(BebidaData bebida, String descripcionTipo) {
        if (bebidaRepository.existsByNombre(bebida.getNombre())) {
            throw new IllegalArgumentException("Ya existe una bebida con ese nombre.");
        }

        TipoBebidaData tipo = tipoBebidaRepository
                .findByDescripcion(descripcionTipo)
                .orElseGet(() -> tipoBebidaRepository.save(new TipoBebidaData(0, descripcionTipo)));

        bebida.setTipoBebida(tipo);
        return bebidaRepository.save(bebida);
    }

    @Override
    public BebidaData actualizar(int id, BebidaData bebida) {
        BebidaData existente = buscarPorId(id);
        existente.setNombre(bebida.getNombre());
        existente.setDescripcion(bebida.getDescripcion());
        existente.setTipoBebida(bebida.getTipoBebida());
        return bebidaRepository.save(existente);
    }

    @Override
    public void eliminar(int id) {
        bebidaRepository.deleteById(id);
    }
}
