
package lab2_melvinvargas;


public class Clases {
   String nombre;
   String seccion;
   String alumnos;
   String maestro;
   String  uv;

    public Clases() {
    }

    public Clases(String nombre, String seccion, String alumnos, String maestro, String uv) {
        this.nombre = nombre;
        this.seccion = seccion;
        this.alumnos = alumnos;
        this.maestro = maestro;
        this.uv = uv;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    public String getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(String alumnos) {
        this.alumnos = alumnos;
    }

    public String getMaestro() {
        return maestro;
    }

    public void setMaestro(String maestro) {
        this.maestro = maestro;
    }

    public String getUv() {
        return uv;
    }

    public void setUv(String uv) {
        this.uv = uv;
    }

    @Override
    public String toString() {
        return "Clases: " + "nombre=" + nombre + ", seccion=" + seccion + ", alumnos=" + alumnos + ", maestro=" + maestro + ", uv=" + uv + "||";
    }

    
    
}
