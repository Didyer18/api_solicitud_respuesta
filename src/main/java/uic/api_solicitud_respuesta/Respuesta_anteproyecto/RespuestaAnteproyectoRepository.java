package uic.api_solicitud_respuesta.Respuesta_anteproyecto;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RespuestaAnteproyectoRepository extends JpaRepository<RespuestaAnteproyecto, Long> {
public List<RespuestaAnteproyecto> findAll();
}

