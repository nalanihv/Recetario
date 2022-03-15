import java.util.ArrayList;
import java.util.Arrays;

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




    }
}
