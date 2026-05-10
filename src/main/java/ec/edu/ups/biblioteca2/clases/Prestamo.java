/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.biblioteca2.clases;
import java.util.Date;
//import ec.edu.ups.biblioteca2.clases.Libro;


/**
 *
 * @author mateo
 */
public class Prestamo {
    private int codigo;
    private Date fechaPrestamo;
    private Date fechaDevolucion;
    private String estado;
    private Libro libro;
    private Usuario usuario;
    private Bibliotecario bibliotecario;

    public Prestamo(int codigo, Date fechaPrestamo,Date fechaDevolucion, String estado, Libro libro, Usuario usuario, Bibliotecario bibliotecario) {
        this.codigo = codigo;
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion=fechaDevolucion;
        this.estado = estado;
        this.libro = libro;
        this.usuario = usuario;
        this.bibliotecario = bibliotecario;
    }
    
    public Prestamo(){
        
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Date getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(Date fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Bibliotecario getBibliotecario() {
        return bibliotecario;
    }

    public void setBibliotecario(Bibliotecario bibliotecario) {
        this.bibliotecario = bibliotecario;
    }

    public Date getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(Date fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }
    
    
    
    
    public void registrarPrestamo(Usuario usuario, Libro libro, Bibliotecario bibliotecario){
        this.usuario=usuario;
        this.bibliotecario=bibliotecario;
        this.libro=libro;
        this.fechaPrestamo = new Date(); 
        this.estado = "Prestado";
        libro.setDisponible(false);
    }
    
    public void registrarDevolucion(){
        this.fechaDevolucion = new Date();
        this.estado="Devuelto";
        libro.setDisponible(true);
    }

    @Override
    public String toString() {
        return "Prestamo{" + "codigo=" + codigo+1 + ", fechaPrestamo=" + fechaPrestamo + ", fechaDevolucion=" + fechaDevolucion + ", estado=" + estado + ", \n libro=" + libro + ",\n usuario=" + usuario + ",\n bibliotecario=" + bibliotecario + '}';
    }

}

