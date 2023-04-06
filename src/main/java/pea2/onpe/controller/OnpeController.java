package pea2.onpe.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.reactive.config.CorsRegistry;
import org.springframework.web.reactive.result.view.RedirectView;

import pea2.onpe.services.IGrupoVotacionService;

@Configuration
@CrossOrigin
@Controller	
public class OnpeController extends WebMvcAutoConfiguration{
	public void addCorsMappings(CorsRegistry registry) {
		registry.addMapping("/**");
	}
	
	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	@GetMapping("/actas")
	public String actas() {
		return "actas";
	}
	@Autowired
	private IGrupoVotacionService IGrupovotacion;
	
	/*@GetMapping("/actas_info/{id}")
	public String listarcines(Model modelo ,@PathVariable("id") String id){
		modelo.addAttribute("actas", IGrupovotacion.getGrupoVotacion(id));
		return "actas_info";
	}*/
	
	
	@RequestMapping("/actas_info")
	public String listaractas(Model modelo ,@RequestParam("nroMesa") String nroMesa){
		modelo.addAttribute("actas", IGrupovotacion.getGrupoVotacion(nroMesa));
	    return "actas_info";
	}
}
