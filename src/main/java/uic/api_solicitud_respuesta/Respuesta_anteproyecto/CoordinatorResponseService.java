package uic.api_solicitud_respuesta.Respuesta_anteproyecto;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CoordinatorResponseService {
 @Autowired CoordinatorResponseRepository coordinatorResponseRepository;

 public CoordinatorResponse save(CoordinatorResponse entity){
 return coordinatorResponseRepository.save(entity);
 }

 public CoordinatorResponse findById( Long id){
 return coordinatorResponseRepository.findById(id).orElse(new CoordinatorResponse());
 }
 public void deleteById(Long id){
    coordinatorResponseRepository.deleteById(id);
 }
 public List<CoordinatorResponse> findAll(){
 return coordinatorResponseRepository.findAll();
 }

}