package uic.api_solicitud_respuesta.Descarga_anteproyecto;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class DescargaAnteproyecto {
 @Id
 @GeneratedValue(strategy = GenerationType.AUTO)
 private Long id;

//RealeationShips
 private String solicitud_doc;
 private String anteproyecto_doc;

}
