package com.fca.cafeteria.presentation;

import com.fca.cafeteria.data.BebidaData;
import com.fca.cafeteria.domain.BebidaDomain;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/bebidas")
public class BebidaController {

    private final BebidaDomain bebidaDomain;

    @Autowired
    public BebidaController(BebidaDomain bebidaDomain) {
        this.bebidaDomain = bebidaDomain;
    }

    // 🔹 Obtener todas las bebidas
    @GetMapping
    public List<BebidaData> listarBebidas() {
        return bebidaDomain.listar();
    }
}


//

