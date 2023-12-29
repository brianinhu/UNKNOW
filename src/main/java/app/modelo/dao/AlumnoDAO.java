package app.modelo.dao;

import app.conexion.Conexion;
import app.helper.InterfaceCRUD;
import app.modelo.bean.Alumno;
import java.util.ArrayList;

public class AlumnoDAO extends Conexion implements InterfaceCRUD<Alumno> {

    @Override
    public ArrayList<Alumno> tolist() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public ArrayList<Alumno> AlumnosxDistrito(String distrito) {

    }

    public ArrayList<Alumno> AlumnosDesaprobados() {

    }

    public ArrayList<Alumno> AlumnosAprobadosMujeres() {

    }
    
    public ArrayList<Alumno> AlumnosDesaprobadosVarones() {

    }
    
    public ArrayList<Alumno> AlumnosDesaprobadosMujeresxDistrito(String distrito) {

    }

    @Override
    public void create(Alumno e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Alumno read(Alumno e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void update(Alumno e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(Alumno e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
