package uic.api_solicitud_respuesta.Respuesta_anteproyecto;
import java.sql.Date;
<<<<<<< HEAD:src/main/java/uic/api_solicitud_respuesta/Respuesta_anteproyecto/RespuestaAnteproyecto.java
import java.util.List;

import jakarta.persistence.CascadeType;
=======
>>>>>>> b2ea4481184df3fd1400bf3f1c095eb079ef3bc4:src/main/java/uic/api_solicitud_respuesta/Respuesta_anteproyecto/CoordinatorResponse.java
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;
import uic.api_solicitud_respuesta.subir_anteproyecto.SubirAnteproyecto;

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
<<<<<<< HEAD:src/main/java/uic/api_solicitud_respuesta/Respuesta_anteproyecto/RespuestaAnteproyecto.java

 @OneToMany(mappedBy = "respuestaAnteproyecto", cascade = CascadeType.ALL)
private List<SubirAnteproyecto> subirAnteproyectos;

=======
 private String solicitud_doc;
 private String anteproyecto_doc;
>>>>>>> b2ea4481184df3fd1400bf3f1c095eb079ef3bc4:src/main/java/uic/api_solicitud_respuesta/Respuesta_anteproyecto/CoordinatorResponse.java
}
