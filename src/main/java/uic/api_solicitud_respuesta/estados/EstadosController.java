/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uic.api_solicitud_respuesta.estados;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author User
 */
@RestController
@RequestMapping("/estados")
public class EstadosController {
    @Autowired
    private IEstadosService iEstadosService;
    
    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity <List <EstadosEntity>> findAll(){
    return ResponseEntity.status(HttpStatus.OK).body(iEstadosService.getEstados());    
    }
    @PostMapping(value = "/guardar")
    public ResponseEntity <EstadosEntity> guardar(@RequestBody EstadosDto dto){
    return ResponseEntity.status(HttpStatus.OK).body(iEstadosService.saveEstado(dto));    

    }
}
