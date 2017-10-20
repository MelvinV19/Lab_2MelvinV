package lab2_melvinvargas;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Lab2_MelvinVargas {

    public static void main(String[] args) {
        String opcion = "";
        ArrayList maestros = new ArrayList();
        ArrayList clases = new ArrayList();
        Maestros m=new Maestros();
        Clases c=new Clases();
        while (!opcion.equals("e")) {
            opcion = JOptionPane.showInputDialog(""
                    + "a-Administracion\n"
                    + "b-Matricula\n"
                    + "c-Log in\n"
                    + "d-Agregar\n"
                    + "e-Salir"
            );
            if (opcion.equals("a")) {

            }
            if (opcion.equals("b")) {

            }
            if (opcion.equals("c")) {

            }
            if (opcion.equals("d")) {
                while (!opcion.equals("c")) {
                    opcion = JOptionPane.showInputDialog(""
                            + "a-Agregar maestro\n"
                            + "b-Agregar clases\n"
                            + "c-Volver al menu principal\n"
                    );
                    if (opcion.equals("a")) {
                        String nombre=JOptionPane.showInputDialog("Ingrese nombre del maestro");
                        String titulo=JOptionPane.showInputDialog("Ingrese titulo del maestro");
                        String maestria=JOptionPane.showInputDialog("Ingrese maestria del maestro");
                        String salario=JOptionPane.showInputDialog("Ingrese salario del maestro");
                        String usuario=JOptionPane.showInputDialog("Ingrese usuario del maestro");
                        String contrasena=JOptionPane.showInputDialog("Ingrese contrasena del usuario");
                        String cantidad=JOptionPane.showInputDialog("Ingrese cantidad de clases del maestro");
                        maestros.add(new Maestros(nombre,titulo,maestria,salario,usuario,contrasena,cantidad));
                        System.out.print(maestros);
                    }
                    if (opcion.equals("b")) {
                        String nombre=JOptionPane.showInputDialog("Ingrese nombre de la clase");
                        String seccion=JOptionPane.showInputDialog("Ingrese la seccion de la clase");
                        int alumnos=Integer.parseInt("Ingrese cantidad  maxima de alumnos de la clase");
                        String maestro=JOptionPane.showInputDialog("Ingrese el maestro de la clase");
                        int uv=Integer.parseInt("Ingrese unidades valorativas de la clase");
                        clases.add(new Clases(nombre,seccion,alumnos,maestro,uv));
                    }    
                }
            }
        }

    }

}
