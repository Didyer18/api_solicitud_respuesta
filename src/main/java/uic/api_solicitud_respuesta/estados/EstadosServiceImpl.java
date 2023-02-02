/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uic.api_solicitud_respuesta.estados;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author User
 */
@Service
public class EstadosServiceImpl implements IEstadosService{
@Autowired    
private IEstadosRepository iEstadosReporitory;
    
    @Override
    public List<EstadosEntity> getEstados() {
        return iEstadosReporitory.findAll();
    }

    @Override
    public EstadosEntity saveEstado(EstadosDto estadosDto) {
        EstadosEntity estado=new EstadosEntity();
        estado.setNombre(estadosDto.getNombre());
        return iEstadosReporitory.save(estado);
    }

    @Override
    public EstadosEntity updateEstado(Long id, EstadosDto estadosDto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void deleteEstado(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
   
}
