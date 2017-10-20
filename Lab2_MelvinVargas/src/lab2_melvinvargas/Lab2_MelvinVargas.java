package lab2_melvinvargas;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.util.Scanner;

public class Lab2_MelvinVargas {

    public static void main(String[] args) {
        String opcion = "";
        ArrayList maestros = new ArrayList();
        ArrayList clases = new ArrayList();
        ArrayList alumno = new ArrayList();
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
            }
            if (opcion.equals("b")) {
               
                System.out.println(alumno);
                        
            }
            if (opcion.equals("c")) {
                String opcionc = "";
                while (!opcionc.equals("c")) {
                    opcionc = JOptionPane.showInputDialog(""
                            + "a-Registrarse\n"
                            + "b-Iniciar sesion\n"
                            + "c-Volver al menu principal\n"
                    );
                    if (opcionc.equals("a")) {
                        String nombrea = JOptionPane.showInputDialog("Ingrese su nombre");
                        String numeroc = JOptionPane.showInputDialog("Ingrese numero de cuenta");
                        String carrera = JOptionPane.showInputDialog("Ingrese carrera que estudia");
                        int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad"));
                        double dinero = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el dinero que tiene"));
                        String user = JOptionPane.showInputDialog("Ingrese su usuario");
                        String contrasena = JOptionPane.showInputDialog("Ingrese su contrasena");
                        int cursando = Integer.parseInt(JOptionPane.showInputDialog("Ingrese clases cursando"));
                        String clasescur = JOptionPane.showInputDialog("Ingrese el codigo de sus clases separado por comas"); 
                        alumno.add(new alumnos(nombrea, numeroc, carrera, edad, dinero, user, contrasena, clasescur));
                    }

                    if (opcionc.equals("b")) {
                        String opcionma = "";
                        while (!opcionma.equals("c")) {
                            opcionma = JOptionPane.showInputDialog(""
                                    + "a-Maestro\n"
                                    + "b-alumno\n"
                            );
                            if (opcionma.equals("a")) {
                                String usuario = JOptionPane.showInputDialog("Ingrese nombre de usuario");
                                int bandera = 0;

                                if (bandera == 0) {
                                    for (int i = 0; i < maestros.size(); i++) {

                                    }
                                }
                                String contrasena = JOptionPane.showInputDialog("Ingrese contrasena");

                            }
                            if (opcionma.equals("b")) {
                                String usuario = JOptionPane.showInputDialog("Ingrese nombre de usuario");
                                String contrasena = JOptionPane.showInputDialog("Ingrese contrasena");
                            }
                        }
                    }
                }
            }
            if (opcion.equals("d")) {
                String opciond = "";
                while (!opciond.equals("c")) {
                    opciond = JOptionPane.showInputDialog(""
                            + "a-Agregar maestro\n"
                            + "b-Agregar clases\n"
                            + "c-Volver al menu principal\n"
                    );
                    if (opciond.equals("a")) {
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
                    if (opciond.equals("b")) {
                        int numerodeclases = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero de clases que desea ingresar "));
                        for (int i = 0; i < numerodeclases; i++) {
                            String maestrotemp = "";
                            String nombre = JOptionPane.showInputDialog("Ingrese nombre de la clase");
                            String seccion = JOptionPane.showInputDialog("Ingrese la seccion de la clase");
                            double precio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese precio de la clase"));
                            int alumnos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad  maxima de alumnos de la clase"));
                            String maestro = JOptionPane.showInputDialog("Ingrese el maestro de la clase");
                            String uv = JOptionPane.showInputDialog("Ingrese unidades valorativas de la clase");
                            clases.add(new Clases(nombre, seccion, precio, alumnos, maestro, uv));

                        }
                    }
                }
            }
        }

    }

}

