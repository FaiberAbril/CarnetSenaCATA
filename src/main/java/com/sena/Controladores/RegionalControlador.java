package com.sena.Controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sena.Modelos.Regional;
import com.sena.Servicios.RegionalServicio;

@Controller
@RequestMapping("/regional")
public class RegionalControlador {
  
  @Autowired
  private RegionalServicio regionalServicio;

  @GetMapping("/lista") 
  public ModelAndView listarRegionales() {

    ModelAndView modelAndView = new ModelAndView("regionales");
    modelAndView.addObject("listaRegionales", regionalServicio.listaRegionales());
    return modelAndView;

  }

  @GetMapping("/crear")
  public ModelAndView crearRegional() {

    ModelAndView modelAndView = new ModelAndView("formCrearRegional");
    modelAndView.addObject("objRegional", new Regional());
    return modelAndView;

  }

  @PostMapping("/guardar")
  public String guardarRegional(@ModelAttribute("objRegional") Regional regional) {

    regionalServicio.crear(regional);
    return "redirect:/regional/lista";

  }

  @GetMapping("/eliminar/{idRegional}")
  public String eliminarRegional(@PathVariable("idRegional") int idRegional) {

    regionalServicio.eliminar(idRegional);
    return "redirect:/regional/lista";

  }

  @GetMapping("/actualizar/{idRegional}")
  public ModelAndView actualizarRegional(@PathVariable("idRegional") int idRegional) {

    ModelAndView modelAndView = new ModelAndView("formActualizarRegional");
    modelAndView.addObject("objRegional", regionalServicio.buscarPorId(idRegional));
    return modelAndView;

  }

  @PostMapping("/guardarRegional")
  public String guardarRegionalActualizada(@ModelAttribute("objRegional") Regional regional) {

    regionalServicio.actualizar(regional);
    return "redirect:/regional/lista";

  }
}
