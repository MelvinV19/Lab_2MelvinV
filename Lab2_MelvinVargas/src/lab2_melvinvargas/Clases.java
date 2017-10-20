
package lab2_melvinvargas;


public class Clases {
   String nombre;
   String seccion;
   int alumnos;
   String maestro;
   int uv;

    public Clases() {
    }

    public Clases(String nombre, String seccion, int alumnos, String maestro, int uv) {
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

    public int getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(int alumnos) {
        this.alumnos = alumnos;
    }

    public String getMaestro() {
        return maestro;
    }

    public void setMaestro(String maestro) {
        this.maestro = maestro;
    }

    public int getUv() {
        return uv;
    }

    public void setUv(int uv) {
        this.uv = uv;
    }
   
}
