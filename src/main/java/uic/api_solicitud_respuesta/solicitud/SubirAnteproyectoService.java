package uic.api_solicitud_respuesta.solicitud;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SubirAnteproyectoService {
 @Autowired ISolicitudRepository subirAnteproyectoRepository;

 public SolicitudEntity save(SolicitudEntity entity){
 return subirAnteproyectoRepository.save(entity);
 }

 public SolicitudEntity findById( Long id){
 return subirAnteproyectoRepository.findById(id).orElse(new SolicitudEntity());
 }
 public void deleteById(Long id){
    subirAnteproyectoRepository.deleteById(id);
 }
 public List<SolicitudEntity> findAll(){
 return subirAnteproyectoRepository.findAll();
 }

}