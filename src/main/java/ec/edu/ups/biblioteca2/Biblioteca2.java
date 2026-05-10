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
                entrada.nextLine();

                switch(opcion){
                    case 1:
                        
                        System.out.println("\nREGISTRO DEL PRESTAMO");

                        System.out.println("\nIngrese su cedula: ");
                        String cedula = entrada.nextLine();
                        
                        System.out.println("Ingrese su nombre: ");
                        String nombre = entrada.nextLine();
                        
                        System.out.println("Ingrese su correo: ");
                        String correo = entrada.nextLine();
                        
                        System.out.println("Ingrese su telefono: ");
                        String telefono = entrada.nextLine();               

                        Usuario usuario=new Usuario(nombre,cedula,correo,telefono);
                        usuarios.add(usuario);
                        
                        System.out.println("Ingrese el ISBN del libro: ");
                        String isbn = entrada.nextLine();
        
                       
                        
                        System.out.println("Ingrese el titulo del libro: ");
                        String titulo = entrada.nextLine();
                        
                        System.out.println("Ingrese la editorial del libro: ");
                        String editorial = entrada.nextLine();
                        
                        Libro libro = new Libro(isbn, titulo, editorial, true);
                        libros.add(libro);
                        
                        System.out.println("Ingrese el nombre del bibliotecario: ");
                        String nombreB = entrada.nextLine();
                        
                        System.out.println("Ingrese la cedula del bibliotecario: ");
                        String cedulaB = entrada.nextLine();
                        
                        System.out.println("Ingrese el correo del bibliotecario: ");
                        String correoB = entrada.nextLine();
                        
                        System.out.println("Ingrese el telefono del bibliotecario: ");
                        String telefonoB = entrada.nextLine();
                        
                        Bibliotecario bibliotecario = new Bibliotecario(nombreB, cedulaB,correoB,telefonoB);
                        
                        Prestamo prestamo = new Prestamo();
                        
                        System.out.println("Agregar codigo de autor");
                        int codigoA= entrada.nextInt();
                        entrada.nextLine();
                        System.out.println("Ingrese el nombre del autor");
                        String nombreA=entrada.nextLine();  
                        System.out.println("Ingrese la nacionalidad del autor");
                        String nacionalidadA=entrada.nextLine();
                        Autor autor =new Autor(codigoA,nombreA,nacionalidadA);
                        autor.agregarLibro(libro);
                        
                        
                        if (libro.verificarDisponibilidad()) {
                            prestamo.registrarPrestamo(usuario, libro, bibliotecario);

                            prestamos.add(prestamo);
                            usuario.getPrestamos().add(prestamo);
                            bibliotecario.getPrestamosRegistrados().add(prestamo);
                            
                            System.out.println("Prestamo registrado");
                            System.out.println(prestamo);
                            System.out.println(autor);
                        } else {
                            System.out.println("El libro no esta disponible.");
                        }
                        
                        break;

                        
                    case 2: 
                        
                        System.out.println("REGRISTRO DE DEVOLUCION");
                        
                        if (prestamos.size() == 0) {
                            System.out.println("No existen prestamos registrados.");
                        } else {
                            for (int i = 0; i < prestamos.size(); i++) {
                                System.out.println((i + 1) + ". " + prestamos.get(i));
                        }

                        System.out.print("Seleccione el numero del prestamo a devolver: ");
                        int numeroPrestamo = entrada.nextInt();

                        if (numeroPrestamo >= 1 && numeroPrestamo <= prestamos.size()) {
                            Prestamo prestamoDevolver = prestamos.get(numeroPrestamo - 1);
                            prestamoDevolver.registrarDevolucion();
                            System.out.println("Devolucion registrada correctamente.");
                            System.out.println(prestamoDevolver);
                        } else {
                            System.out.println("Numero de prestamo invalido.");
                        }
                    }
                    break;

                }


            } while (opcion != 3    );

        }
    }
