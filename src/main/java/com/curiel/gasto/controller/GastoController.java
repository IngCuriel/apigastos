package com.curiel.gasto.controller;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.curiel.gasto.model.entity.Gasto;

@RestController
@RequestMapping(value="/gastos")
public class GastoController {
  
	@GetMapping
	public List<Gasto> getGastos() {
		
		Gasto gastoLuz= new Gasto();
		gastoLuz.setId(1);
		gastoLuz.setDescripcion("Pago de Luz");
		gastoLuz.setTotal(new BigDecimal(200));
		
		Gasto gatosAgua = new Gasto();
		gatosAgua.setId(2);
		gatosAgua.setDescripcion("Gasto de Agua");
		gatosAgua.setTotal(new BigDecimal(100));
		
		Gasto gastoGas= new Gasto();
		gastoGas.setDescripcion("Pago de gas");
		gastoGas.setId(3);
		gastoGas.setTotal(new BigDecimal(80));
		
		List<Gasto> listaGasto = new ArrayList<>();
		listaGasto.add(gastoLuz);
		listaGasto.add(gatosAgua);
		listaGasto.add(gastoGas);
		
		return listaGasto;
	}
	
	public Gasto getById(int id) {
		List<Gasto> listaDondeBuscar= this.getGastos();
		//listaDondeBuscar
		
		return null;
	}
}
