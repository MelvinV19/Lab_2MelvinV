package lab2_melvinvargas;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.util.Scanner;

public class Lab2_MelvinVargas {

    public static void main(String[] args) {
        String opcion = "";
        ArrayList maestros = new ArrayList();
        ArrayList clases = new ArrayList();
        ArrayList listadeclases = new ArrayList();
        Maestros m = new Maestros();
        Clases c = new Clases();
        while (!opcion.equals("e")) {
            opcion = JOptionPane.showInputDialog(""
                    + "a-Administracion\n"
                    + "b-Matricula\n"
                    + "c-Log in\n"
                    + "d-Agregar\n"
                    + "e-Salir"
            );
            if (opcion.equals("a")) {
                String opciona = "";
                while (!opciona.equals("c")) {
                    opciona = JOptionPane.showInputDialog(""
                            + "a-Ver maestros\n"
                            + "b-Ver clases\n"
                            + "c-Volver al menu principal\n"
                    );
                    if (opciona.equals("a")) {
                        System.out.println(maestros);
                    }
                    if (opciona.equals("b")) {
                        System.out.println(clases);
                    }
                }
                System.out.println(maestros);
                System.out.println(clases);
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
                        int numerodemaestros = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero de maestros a registrar"));
                        for (int i = 0; i < numerodemaestros; i++) {
                            String nombre = JOptionPane.showInputDialog("Ingrese nombre del maestro");
                            String titulo = JOptionPane.showInputDialog("Ingrese titulo del maestro");
                            String maestria = JOptionPane.showInputDialog("Ingrese maestria del maestro");
                            Double salario = Double.parseDouble(JOptionPane.showInputDialog("Ingrese salario del maestro"));
                            String usuario = JOptionPane.showInputDialog("Ingrese usuario del maestro");
                            String contrasena = JOptionPane.showInputDialog("Ingrese contrasena del usuario");
                            String cantidad = JOptionPane.showInputDialog("Ingrese cantidad de clases del maestro");
                            maestros.add(new Maestros(nombre, titulo, maestria, salario, usuario, contrasena, cantidad));
                        }
                    }
                    if (opcion.equals("b")) {
                        int numerodeclases = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero de clases que desea ingresar "));
                        for (int i = 0; i < numerodeclases; i++) {
                            String maestrotemp = "";
                            String nombre = JOptionPane.showInputDialog("Ingrese nombre de la clase");
                            String seccion = JOptionPane.showInputDialog("Ingrese la seccion de la clase");
                            double precio=Double.parseDouble(JOptionPane.showInputDialog("Ingrese precio de la clase"));
                            int alumnos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad  maxima de alumnos de la clase"));
                            String maestro = JOptionPane.showInputDialog("Ingrese el maestro de la clase");
                            String uv = JOptionPane.showInputDialog("Ingrese unidades valorativas de la clase");
                            clases.add(new Clases(nombre, seccion,precio, alumnos, maestro, uv));

                        }
                    }
                }
            }
        }

    }

}
