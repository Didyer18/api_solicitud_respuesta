package uic.api_solicitud_respuesta.observaciones;
import java.util.Date;

import jakarta.persistence.*;
import lombok.Data;
import uic.api_solicitud_respuesta.estados.EstadosEntity;
import uic.api_solicitud_respuesta.solicitud.SolicitudEntity;
        
@Entity
@Table(name = "Observaciones")
@Data
public class ObservacionesEntity {
 @Id
 @GeneratedValue(strategy = GenerationType.AUTO)
 private Long id;
 private String observacion;
 private String docente_asignado;
 private Date fecha_respuesta;
 
 private Date fecha_creacion;
 private Date fecha_modificacion;
 
 //RealeationShip
 @JoinColumn(name = "estado_id") 
 @ManyToOne
 private EstadosEntity estados;
 
 @JoinColumn(name = "solicitud_id") 
 @ManyToOne
 private SolicitudEntity solicitud;
 
 
@PrePersist 
public void  saveData(){
    this.fecha_creacion= new Date();
    this.fecha_modificacion= new Date();
}
@PreUpdate
public void  updateData(){
    this.fecha_modificacion= new Date();
}
}
