package com.springboot.springboot.service.impl;


import com.springboot.springboot.dto.EmpleadoDTO;
import com.springboot.springboot.entities.EmpleadoEntity;
import com.springboot.springboot.mapper.EmpleadoMapper;
import com.springboot.springboot.repository.EmpleadoRepository;
import com.springboot.springboot.service.EmpleadoServicio;
import org.springframework.stereotype.Service;

@Service
public class EmpleadoServicioImpl implements EmpleadoServicio {

    private final EmpleadoMapper empleadoMapper;
    private final EmpleadoRepository empleadoRepository;
    public EmpleadoServicioImpl(EmpleadoMapper empleadoMapper,
                                EmpleadoRepository empleadoRepository){
        this.empleadoMapper = empleadoMapper;
        this.empleadoRepository = empleadoRepository;

        System.out.println("Constructor Empleado Servicio Implementacion");

    }

    //EmpleadoMapper empleadoMapper = new EmpleadoMapper();
    //EmpleadoRepository empleadoRepository = new EmpleadoRepository();


    @Override
    public void guadarEmpleado(EmpleadoDTO empleadoDTO) {
      EmpleadoEntity empleadoEntity = empleadoMapper.toEntity(empleadoDTO);
      empleadoRepository.save(empleadoEntity);

    }

    @Override
    public void leerBD() {
        empleadoRepository.findById(1L);
    }

}
