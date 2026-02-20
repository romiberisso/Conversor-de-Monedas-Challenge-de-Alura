import java.text.DecimalFormat;
import java.util.Scanner;
import static java.awt.SystemColor.menu;
import static java.lang.System.out;
import static java.lang.System.setOut;

public class Main {
    public static void main(String[] args) {
        ConsumoAPI api = new ConsumoAPI();
        Object ConversionResponse = new ConversionResponse();

        out.println("Bienvenido al Conversor de Monedas");
        var menu = """
                Por favor, seleccione una de las siguientes opciones:
                1. Convertir de Dólares a Pesos Argentinos.
                2. Convertir de Pesos argentinos a Dólares.
                3. Convertir de Dólares a Pesos Mexicanos.
                4. Convertir de Pesos Mexicanos a Dólares.
                5. Convertir de Real Brasileño a Pesos Argentinos.
                6. Convertir de Pesos Argentinos a Real Brasileño .
                7. Salir
                """;
        Scanner opcionUsuario = new Scanner(System.in);

        int opcion = 0;
        double canitdad = 0.0;
              while (opcion != 7) {
                  out.println(menu);
                  if (opcionUsuario.hasNextInt()) {
                      opcion = opcionUsuario.nextInt();
                  } else {
                      out.println("Opción inválida");
                      opcionUsuario.next();
                      continue;
                  }

                      if (opcion == 7) {
                      out.println("Gracias por utilizar el conversor de monedas!!");
                      out.println("Cerrando Conversor...");
                      break;}


            String from = "";
            String to = "";
            switch (opcion) {
                case 1: {
                    from = "USD";
                    to = "ARS";
                    out.println("***********Ingresar la cantidad deseada de Dolares que quiere convertir***********");
                    canitdad = opcionUsuario.nextInt();
                    out.println("Convirtiendo a Peso Argentino");
                    break;
                }
                case 2: {
                    from = "ARS";
                    to = "USD";
                    out.println("***********Ingresar la cantidad deseada de Pesos Argentinos que quiere convertir***********");
                    canitdad = opcionUsuario.nextInt();
                    out.println("Convirtiendo a Dolares");
                    break;
                }
                case 3: {
                    from = "USD";
                    to = "MXN";
                    out.println("***********Ingresar la cantidad deseada de Dolares que quiere convertir***********");
                    canitdad = opcionUsuario.nextInt();
                    out.println("Convirtiendo a Pesos Mexicanos");
                    break;
                }
                case 4: {
                    from = "ARS";
                    to = "USD";
                    out.println("***********Ingresar la cantidad deseada de Pesos Argentinos que quiere convertir***********");
                    canitdad = opcionUsuario.nextInt();
                    out.println("Convirtiendo a Dolares");
                    out.println();
                    break;
                }
                case 5: {
                    from = "BRL";
                    to = "ARS";
                    out.println("***********Ingresar la cantidad deseada de Reales Brasileros que quiere convertir***********");
                    canitdad = opcionUsuario.nextInt();
                    out.println("Convirtiendo a Pesos Argentinos");
                    break;
                }
                case 6: {
                    from = "ARS";
                    to = "BRL";
                    out.println("***********Ingresar la cantidad deseada de Pesos Argentinos que quiere convertir***********");
                    canitdad = opcionUsuario.nextInt();
                    out.println("Convirtiendo a Reales Brasileros");
                    out.println();
                    break;
                }
                default:
                    out.println("Opcion invalida");
                    continue;
            }
            String resultado = api.consumoApi(from, to, canitdad);
            out.println("Conversion exitosa:");
            out.println("Su resultado es: " + resultado + " " + to);
              }
    }
}




