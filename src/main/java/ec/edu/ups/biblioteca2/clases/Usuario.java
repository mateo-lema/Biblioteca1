/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.biblioteca2.clases;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mateo
 */
public class Usuario extends Persona{
    private List<Prestamo>prestamos;
    
    public Usuario(){
        prestamos=new ArrayList<>();
        
    }


    public Usuario(String nombre, String cedula, String correo, String telefono) {
        super(nombre, cedula, correo, telefono);
        prestamos=new ArrayList<>();    
  
    }

    public List<Prestamo> getPrestamos() {
        return prestamos;
    }

    public void setPrestamos(List<Prestamo> prestamos) {
        this.prestamos = prestamos;
    }
    
    
    public void solicitarPrestamo(Libro libro) {
        Prestamo prestamo = new Prestamo();
        prestamo.setLibro(libro);
        prestamos.add(prestamo);
    }
    public void devolverLibro(Libro libro) {
        System.out.println("Libro devuelto: " + libro.getTitulo());
    }
    
    

    @Override
public String toString() {
    String resultado = super.toString();
    resultado += " Cantidad de prestamos: " + prestamos.size();
    return resultado;
}
    
    
    
}
