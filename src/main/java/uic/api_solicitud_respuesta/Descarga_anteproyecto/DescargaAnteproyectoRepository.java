package uic.api_solicitud_respuesta.Descarga_anteproyecto;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DescargaAnteproyectoRepository extends JpaRepository<DescargaAnteproyecto, Long> {
public List<DescargaAnteproyecto> findAll();
}