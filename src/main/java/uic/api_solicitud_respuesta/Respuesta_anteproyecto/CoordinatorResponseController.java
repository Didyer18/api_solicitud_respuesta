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
@RequestMapping("api/coordinatorResponse")
@CrossOrigin({"*"})
public class CoordinatorResponseController {

 @Autowired CoordinatorResponseService coordinatorResponseService;

 @GetMapping("/")
 public List<CoordinatorResponse> findAll(){
 return coordinatorResponseService.findAll();
 }
 
 @GetMapping("/{id}/")
 public CoordinatorResponse findById(@PathVariable Long id){
 return coordinatorResponseService.findById(id);
 }

 @PostMapping("/")
 public CoordinatorResponse save(@RequestBody CoordinatorResponse entity){
 return coordinatorResponseService.save(entity);
 }
 

 @PutMapping("/")
 public CoordinatorResponse update(@RequestBody CoordinatorResponse entity){
 return coordinatorResponseService.save(entity);
 }

 @DeleteMapping("/{id}/")
 public void deleteById(@PathVariable Long id){
   coordinatorResponseService.deleteById(id);
 }

}
