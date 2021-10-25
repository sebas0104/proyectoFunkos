package com.FunkoStore.controller;

import com.FunkoStore.model.*;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

public class ClienteController {

	/*@GetMapping("/cargar")
	public String cargarpag(Model model) {
		model.addAttribute("producto", new Producto());
		model.addAttribute("lstCategorias",repoc.findAll());
		model.addAttribute("lstProveedor",repopv.findAll());
		return "crudproductos";
	}


	@PostMapping("/grabar")
	public String grabarpag(@ModelAttribute Producto producto,Model model) {
		System.out.println("Listo para grabar ");
		System.out.println(producto);
		repo.save(producto);// merge
		model.addAttribute("lstCategorias",repoc.findAll());
		model.addAttribute("lstProveedor",repopv.findAll());
		return "crudproductos";

	}

	@GetMapping("/listar")
	public String listadodeProductos(Model model) {
		model.addAttribute("lstProducto",repo.findAll());
		return "listado";
	}

	@PostMapping("/editar")
	public String buscarProducto(@ModelAttribute Producto p, Model model) {
		System.out.println(p);
		model.addAttribute("producto",repo.findById(p.getCodigo()));
		model.addAttribute("lstCategorias",repoc.findAll());
		model.addAttribute("lstProveedor",repopv.findAll());
		return "crudproductos";
	}*/
}
