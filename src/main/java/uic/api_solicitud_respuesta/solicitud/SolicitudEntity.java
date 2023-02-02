package uic.api_solicitud_respuesta.solicitud;
import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "Solicitudes")
@Data
public class SolicitudEntity {
 @Id
 @GeneratedValue(strategy = GenerationType.AUTO)
 private Long id;
 private String titulo;
 private Date fecha_solicitud; 
 private Date fecha_respuesta;
 
 private String solicitud_doc;
 private String anteproyecto_doc;

//RealeationShips

 

 }






