public class Main {
    public static void main(String[] args) {
        int numero = 0;

        if (numero == 0) {
            System.out.println("es 0");
        } else if (numero < 0) {
            System.out.println("es negativo");
        } else {
            System.out.println("es positivo");
        }
        int numeroWhile = 0;
        while (numeroWhile < 3) {
            System.out.println(numeroWhile);
            numeroWhile = numeroWhile + 1;

        }
        int dowhile = 2;
        do {
            System.out.println(dowhile);
            dowhile = dowhile + 1;
        } while (dowhile < 3);

        int numeroFor = 0;
        for (numeroFor = 0; numeroFor <= 3; numeroFor++) {
            System.out.println(numeroFor);
        }
        var estacion = "domingo";

        switch (estacion) {
            case "VERANO":
                System.out.println("es verano");
                break;
            case "INVIERNO":
                System.out.println("es invierno");
                break;
            case "PRIMAVERA":
                System.out.println("Es primavera");
                break;
            case "OTOÑO":
                System.out.println("Es otoño");
                break;
            default:
                System.out.println("no es una estación");

        }
    }
}