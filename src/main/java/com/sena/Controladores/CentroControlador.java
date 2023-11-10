package com.sena.Controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.sena.Modelos.Centro;
import com.sena.Servicios.CentroServicio;
import com.sena.Servicios.RegionalServicio;


@Controller
@RequestMapping("/centro")
public class CentroControlador {
  
  @Autowired
  private CentroServicio centroServicio;

  @Autowired
  private RegionalServicio regionalServicio;

  @GetMapping("/lista") 
  public ModelAndView listarCentros() {

    ModelAndView modelAndView = new ModelAndView("centros");
    modelAndView.addObject("listaCentros", centroServicio.listaCentros());
    return modelAndView;

  }

  @GetMapping("/crear")
  public ModelAndView crearCentro() {

    ModelAndView modelAndView = new ModelAndView("formCrearCentro");
    modelAndView.addObject("objCentro", new Centro());
    modelAndView.addObject("listaRegionales", regionalServicio.listaRegionales());
    return modelAndView;

  }

  @PostMapping("/guardar")
  public String guardarCentro(@ModelAttribute("objCentro") Centro centro) {

    centroServicio.crear(centro);
    return "redirect:/centro/lista";

  }

  @GetMapping("/eliminar/{idCentro}")
  public String eliminarPerfil(@PathVariable("idCentro") int idCentro) {

    centroServicio.eliminar(idCentro);
    return "redirect:/centro/lista";

  }

  @GetMapping("/actualizar/{idCentro}")
  public ModelAndView actualizarPerfil(@PathVariable("idCentro") int idCentro) {

    ModelAndView modelAndView = new ModelAndView("formActualizarCentro");
    modelAndView.addObject("objCentro", centroServicio.buscarPorId(idCentro));
    modelAndView.addObject("listaRegionales", regionalServicio.listaRegionales());
    return modelAndView;

  }

  @PostMapping("/guardarCentro")
  public String guardarCentroActualizado(@ModelAttribute("objCentro") Centro centro) {

    centroServicio.actualizar(centro);
    return "redirect:/centro/lista";

  }
}
