package com.sena.Controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.sena.Modelos.Usuario;
import com.sena.Servicios.CentroServicio;
import com.sena.Servicios.PerfilServicio;
import com.sena.Servicios.UsuarioServicio;

@Controller
@RequestMapping("/usuario")
public class UsuarioControlador {
  
  @Autowired
  private UsuarioServicio usuarioServicio;

  @Autowired
  private CentroServicio centroServicio;

  @Autowired
  private PerfilServicio perfilServicio;
  
  @GetMapping("/lista") 
  public ModelAndView listarUsuarios() {

    ModelAndView modelAndView = new ModelAndView("Usuarios");
    modelAndView.addObject("listaUsuarios", usuarioServicio.listaUsuarios());
    return modelAndView;

  }

  @GetMapping("/crear")
  public ModelAndView crearUsuario() {

    ModelAndView modelAndView = new ModelAndView("formCrearUsuario");
    modelAndView.addObject("objUsuario", new Usuario());
    modelAndView.addObject("listaCentros", centroServicio.listaCentros());
    modelAndView.addObject("listaPerfiles", perfilServicio.listaPerfiles());
    return modelAndView;

  }

  @PostMapping("/guardar")
  public String guardarUsuario(@ModelAttribute("objUsuario") Usuario usuario) {

    usuarioServicio.crear(usuario);
    return "redirect:/usuario/lista";

  }

  @GetMapping("/eliminar/{idUsuario}")
  public String eliminarUsuario(@PathVariable("idUsuario") int idUsuario) {

    usuarioServicio.eliminar(idUsuario);
    return "redirect:/usuario/lista";

  }

  @GetMapping("/actualizar/{idUsuario}")
  public ModelAndView actualizarUsuario(@PathVariable("idUsuario") int idUsuario) {

    ModelAndView modelAndView = new ModelAndView("formActualizarUsuario");
    modelAndView.addObject("objUsuario", usuarioServicio.buscarPorId(idUsuario));
    modelAndView.addObject("listaCentros", centroServicio.listaCentros());
    modelAndView.addObject("listaPerfiles", perfilServicio.listaPerfiles());
    return modelAndView;

  }

  @PostMapping("/guardarUsuario")
  public String guardarUsuarioActualizado(@ModelAttribute("objUsuario") Usuario usuario) {

    usuarioServicio.actualizar(usuario);
    return "redirect:/usuario/lista";

  }


}
