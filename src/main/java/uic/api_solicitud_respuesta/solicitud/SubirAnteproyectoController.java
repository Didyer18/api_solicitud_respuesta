package uic.api_solicitud_respuesta.solicitud;

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
@RequestMapping("api/subirAnteproyecto")
@CrossOrigin({"*"})
public class SubirAnteproyectoController {

 @Autowired SubirAnteproyectoService subirAnteproyectoService;

 @GetMapping("/")
 public List<SolicitudEntity> findAll(){
 return subirAnteproyectoService.findAll();
 }
 
 @GetMapping("/{id}/")
 public SolicitudEntity findById(@PathVariable Long id){
 return subirAnteproyectoService.findById(id);
 }

 @PostMapping("/")
 public SolicitudEntity save(@RequestBody SolicitudEntity entity){
 return subirAnteproyectoService.save(entity);
 }
 

 @PutMapping("/")
 public SolicitudEntity update(@RequestBody SolicitudEntity entity){
 return subirAnteproyectoService.save(entity);
 }

 @DeleteMapping("/{id}/")
 public void deleteById(@PathVariable Long id){
   subirAnteproyectoService.deleteById(id);
 }

}
