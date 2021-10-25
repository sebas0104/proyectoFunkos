package com.FunkoStore.controller;

import com.FunkoStore.model.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path ="/personal")
public class PersonalControler {
	@Autowired
	private com.FunkoStore.repository.IpersonalRepository repoper;
	
	@Autowired
	private com.FunkoStore.repository.IRolRepository reporol;
	
	
	
	@GetMapping("/cargar")
	public String cargarpag(Model model) {
		model.addAttribute("personal", new Personal());
		model.addAttribute("lstro",reporol.findAll());
		return "crudPersonal";
	}


	@PostMapping("/grabar")
	public String grabarpag(@ModelAttribute Personal Personal,Model model) {
		System.out.println("Listo para grabar ");
		System.out.println(Personal);
		repoper.save(Personal);// merge
		model.addAttribute("lstro",reporol.findAll());
		return "crudPersonal";

	}

@GetMapping("/listar")
	public String listadodePersonal(Model model) {
		model.addAttribute("lstPer",reporol.findAll());
		return "listadoPersonal";
	}

		/*@PostMapping("/editar")
	public String buscarProducto(@ModelAttribute Producto p, Model model) {
		System.out.println(p);
		model.addAttribute("producto",repo.findById(p.getCodigo()));
		model.addAttribute("lstCategorias",repoc.findAll());
		model.addAttribute("lstProveedor",repopv.findAll());
		return "crudPersonal";
	}*/
}
