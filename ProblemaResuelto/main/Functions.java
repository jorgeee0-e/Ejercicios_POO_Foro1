/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import model.Student;

/**
 *
 * @author Debora Rivas
 */
public class Functions {
    
    Map<String, Student> students = new HashMap<>();

    
    public void initMenu() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int option = 0;
        setMainMenu();
        while(option == 0) {
            System.out.println("Digite la opción que requiera acceder: ");
            try {
                option = Integer.parseInt(br.readLine());
                switch(option) {
                    case 1:
                        getStudent();
                        break;
                    case 2:
                        addStudent();
                        break;
                    case 3:
                        deleteStudent();
                        break;
                    case 4:
                        getStudents();
                        break;
                    case 5:
                        System.exit(0);
                        break;
                    default:
                        System.err.println("La opción escogida no está disponible, intente de nuevo");
                        option = 0;
                }
            } catch(IOException e) {
                System.err.println(e.getMessage());
            }
        }
    }
    
    public void addStudent() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer option = 1;
        try {
            while(option == 1) {
                System.out.println("Digite el Carnet del Estudiante");
                String carnet = br.readLine();
                System.out.println("Digite el Nombre del Estudiante");
                String name = br.readLine();
                System.out.println("Digite el Apellido del Estudiante");
                String lastName = br.readLine();
                Student student = new Student(carnet, name, lastName);
                students.put(carnet, student);
                System.out.println("Alumno ingresado exitosamente");
                option = 0;
                while(option == 0) {
                    setFinalMenu();
                    option = Integer.parseInt(br.readLine());
                    switch(option) {
                        case 1:
                            break;
                        case 2:
                            initMenu();
                            break;
                        case 3:
                            System.exit(0);
                            break;
                        default:
                            System.err.println("La opción escogida no está disponible, intente de nuevo");
                            option = 0;
                    }
                }
            }
            
        } catch(IOException e) {
            System.err.print(e.getMessage());
        }
    }
    
    public void getStudent() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer option = 1;
        try {
            while(option == 1) {
                System.out.println("Digite el Carnet del Estudiante a buscar");
                String carnet = br.readLine();
                if(students.containsKey(carnet)) {
                    Student student = students.get(carnet);
                    System.out.println(student.getName() + " " + student.getLastName());
                } else {
                    System.err.println("Alumno no encontrado, no se puede mostrar");
                }
                option = 0;
                while(option == 0) {
                    setFinalMenu();
                    option = Integer.parseInt(br.readLine());
                    switch(option) {
                        case 1:
                            break;
                        case 2:
                            initMenu();
                            break;
                        case 3:
                            System.exit(0);
                            break;
                        default:
                            System.err.println("La opción escogida no está disponible, intente de nuevo");
                            option = 0;
                    }
                }
            }
            
        } catch(IOException e) {
            System.err.print(e.getMessage());
        }
    }
    
    public void deleteStudent() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer option = 1;
        try {
            while(option == 1) {
                System.out.println("Digite el Carnet del Estudiante a eliminar");
                String carnet = br.readLine();
                if(students.containsKey(carnet)) {
                    students.remove(carnet);
                    System.out.println("Alumno eliminado correctamente");
                } else {
                    System.err.println("Alumno no encontrado, no se puede eliminar");
                }
                option = 0;
                while(option == 0) {
                    setFinalMenu();
                    option = Integer.parseInt(br.readLine());
                    switch(option) {
                        case 1:
                            break;
                        case 2:
                            initMenu();
                            break;
                        case 3:
                            System.exit(0);
                            break;
                        default:
                            System.err.println("La opción escogida no está disponible, intente de nuevo");
                            option = 0;
                    }
                }
            }
            
        } catch(IOException e) {
            System.err.print(e.getMessage());
        }
    }
    
    public void getStudents() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer option = 1;
        try {
            while(option == 1) {
                students.forEach((k, s) -> System.out.println(s.getCarnet() + " - " + s.getName() + " " + s.getLastName()));
                option = 0;
                while(option == 0) {
                    setFinalMenu();
                    option = Integer.parseInt(br.readLine());
                    switch(option) {
                        case 1:
                            break;
                        case 2:
                            initMenu();
                            break;
                        case 3:
                            System.exit(0);
                            break;
                        default:
                            System.err.println("La opción escogida no está disponible, intente de nuevo");
                            option = 0;
                    }
                }
            }
            
        } catch(IOException e) {
            System.err.print(e.getMessage());
        }
    }
    
    public void setMainMenu() {
        System.out.println("Bienvenido al Menú Principal");
        System.out.println("1. Buscar alumno");
        System.out.println("2. Añadir alumno");
        System.out.println("3. Eliminar alumno");
        System.out.println("4. Mostrar todos los alumnos");
        System.out.println("5. Salir");
    }
    
    public void setFinalMenu() {
        System.out.println("Escoga otra opción: ");
        System.out.println("1. Continuar");
        System.out.println("2. Escoger otra opción");
        System.out.println("3. Salir");
    }
}
