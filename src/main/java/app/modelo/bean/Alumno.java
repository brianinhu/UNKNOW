package app.modelo.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Alumno {

    private int codigo;
    private String nombre;
    private String apaterno;
    private String amaterno;
    private char sexo;
    private float promedio;
    private int iddistrito;
}
