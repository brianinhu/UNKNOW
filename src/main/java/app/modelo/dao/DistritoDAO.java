package app.modelo.dao;

import app.conexion.Conexion;
import app.helper.InterfaceCRUD;
import app.modelo.bean.Distrito;
import java.util.ArrayList;

public class DistritoDAO extends Conexion implements InterfaceCRUD<Distrito>{

    @Override
    public ArrayList<Distrito> tolist() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void create(Distrito e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Distrito read(Distrito e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void update(Distrito e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(Distrito e) {
        String sentence = "delete from distrito where id = ?";
        
        
    }
    
}
