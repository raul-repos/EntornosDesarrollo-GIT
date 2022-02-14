import com.github.raul_repos.Division;
import com.github.raul_repos.Suma;


public class Main {
    public static void main(String[] args){
        //Cada uno crea su rama y mergeamos a la main.
        //Cuando esten todas las ramas unidas en la rama main, modificamos esta Clase Main
        //Los conflictos al hacer push de los cambios en la Clase Main los resolvemos por Whatsapp
        Division d = new Division();
        double metodoUno = d.dividir(1,2);
        System.out.println(metodoUno);
        Suma s = new Suma();
        int SegundoMetodo = s.sumar(1,2);
        System.out.println(SegundoMetodo);

    }
}
