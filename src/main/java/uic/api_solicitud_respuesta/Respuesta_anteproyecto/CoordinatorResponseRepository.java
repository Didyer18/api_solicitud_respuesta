package uic.api_solicitud_respuesta.Respuesta_anteproyecto;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CoordinatorResponseRepository extends JpaRepository<CoordinatorResponse, Long> {
public List<CoordinatorResponse> findAll();
}

