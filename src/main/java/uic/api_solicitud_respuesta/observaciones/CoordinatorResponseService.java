package uic.api_solicitud_respuesta.observaciones;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CoordinatorResponseService {
 @Autowired IObservacionesRepository coordinatorResponseRepository;

 public ObservacionesEntity save(ObservacionesEntity entity){
 return coordinatorResponseRepository.save(entity);
 }

 public ObservacionesEntity findById( Long id){
 return coordinatorResponseRepository.findById(id).orElse(new ObservacionesEntity());
 }
 public void deleteById(Long id){
    coordinatorResponseRepository.deleteById(id);
 }
 public List<ObservacionesEntity> findAll(){
 return coordinatorResponseRepository.findAll();
 }

}