//Valentina Aguilar
public class Persona {
    // Propiedades

    // Se hace uso del encapsulamiento (private static), para que las propiedades solo
    // puedan ser modificados con metodos propios de la clase

    private static String nombre, apellido, genero, carrera;
    private static short edad;

    // Metodos
    // Crear el constructor de la clase
    public Persona (String nombre, String apellido, String genero, String carrera) { //constructor
        this.nombre = nombre;
        this.apellido = apellido;
        this.genero = genero;
        this.carrera = carrera;
    }
    // Polimorfismo: El mismo metodo realiza acciones diferentes
    public Persona (String apellido, String genero, String carrera) {
        this.nombre = "Valentina";
        this.apellido = apellido;
        this.genero = genero;
        this.carrera = carrera;
    }
    public Persona(short edad){
        this.edad = edad;
    }

    // Getter y Setter

    public static String getNombre() {
        return nombre;
    }

    public static void setNombre(String Nombre){
        Persona.nombre = nombre;
    }

    public String setNombre() {
        return nombre;
    }

    public static String getApellido() {
        return apellido;
    }

    public static void setApellido(String apellido) {
        Persona.apellido = apellido;
    }

    public static String getGenero() {
        return genero;
    }

    public static void setGenero(String genero) {
        Persona.genero = genero;
    }

    public static String getCarrera() {
        return carrera;
    }

    public static void setCarrera(String carrera) {
        Persona.carrera = carrera;
    }

    public static double getEdad() {
        return edad;
    }

    public static void setEdad(short edad) {
        Persona.edad = edad;
    }





}
