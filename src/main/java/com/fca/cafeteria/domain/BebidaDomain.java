package com.fca.cafeteria.domain;

import com.fca.cafeteria.data.BebidaData;
import java.util.List;

public interface BebidaDomain {
    List<BebidaData> listar();
    BebidaData buscarPorId(int id);
    BebidaData agregar(BebidaData bebida, String descripcionTipo);
    BebidaData actualizar(int id, BebidaData bebida);
    void eliminar(int id);
}
