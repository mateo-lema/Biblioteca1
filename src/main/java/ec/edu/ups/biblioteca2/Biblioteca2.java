    /*
     * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
     */
    package ec.edu.ups.biblioteca2;

    import ec.edu.ups.biblioteca2.clases.Libro;
    import ec.edu.ups.biblioteca2.clases.Usuario;
    import ec.edu.ups.biblioteca2.clases.Prestamo;
    import ec.edu.ups.biblioteca2.clases.Autor;
    import ec.edu.ups.biblioteca2.clases.Multa;
    import ec.edu.ups.biblioteca2.clases.Persona;
    import ec.edu.ups.biblioteca2.clases.Bibliotecario;
    import java.util.ArrayList;
    import java.util.Scanner;

    /**
     *
     * @author mateo
     */
    public class Biblioteca2 {

        public static void main(String[] args) {
            Scanner entrada = new Scanner(System.in);
            ArrayList<Usuario> usuarios = new ArrayList<>();
            ArrayList<Libro> libros = new ArrayList<>();
            ArrayList<Prestamo> prestamos = new ArrayList<>();


            int opcion;

            do {
                System.out.println("Menu");
                System.out.println("1. REALIZAR PRESTAMO");
                System.out.println("2. DEVOLVER LIBRO");
                System.out.println("3. Salir");

                opcion = entrada.nextInt();

                switch(opcion){
                    case 1:

                        System.out.println("Ingrese su cedula: ");
                        String cedula = entrada.next();
                        System.out.println("Ingrese su nombre: ");
                        String nombre = entrada.next();
                        System.out.println("Ingrese su correo: ");
                        String correo = entrada.next();
                        System.out.println("Ingrese su telefono: ");
                        String telefono = entrada.next();               

                        Usuario usuario=new Usuario(nombre,cedula,correo,telefono);
                        usuarios.add(usuario);
                        
                        break;


                        break;
                    case 2: 

                }


            } while (opcion != 3    );

        }
    }
