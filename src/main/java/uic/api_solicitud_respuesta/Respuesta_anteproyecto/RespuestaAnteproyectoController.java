package uic.api_solicitud_respuesta.Respuesta_anteproyecto;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("api/respuestaAnteproyecto")
@CrossOrigin({"*"})
public class RespuestaAnteproyectoController {

 @Autowired RespuestaAnteproyectoService respuestaAnteproyectoService;

 @GetMapping("/")
 public List<RespuestaAnteproyecto> findAll(){
 return respuestaAnteproyectoService.findAll();
 }
 
 @GetMapping("/{id}/")
 public RespuestaAnteproyecto findById(@PathVariable Long id){
 return respuestaAnteproyectoService.findById(id);
 }

 @PostMapping("/")
 public RespuestaAnteproyecto save(@RequestBody RespuestaAnteproyecto entity){
 return respuestaAnteproyectoService.save(entity);
 }
 

 @PutMapping("/")
 public RespuestaAnteproyecto update(@RequestBody RespuestaAnteproyecto entity){
 return respuestaAnteproyectoService.save(entity);
 }

 @DeleteMapping("/{id}/")
 public void deleteById(@PathVariable Long id){
   respuestaAnteproyectoService.deleteById(id);
 }

}
