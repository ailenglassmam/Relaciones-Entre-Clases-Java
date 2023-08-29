package Services;

import Entities.Perro;
import Entities.Persona;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ServiceAdoption {

    Scanner leer = new Scanner(System.in);

    private List<Perro> crearListaMascota() {
        //creo una lista para agregar perros disponibles
        List<Perro> perrosAdoptar = new ArrayList<>();
        //creo perros con los datos
        Perro perro1 = new Perro("Loretha", "Terranova", 10, "Gigante", false);
        Perro perro2 = new Perro("Rocco", "Mestizo", 5, "Mediano", false);
        Perro perro3 = new Perro("Kiara", "Cocker", 3, "Mediano", false);
        Perro perro4 = new Perro("Sasha", "Doberman", 15, "Grande", false);
        Perro perro5 = new Perro("Luna", "Mestiza", 3, "Mediana", false);
        Perro perro6 = new Perro("Fifi", "Chiguagua", 10, "Pequeña", false);
        //agrego los perros al listado
        perrosAdoptar.add(perro1);
        perrosAdoptar.add(perro2);
        perrosAdoptar.add(perro3);
        perrosAdoptar.add(perro4);
        perrosAdoptar.add(perro5);
        perrosAdoptar.add(perro6);
        //devuelvo la lista
        return perrosAdoptar;
    }

    public void adopcionMascotaNueva() {
        System.out.println("¿Desea ver el listado de mascotas esperando por una adopción?");
        System.out.println("1. Si");
        System.out.println("2. No");
        int respuesta = leer.nextInt();

        if (respuesta == 1) {
            //para mostrar cada valor del listado de mascotas, primero instancio el listado y su método
            List<Perro> listaMascotas = crearListaMascota();
            //con un foreach, recorro la lista e imprimo la mascota
            for (Perro perro : listaMascotas) {
                System.out.println(perro);
            }
            System.out.println("¿Quieres adoptar?");
            System.out.println("1. Si");
            System.out.println("2. No por ahora");
            int respuesta2 = leer.nextInt();
            leer.nextLine(); // Consumir el carácter de nueva línea en el búfer
            switch (respuesta2) {
                case 1:
                    registroDatos(listaMascotas);
                    break;
                case 2:
                    System.out.println("¡Recuerda llevar un folleto para promover la adopción!");
                    break;
            }
        } else {
            System.out.println("Gracias por visitar el refugio.");
        }
    }

    private void registroDatos(List<Perro> listaMascotas) {
        System.out.println("¿A quien quisieras adoptar? Indica su nombre");
        String nombre = leer.nextLine();
        for (Perro perro : listaMascotas) {
            if (perro.getNombre().equalsIgnoreCase(nombre)) {
                System.out.println("Vamos a corroborar que la mascota elegida esté disponible para ser tu compañero/a de vida");
                if (perro.isAdoptado()) {
                    System.out.println("Lo sentimos, ya se ha iniciado un proceso de adopción.");
                } else {
                    System.out.println("¡Felicitaciones! Nuestro rescatadito está buscando familia");
                    System.out.println("Ingresa tus datos para realizar el certificado de adopción");
                    Persona np = new Persona();
                    System.out.println("Nombre:");
                    np.setNombre(leer.nextLine());
                    System.out.println("Apellido:");
                    np.setApellido(leer.nextLine());
                    System.out.println("DNI:");
                    np.setDni(leer.nextInt());
                    System.out.println("Cargando datos...");
                    agregarPerroAdoptado(perro, np);
                    perro.setAdoptado(true);
                    System.out.println("¡Listo! En unos minutos podrás obtener el certificado y llevar a tu mejor amigo/a a casa.");
                    certificadoAdopcion(np);
                }
            }
        }
    }

    private void agregarPerroAdoptado(Perro perro, Persona np) {
        np.agregarPerroAdoptado(perro);
    }

    private void certificadoAdopcion(Persona np) {
        System.out.println("Certificado de adopción");
        System.out.println("Por la presente, se deja constancia que: " + np.getNombre() + " " + np.getApellido() + " con DNI " + np.getDni());
        System.out.println("Lleva en calidad de mejor amigo/a a las siguientes mascotas:");

        for (Perro perro : np.getPerrosAdoptados()) {
            System.out.println("Nombre: " + perro.getNombre() + ", raza: " + perro.getRaza() + ", edad: " + perro.getEdad() + " años");
        }
    }

}
