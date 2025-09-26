package com.fca.cafeteria.repository;

import com.fca.cafeteria.data.BebidaData;
import com.fca.cafeteria.data.TipoBebidaData;

public interface CatalogoRepository {
    BebidaData guardarBebida(BebidaData bebida);
    TipoBebidaData guardarTipoBebida(TipoBebidaData tipoBebida);
}
