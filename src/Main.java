import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //menu :
        /*agregar ingrediente: clase inrgediente
        agregar receta : recetario llame al costructor
        consultar recetario: o sigring en recetario
         */
        //INGREDEINTES. guardarlos en un arrayList
        //crear recetas
        //crear recetas y guardar recetas en el

        //menu, ingrdientes  do while (-1) arreglo
        //.add (agregar)
        //ArraysList<>(Arrays.asList(todos los elementos,...))
        Ingrediente queso= new Ingrediente("queso",100,true);
        Ingrediente tortilla= new Ingrediente("tortilla",1000,true);
        Ingrediente cebolla= new Ingrediente("cebolla",10,true);
        Ingrediente salsa= new Ingrediente("salsa",20,true);

        ArrayList<Ingrediente> ingredientesDisponibles= new ArrayList<>();
        ingredientesDisponibles.add(queso);
        ingredientesDisponibles.add(tortilla);
        ingredientesDisponibles.add(cebolla);
        ingredientesDisponibles.add(salsa);

        Receta quesadilla= new Receta(
                "Quesadilla",
                10.7,
                new ArrayList<>(Arrays.asList(queso,tortilla)),
                new ArrayList<>(Arrays.asList("Calentar la tortilla","Separar el queso",
                        "Poner el queso adentro de la tortilla","Esperar a que se derrita el queso"))
        );
      //  do{}while
        Recetario miRecetario = new Recetario( "Nalani", "Recetas caseras",
                new ArrayList<>(Arrays.asList(quesadilla)));

        System.out.println("Bienvenido,elije una opcion:");
        System.out.println("1. Agregar un ingrediente ");
        System.out.println("2. Agregar una receta");
        System.out.println("3. Ver mi recetario");
        //salir

        Scanner scanner= new Scanner(System.in);
        int respuesta;
        respuesta=scanner.nextInt();
        switch (respuesta){
            case 1:
                Ingrediente nuevo= new Ingrediente();
                System.out.println("Ingrese el nombre del ingrediente");
                nuevo.setNombre(scanner.next());
                System.out.println("Ingrese la cantidad");
                nuevo.setPeso(scanner.nextDouble());
                System.out.println("¿Tu ingrediente es salado?  1. Sí \t2. No ");
                if (scanner.nextInt()==1){
                    nuevo.setSalado(true);
                }else{
                    nuevo.setSalado(false);
                }
                System.out.println("Ingrediente creado");
                ingredientesDisponibles.add(nuevo);
                break;
            case 2:
                Receta nueva= new Receta();
                System.out.println("Ingrese el nombre de la receta");
                nueva.setNombre(scanner.next());
                System.out.println("Ingrese el tiempo de preparacion ");
                nueva.setTiempoPreparacion(scanner.nextDouble());
                System.out.println("Los ingredientes disponibles son:");
                for (int i = 0; i < ingredientesDisponibles.size(); i++) {
                    System.out.println(i+1 +". "+ingredientesDisponibles.get(i).getNombre());
                }
                ArrayList<Ingrediente>ingredientesReceta=new ArrayList<>();
                System.out.println("Ingrese el numero del ingrediente corresponiente y de enter," +
                        "si ya no quiere agregar más escriba 0");
                do {
                    if(respuesta!=0){
                        ingredientesReceta.add(ingredientesDisponibles.get(respuesta-1));
                    }
                }while (respuesta!=0);
                break;
            case 3:
                    break;
        }
    }
}
