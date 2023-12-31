package app.modelo.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Distrito {

    private int iddistrito;
    private String nombre;
    private float habitantes;
}
