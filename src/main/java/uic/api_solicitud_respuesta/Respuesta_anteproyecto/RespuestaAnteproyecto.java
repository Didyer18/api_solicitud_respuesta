package uic.api_solicitud_respuesta.Respuesta_anteproyecto;

import java.sql.Date;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;
import uic.api_solicitud_respuesta.subir_anteproyecto.SubirAnteproyecto;

@Entity
@Data
public class RespuestaAnteproyecto {
 @Id
 @GeneratedValue(strategy = GenerationType.AUTO)

 private Date fecha_solicitud;
 private Date fecha_respuesta;
 private boolean estado;
 private String observacion;
 private String docente_asignado;

 //RealeationShip titulo y documentos

 @OneToMany(mappedBy = "respuestaAnteproyecto", cascade = CascadeType.ALL)
private List<SubirAnteproyecto> subirAnteproyectos;

}
