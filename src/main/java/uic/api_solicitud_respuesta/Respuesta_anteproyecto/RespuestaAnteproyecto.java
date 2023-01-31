package uic.api_solicitud_respuesta.Respuesta_anteproyecto;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class RespuestaAnteproyecto {
 @Id
 @GeneratedValue(strategy = GenerationType.AUTO)
 private Long id;
 private String convocatoria;
 private Integer cedula;
 private String estudiante;
 private String tema;
 private Date fecha_entrega_anteproyecto;
 private String Observacion;
 private Boolean estado;
}
