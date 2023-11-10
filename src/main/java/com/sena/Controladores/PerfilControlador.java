package com.sena.Controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.sena.Modelos.Perfil;
import com.sena.Servicios.PerfilServicio;

@Controller
@RequestMapping("/perfil")
public class PerfilControlador {

  @Autowired
  private PerfilServicio perfilServicio;

  @GetMapping("/lista") 
  public ModelAndView listarPerfiles() {

    ModelAndView modelAndView = new ModelAndView("perfiles");
    modelAndView.addObject("listaPerfiles", perfilServicio.listaPerfiles());
    return modelAndView;

  }

  @GetMapping("/crear")
  public ModelAndView crearPerfil() {

    ModelAndView modelAndView = new ModelAndView("formCrearPerfil");
    modelAndView.addObject("objPerfil", new Perfil());
    return modelAndView;

  }

  @PostMapping("/guardar")
  public String guardarPerfil(@ModelAttribute("objPerfil") Perfil perfil) {

    perfilServicio.crear(perfil);
    return "redirect:/perfil/lista";

  }

  @GetMapping("/eliminar/{idPerfil}")
  public String eliminarPerfil(@PathVariable("idPerfil") int idPerfil) {

    perfilServicio.eliminar(idPerfil);
    return "redirect:/perfil/lista";

  }

  @GetMapping("/actualizar/{idPerfil}")
  public ModelAndView actualizarPerfil(@PathVariable("idPerfil") int idPerfil) {

    ModelAndView modelAndView = new ModelAndView("formActualizarPerfil");
    modelAndView.addObject("objPerfil", perfilServicio.buscarPorId(idPerfil));
    return modelAndView;

  }

  @PostMapping("/guardarPerfil")
  public String guardarPerfilActualizado(@ModelAttribute("objPerfil") Perfil perfil) {

    perfilServicio.actualizar(perfil);
    return "redirect:/perfil/lista";

  }
}
