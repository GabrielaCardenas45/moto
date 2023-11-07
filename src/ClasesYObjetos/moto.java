package ClasesYObjetos;

public class moto {
    String color;
    String marca;
    int km;


        public static void main(String[] args) {
            moto moto1 = new moto();
            moto1.color = "azul";
            moto1.marca = "susuki";
            moto1.km = 208;
           System.out.println("el color de la moto es: " + moto1.color);
            System.out.println("la marca de la moto es: " + moto1.marca);
            System.out.println ("el kilometraje de la moto es: " + moto1.km);




            moto moto2 = new moto();
            moto2.color = "negra";
            moto2.marca = "mt-09";
            moto2.km = 200;
            System.out.println("el color de la moto es: " + moto2.color);
            System.out.println("la marca de la moto es: " + moto2.marca);
            System.out.println ("el kilometraje de la moto es: " + moto2.km);



            moto moto3 = new moto();
            moto3.color = "roja";
            moto3.marca = "pulsar";
            moto3.km = 200;
            System.out.println("el color de la moto es: " + moto3.color);
            System.out.println("la marca de la moto es: " + moto3.marca);
            System.out.println ("el kilometraje de la moto es: " + moto3.km);

        }
    }
