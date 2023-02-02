/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package uic.api_solicitud_respuesta.estados;

import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author User
 */
public interface IEstadosService {
  List<EstadosEntity> getEstados();
  EstadosEntity saveEstado(EstadosDto estadosDto);
  EstadosEntity updateEstado(Long id, EstadosDto estadosDto);
  void deleteEstado(Long id);
}
