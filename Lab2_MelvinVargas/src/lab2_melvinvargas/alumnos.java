
package lab2_melvinvargas;


public class alumnos {
    String nombrea;
    String numeroc;
    String carrera;
    int edad;
    double dinero;
    String usuario;
    String contrasena;
    String clasescur;

    public alumnos() {
    }

    public alumnos(String nombrea, String numeroc, String carrera, int edad, double dinero, String usuario, String contrasena, String clasescur) {
        this.nombrea = nombrea;
        this.numeroc = numeroc;
        this.carrera = carrera;
        this.edad = edad;
        this.dinero = dinero;
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.clasescur = clasescur;
    }

    public String getNombrea() {
        return nombrea;
    }

    public void setNombrea(String nombrea) {
        this.nombrea = nombrea;
    }

    public String getNumeroc() {
        return numeroc;
    }

    public void setNumeroc(String numeroc) {
        this.numeroc = numeroc;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getDinero() {
        return dinero;
    }

    public void setDinero(double dinero) {
        this.dinero = dinero;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getClasescur() {
        return clasescur;
    }

    public void setClasescur(String clasescur) {
        this.clasescur = clasescur;
    }

    @Override
    public String toString() {
        return "alumnos{" + "nombrea=" + nombrea + ", numeroc=" + numeroc + ", carrera=" + carrera + ", edad=" + edad + ", dinero=" + dinero + ", usuario=" + usuario + ", contrasena=" + contrasena + ", clasescur=" + clasescur + '}';
    }
    
    
}
