/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2p2_edgarmembreño;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author edgarmembreno
 */
public class Lab2P2_EdgarMembreño {

    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion = 0;
        ArrayList<Datos> list = new ArrayList();
        while (opcion != 8) {
            System.out.println("MENU\n"
                    + "1.Crear\n"
                    + "2.Listar\n"
                    + "3.Eliminar\n"
                    + "4.Modificar\n"
                    + "5.Informe Computadoras Gamer\n"
                    + "6.Informe Computadoras Educativas\n"
                    + "7.Informe computadora de Poco Uso\n"
                    + "8.Salir del sistema");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1: {
                    System.out.println("Ingrese el Modelo: ");
                    String modelo = leer.next();
                    System.out.println("Ingrese numero de serie: ");
                    int serie = leer.nextInt();
                    System.out.println("Ingrese la capacidad de la memoria : ");
                    int capacidad = leer.nextInt();
                    System.out.println("Ingrese el Tamaño de la pantalla : ");
                    int tama = leer.nextInt();
                    System.out.println("Ingrese si desea teclado numerico : ");
                    String teclado = leer.next();
                    boolean tecl;
                    if (teclado == "si") {
                        tecl = true;
                    } else {
                        tecl = false;
                    }
                    System.out.println("Ingrese su procesador : ");
                    String procesador = leer.next();
                    System.out.println("Ingrese Tarjeta Grafica a=normal//b=gamer");
                    String tarjeta = leer.next();
                    if (tarjeta == "a") {
                        tarjeta = "normal";
                    } else if (tarjeta == "b") {
                        tarjeta = "gamer";
                    } else {
                        System.out.println("Tiene que ingresar una opcion valida: ");
                        tarjeta = leer.next();
                    }
                    System.out.println("Ingrese su sistema Opertaivo  W // COS:  ");
                    String so = leer.next();
                    if (so == "W") {
                        so = "Windows";
                    } else if (so == "COS") {
                        so = "ChromOS";
                    } else {
                        System.out.println("Ingrese una opcion valida :");
                        so = leer.next();
                    }
                    System.out.println("Tiempo de fabricacion : ");
                    int tf = leer.nextInt();
                    System.out.println("Ingrese la capacidad de la bateria : ");
                    int mah = leer.nextInt();
                    System.out.println("Ingrese la duracion de la bateria : ");
                    int dura = leer.nextInt();

                    list.add(new Datos(modelo, serie, capacidad, tama, tecl, procesador, tarjeta, so, tf, mah, dura));

                    break;
                }
                case 2: {
                    for (int i = 0; i < list.size(); i++) {
                        System.out.println(list.get(i));
                    }

                    break;
                }
                case 3: {
                    System.out.println("Ingrese el numero de serie de la computadora que quiere borrar : ");
                    int nume = leer.nextInt();
                    for (int i = 0; i < list.size(); i++) {
                        if (nume == list.get(i).getSerie()) {
                            list.remove(i);
                        } else {
                            System.out.println("Su numero de serie no existe ");
                        }
                    }

                    break;
                }
                case 4: {
                    System.out.println("Ingrese el numero de serie de la computadora que quiere modificar: ");
                    int nume = leer.nextInt();
                    for (int i = 0; i < list.size(); i++) {
                        if (nume == list.get(i).getSerie()) {
                            opcion = 0;
                            while (opcion != 11) {
                                System.out.println("Que quiere modficar: \n"
                                        + "1.Modelo\n"
                                        + "2.Capacidad\n"
                                        + "3.Tamaño\n"
                                        + "4.Teclado: \n"
                                        + "5.Procesador: \n"
                                        + "6.Tarjeta grafica\n"
                                        + "7.Sistema Operativo\n"
                                        + "8.Tiempo Fabricacion\n"
                                        + "9.Tamaño de bateria\n"
                                        + "10.Duracion de la bateria\n"
                                        + "");
                                opcion = leer.nextInt();
                                switch (opcion) {
                                    case 1: {
                                        System.out.println("Ingrese el nuevo  Modelo: ");
                                        String modelo = leer.next();
                                        list.get(i).setModelo(modelo);
                                        break;
                                    }
                                    case 2: {
                                        System.out.println("Ingrese la capacidad de la memoria : ");
                                        int capacidad = leer.nextInt();
                                        list.get(i).setCapacidad(capacidad);

                                        break;
                                    }
                                    case 3: {
                                        System.out.println("Ingrese el Tamaño de la pantalla : ");
                                        int tama = leer.nextInt();
                                        list.get(i).setTama(tama);

                                        break;
                                    }
                                    case 4: {
                                        System.out.println("Ingrese si desea teclado numerico si/no : ");
                                        String teclado = leer.next();
                                        boolean tecl;
                                        if (teclado == "si") {
                                            tecl = true;
                                        } else {
                                            tecl = false;
                                        }
                                        list.get(i).setTeclado(tecl);

                                        break;
                                    }
                                    case 5: {
                                        System.out.println("Ingrese su procesador : ");
                                        String procesador = leer.next();

                                        list.get(i).setProcesador(procesador);

                                        break;
                                    }
                                    case 6: {
                                        System.out.println("Ingrese Tarjeta Grafica a=normal//b=gamer");
                                        String tarjeta = leer.next();
                                        if (tarjeta == "a") {
                                            tarjeta = "normal";
                                        } else if (tarjeta == "b") {
                                            tarjeta = "gamer";
                                        } else {
                                            System.out.println("Tiene que ingresar una opcion valida: ");
                                            tarjeta = leer.next();
                                        }
                                        list.get(i).setTarjetaG(tarjeta);

                                        break;
                                    }
                                    case 7: {
                                        System.out.println("Ingrese su sistema Opertaivo  W // COS:  ");
                                        String so = leer.next();
                                        if (so == "W") {
                                            so = "Windows";
                                        } else if (so == "COS") {
                                            so = "ChromOS";
                                        } else {
                                            System.out.println("Ingrese una opcion valida :");
                                            so = leer.next();
                                        }
                                        list.get(i).setSistemaO(so);

                                        break;
                                    }
                                    case 8: {
                                        System.out.println("Tiempo de fabricacion : ");
                                        int tf = leer.nextInt();
                                        list.get(i).setTiempoFabri(tf);

                                        break;
                                    }
                                    case 9: {
                                        System.out.println("Ingrese la capacidad de la bateria : ");
                                        int mah = leer.nextInt();
                                        list.get(i).setBateria(mah);

                                        break;
                                    }
                                    case 10: {
                                        System.out.println("Ingrese la duracion de la bateria : ");
                                        int dura = leer.nextInt();
                                        list.get(i).setDuracion(dura);

                                        break;
                                    }

                                }

                            }

                        }

                    }

                    break;
                }
                case 5: {
                    for (int i = 0; i < list.size(); i++) {
                        if (list.get(i).getTama() > 17 && list.get(i).getTarjetaG().equals("b") && list.get(i).getTeclado() == true) {
                            System.out.println(list.get(i));

                        } else {
                            System.out.println("No hay computadoras Gamer registradas");
                        }

                    }

                    break;
                }
                case 6: {
                    for (int i = 0; i < list.size(); i++) {
                        if (list.get(i).getSistemaO().equals("COS") && list.get(i).getTama() < 13 && list.get(i).getCapacidad() < 300) {
                            System.out.println(list.get(i));

                        } else {
                            System.out.println("No hay computadoras educativas registradas");
                        }

                    }

                    break;
                }
                case 7: {
                    for (int i = 0; i < list.size(); i++) {
                        if (list.get(i).getBateria()<1&&list.get(i).getTiempoFabri()>2&&list.get(i).getSistemaO()=="w") {
                            System.out.println(list.get(i));
                           
                        }else{
                            System.out.println("No hay computadoras de Poco Uso");
                        }
                        
                    }

                    break;
                }

            }
        }
    }

}
