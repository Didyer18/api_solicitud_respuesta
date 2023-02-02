package uic.api_solicitud_respuesta.solicitud;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ISolicitudRepository extends JpaRepository<SolicitudEntity, Long> {
}

