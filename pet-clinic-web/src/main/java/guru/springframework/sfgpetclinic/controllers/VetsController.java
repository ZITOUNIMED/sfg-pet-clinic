package guru.springframework.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import guru.springframework.sfgpetclinic.services.VetService;

@Controller
@RequestMapping("/vets")
public class VetsController {
	private final VetService vetService;	
	
	public VetsController(VetService vetService) {
		this.vetService = vetService;
	}
	@RequestMapping({"", "/index", "/index.html"})
	public String listVets(Model model){
		model.addAttribute("vets", vetService.findAll());
		return "/vets/index";
	}
}
