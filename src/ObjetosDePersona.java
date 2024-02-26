import java.util.Scanner;
public class ObjetosDePersona {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("usted es: 1. estudiante, 2. docente, 3. administrador");
        int rol = sc.nextInt();

        if(rol == 1){
            //Herencia(capacidad de crear clases u objetos a partir de otras clases)
            Persona persona = new Persona("Valentina","Aguilar","mujer", "ingeniria de sistemas");
            persona.setEdad((short)17);
            System.out.println("Caracteristicas del estudiante: ");
            System.out.println("nombre : " + persona.getNombre());
            System.out.println("apellido :" + persona.getApellido());
            System.out.println("genero: " + persona.getGenero());
            System.out.println("Carrera : " + persona.getCarrera());
            System.out.println("edad : " + persona.getEdad());
        }

        else if( rol == 2){
            Persona docente= new Persona("valentina ","aguilar ","ingenieria de sistemas ");
            docente.setEdad((short)17);

            System.out.println("Caracteristicas del docente: ");
            System.out.println("nombre : " + docente.getNombre());
            System.out.println("apellido :" + docente.getApellido());
            System.out.println("genero : " + docente.getGenero());
            System.out.println("area : " + docente.getCarrera());
            System.out.println("edad : " + docente.getEdad());

        }

        else if(rol == 3){
            Persona administrador = new Persona((short)0);
            System.out.println("ingrese su nombre: ");
            String nombre3 = sc.next();
            System.out.println("ingrese su apellido: ");
            String apellido3 = sc.next();
            System.out.println("ingrese su genero: ");
            String genero3 = sc.next();
            System.out.println("ingrese su especializacion: ");
            String carrera3 = sc.next();
            System.out.println("ingrese su edad: ");
            short edad3 = sc.nextShort();
            administrador.setNombre(nombre3);
            administrador.setApellido(apellido3);
            administrador.setGenero(genero3);
            administrador.setCarrera(carrera3);
            administrador.setEdad(edad3);
            System.out.println("\nCaracteristicas del administrativo: ");
            System.out.println("nombre : " + administrador.setNombre());
            System.out.println("apellido :" + administrador.getApellido());
            System.out.println("genero : " + administrador.getGenero());
            System.out.println("especializacion : " + administrador.getCarrera());
            System.out.println("edad : " + administrador.getEdad());

        }



    }
}
