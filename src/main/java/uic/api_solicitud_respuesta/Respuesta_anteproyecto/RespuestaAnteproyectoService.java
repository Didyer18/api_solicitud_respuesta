package uic.api_solicitud_respuesta.Respuesta_anteproyecto;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RespuestaAnteproyectoService {
 @Autowired RespuestaAnteproyectoRepository respuestaAnteproyectoRepository;

 public RespuestaAnteproyecto save(RespuestaAnteproyecto entity){
 return respuestaAnteproyectoRepository.save(entity);
 }

 public RespuestaAnteproyecto findById( Long id){
 return respuestaAnteproyectoRepository.findById(id).orElse(new RespuestaAnteproyecto());
 }
 public void deleteById(Long id){
    respuestaAnteproyectoRepository.deleteById(id);
 }
 public List<RespuestaAnteproyecto> findAll(){
 return respuestaAnteproyectoRepository.findAll();
 }

}