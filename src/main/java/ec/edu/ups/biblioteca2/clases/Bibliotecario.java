/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.biblioteca2.clases;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;  

/**
 *
 * @author mateo
 */
public class Bibliotecario extends Persona{
    private List<Prestamo> prestamosRegistrados;
    

    public Bibliotecario(){
        prestamosRegistrados=new ArrayList<>();
    }

    public Bibliotecario( String nombre, String cedula, String correo, String telefono) {
        super(nombre, cedula, correo, telefono);
         prestamosRegistrados= new ArrayList<>();
    }

    public List<Prestamo> getPrestamosRegistrados() {
        return prestamosRegistrados;
    }

    public void setPrestamosRegistrados(List<Prestamo> prestamosRegistrados) {
        this.prestamosRegistrados = prestamosRegistrados;
    }
    
    
    
    public void registrarPrestamo(Libro libro, Usuario usuario) {

        Prestamo prestamo = new Prestamo();
        prestamo.setLibro(libro);
        prestamo.setUsuario(usuario);
        prestamo.setEstado("Prestado");
        prestamosRegistrados.add(prestamo);
    }

    public void registrarDevolucion(Prestamo prestamo,Date fechaDevolucion) {
        prestamo.setFechaDevolucion(fechaDevolucion);
         prestamo.setEstado("Devuelto");
        System.out.println("Se ha registrado la devolucion");
    }

@Override
public String toString() {
    String resultado = super.toString();
    resultado += " Cantidad de prestamos registrados: " + prestamosRegistrados.size();
    return resultado;
}
    
    
    
    
       
}
