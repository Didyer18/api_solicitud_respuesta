package uic.api_solicitud_respuesta.Descarga_anteproyecto;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DescargaAnteproyectoService {
 @Autowired DescargaAnteproyectoRepository descargaAnteproyectoRepository;

 public DescargaAnteproyecto save(DescargaAnteproyecto entity){
 return descargaAnteproyectoRepository.save(entity);
 }

 public DescargaAnteproyecto findById( Long id){
 return descargaAnteproyectoRepository.findById(id).orElse(new DescargaAnteproyecto());
 }
 public void deleteById(Long id){
    descargaAnteproyectoRepository.deleteById(id);
 }
 public List<DescargaAnteproyecto> findAll(){
 return descargaAnteproyectoRepository.findAll();
 }

}