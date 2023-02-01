package uic.api_solicitud_respuesta.Respuesta_anteproyecto;
import java.sql.Date;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class CoordinatorResponse {
 @Id
 @GeneratedValue(strategy = GenerationType.AUTO)

 private Date fecha_solicitud;
 private Date fecha_respuesta;
 private boolean estado;
 private String observacion;
 private String docente_asignado;

 //RealeationShip titulo y documentos
 private String solicitud_doc;
 private String anteproyecto_doc;
}
