package com.springboot.springboot.mapper;


import com.springboot.springboot.dto.EmpleadoDTO;
import com.springboot.springboot.entities.EmpleadoEntity;
import org.springframework.stereotype.Component;

@Component
public class EmpleadoMapper {


    public EmpleadoMapper(){
        System.out.println("Constructor Empleado Mapper");
    }
    public EmpleadoEntity toEntity(EmpleadoDTO empleadoDTO){
        EmpleadoEntity empleadoEntity = new EmpleadoEntity();
        empleadoEntity.setNombre(empleadoDTO.getNombre());
        empleadoEntity.setApellido(empleadoDTO.getApellido());
        return  empleadoEntity;
    }
}
