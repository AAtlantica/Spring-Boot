package com.springboot.springboot.service;


import com.springboot.springboot.dto.EmpleadoDTO;

public interface EmpleadoServicio {
    void guadarEmpleado(EmpleadoDTO empleadoDTO);
    void leerBD();
}
