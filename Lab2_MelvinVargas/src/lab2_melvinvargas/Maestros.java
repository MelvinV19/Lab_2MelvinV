
package lab2_melvinvargas;


public class Maestros {
    String nombre;
    String titulo;
    String maestria;
    double salario;
    String usuario;
    String contrasena;
    String cantidad;

    public Maestros() {
    }

    public Maestros(String nombre, String titulo, String maestria, double salario, String usuario, String contrasena,String cantidad) {
        this.nombre = nombre;
        this.titulo = titulo;
        this.maestria = maestria;
        this.salario = salario;
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.cantidad=cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getMaestria() {
        return maestria;
    }

    public void setMaestria(String maestria) {
        this.maestria = maestria;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
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

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Maestro: " + "nombre=" + nombre + ", titulo=" + titulo + ", maestria=" + maestria + ", salario=" + salario + ", usuario=" + usuario + ", contrasena=" + contrasena + ", cantidad=" + cantidad + "||";
    }
    

    
    
}
