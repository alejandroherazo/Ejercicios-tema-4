public class Main {
    public static void main(String[] args) {
        int NumeroIf=21,NumeroWhile=0,NumberFor=0;

        System.out.printf("Numero If="+NumeroIf+"\n");
        if (NumeroIf<0) {
            System.out.println("Es Negativo= " + NumeroIf);
        } else if (NumeroIf>0) {
            System.out.println("Es Positivo= "+NumeroIf);
        }
        else {
            System.out.printf("Es Igual a 0= "+NumeroIf);
        }

        System.out.printf("\n\nNumero while= "+NumeroWhile+"");

             while (NumeroWhile<3){
                 NumeroWhile++;
                 System.out.printf(String.valueOf("\n"+NumeroWhile));
             }

            do {
                NumeroWhile++;
                System.out.printf("\n\nNumero Do_while= "+NumeroWhile+"\n\n");
            }while(NumeroWhile<3);

            for (;NumberFor <= 3;NumberFor++){
                System.out.printf("NumberFor= "+NumberFor+"\n");
        }
        System.out.printf("\n");
            String Estacion="Verano";
            switch (Estacion){
                case "Primavera":
                    System.out.printf("Es "+Estacion);
                    break;
                case "Verano":
                    System.out.printf("Es "+Estacion);
                    break;
                case "Otoño":
                    System.out.printf("Es "+Estacion);
                    break;
                case "Invierno":
                    System.out.printf("Es "+Estacion);
                    break;
            }

    }

}