package com.fca.cafeteria.presentation;

import com.fca.cafeteria.data.BebidaData;
import com.fca.cafeteria.domain.BebidaDomain;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/bebidas")
@RequiredArgsConstructor
public class BebidaController {

    private final BebidaDomain bebidaDomain;

    @GetMapping
    public List<BebidaData> listar() {
        return bebidaDomain.listar();
    }

    @GetMapping("/{id}")
    public BebidaData buscar(@PathVariable int id) {
        return bebidaDomain.buscarPorId(id);
    }

    @PostMapping
    public BebidaData agregar(@RequestBody BebidaData bebida,
                              @RequestParam String descripcionTipo) {
        return bebidaDomain.agregar(bebida, descripcionTipo);
    }


}
