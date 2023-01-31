package uic.api_solicitud_respuesta.Descarga_anteproyecto;

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
@RequestMapping("api/descargaAnteproyecto")
@CrossOrigin({"*"})
public class DescargaAnteproyectoController {

 @Autowired DescargaAnteproyectoService descargaAnteproyectoService;

 @GetMapping("/")
 public List<DescargaAnteproyecto> findAll(){
 return descargaAnteproyectoService.findAll();
 }
 
 @GetMapping("/{id}/")
 public DescargaAnteproyecto findById(@PathVariable Long id){
 return descargaAnteproyectoService.findById(id);
 }

 @PostMapping("/")
 public DescargaAnteproyecto save(@RequestBody DescargaAnteproyecto entity){
 return descargaAnteproyectoService.save(entity);
 }
 

 @PutMapping("/")
 public DescargaAnteproyecto update(@RequestBody DescargaAnteproyecto entity){
 return descargaAnteproyectoService.save(entity);
 }

 @DeleteMapping("/{id}/")
 public void deleteById(@PathVariable Long id){
   descargaAnteproyectoService.deleteById(id);
 }

}
