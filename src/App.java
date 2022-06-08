public class App {
    public static void main(String[] args) {
        
        int numeroIf=1;
        int numeroWhile=-2;
        int numeroDoWhile=2;
        String estacion = "ferri";

        System.out.println("Ejercicio con if:");

        if (numeroIf>0){              
            System.out.println("Es Positivo");
        }else if(numeroIf<0){
            System.out.println("Es Negativo");
        }else{
            System.out.println("Es Cero");
        }

        
        System.out.println("Ejercicio con While:");
        
        while(numeroWhile<3){
            System.out.println(numeroWhile);
            
            numeroWhile++;
        }



        System.out.println("Ejercicio con DoWhile:");

        do {
            System.out.println(numeroDoWhile);
            numeroDoWhile++;
            
        } while (numeroDoWhile<3);

        

        System.out.println("Ejercicio con For;");

        for (int numeroFor=0;numeroFor<=3;numeroFor++){
            System.out.println(numeroFor);
        }



        System.out.println("Ejercicio con Switch");{
            switch(estacion){
                case "Verano":
                System.out.printf(estacion);
                break;

                case "Otoño":
                System.out.println(estacion);
                break;

                case "Inverno":
                System.out.println(estacion);
                break;

                case "Primavera":
                System.out.println(estacion);
                break;

                default:
                    System.out.println("error");
                break;

            }
        }

    }
}
