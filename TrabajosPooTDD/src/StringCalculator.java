import java.util.ArrayList;
import java.util.StringTokenizer;



/*
* Trabajo realizado por
*
* Jorge Andres Agualimpia
* Andres Escobar
* Jhonny Aponte
*
* Para la clase de Programación orientada a objetos
* */
public class StringCalculator {

//Aqui se valida el punto 2 y 3 de la practica de TDD, se admiten varios numeros. Si la cadena esta vacia el resultado es 0
//public int add(String numbers){
//    int sumatoria = 0;
//    if(numbers.isEmpty()){
//        sumatoria = 0;
//    }else{
//        StringTokenizer st = new StringTokenizer(numbers, ",");
//        while(st.hasMoreTokens()){
//            sumatoria += Integer.parseInt(st.nextToken());
//        }
//    }
//    return sumatoria;
//

//Aqui se valida el punto 4 y 5, pues admite saltos en una nueva linea
//    public int add(String numbers){
//
//        int sumatoria = 0;
//        if(numbers.isEmpty()){
//            sumatoria = 0;
//        }else{
//
//            numbers = numbers.replace("\n", ",");
//            StringTokenizer st = new StringTokenizer(numbers, ",");
//
//            while(st.hasMoreTokens()){
//                    sumatoria += Integer.parseInt(st.nextToken());
//            }
//
//            }
//        return sumatoria;
//    }


//Se valida el punto 6 y 7, pues ahora se admiten varios delimitadores
//    public int add(String numbers){
//        int sumatoria = 0;
//
//        if(numbers.isEmpty()){
//            sumatoria = 0;
//        }else{
//            for (int i = 0; i < numbers.length() ; i++) {
//                if(numbers.charAt(i) == '/' && numbers.charAt(i+1) == '/'){
//                    if(numbers.charAt(i+2) != '['){
//                        numbers = numbers.replace(numbers.charAt(i), ',');
//                        numbers = numbers.replace(numbers.charAt(i+2), ',');
//                    }else{
//                        continue;
//                    }
//                }
//            }
//
//            numbers = numbers.replace("\n", ",");
//            StringTokenizer st = new StringTokenizer(numbers, ",");
//
//            while(st.hasMoreTokens()){
//                sumatoria += Integer.parseInt(st.nextToken());
//            }
//
//        }
//        return sumatoria;
//    }

//Se valida el punto 8, pues ya no son admitidos numeros negativos, ya que si aparecen se lanza un RunTimeException
//    public int add(String numbers){
//        int sumatoria = 0;
//
//        if(numbers.isEmpty()){
//            sumatoria = 0;
//        }else{
//            for (int i = 0; i < numbers.length() ; i++) {
//                if(numbers.charAt(i) == '/' && numbers.charAt(i+1) == '/'){
//                    if(numbers.charAt(i+2) != '['){
//                        numbers = numbers.replace(numbers.charAt(i), ',');
//                        numbers = numbers.replace(numbers.charAt(i+2), ',');
//                    }else{
//                        continue;
//                    }
//                }
//            }
//
//            numbers = numbers.replace("\n", ",");
//            StringTokenizer st = new StringTokenizer(numbers, ",");
//
//                while(st.hasMoreTokens()){
//                    if(Integer.parseInt(st.nextToken()) <= 0){
//                        throw new RuntimeException("No se aceptan numeros negativos");
//                    }
//                    sumatoria += Integer.parseInt(st.nextToken());
//                }
//        }
//
//        return sumatoria;
//    }

//Se valida el punto 9, pues ya no se admiten numeros mayores a 1000
//    public int add(String numbers){
//        int sumatoria = 0;
//
//        if(numbers.isEmpty()){
//            sumatoria = 0;
//        }else{
//            for (int i = 0; i < numbers.length() ; i++) {
//                if(numbers.charAt(i) == '/' && numbers.charAt(i+1) == '/'){
//                    if(numbers.charAt(i+2) != '['){
//                        numbers = numbers.replace(numbers.charAt(i), ',');
//                        numbers = numbers.replace(numbers.charAt(i+2), ',');
//                    }else{
//                        continue;
//                    }
//                }
//            }
//
//            numbers = numbers.replace("\n", ",");
//            StringTokenizer st = new StringTokenizer(numbers, ",");
//
//            while(st.hasMoreTokens()){
//                int numeroParaSumar = Integer.parseInt(st.nextToken());
//                if(numeroParaSumar < 0){
//                    throw new RuntimeException("No se aceptan numeros negativos");
//                }else{
//                    if(numeroParaSumar <= 1000){
//                        sumatoria += numeroParaSumar;
//                    }
//                }
//            }
//        }
//        return sumatoria;
//    }

//Se valida el punto 10, puesto que ahora los delimitadores pueden ser de cualquier tamaño
//    public int add(String numbers){
//        int sumatoria = 0;
//        String nuevoDelimitador="___";
//
//        if(numbers.isEmpty()){
//            sumatoria = 0;
//        }else{
//            for (int i = 0; i < numbers.length() ; i++) {
//                if(numbers.charAt(i) == '/' && numbers.charAt(i+1) == '/'){
//                    if(numbers.charAt(i+2) != '['){
//                        numbers = numbers.replace(numbers.charAt(i), ',');
//                        numbers = numbers.replace(numbers.charAt(i+2), ',');
//
//                    }else{
//
//                        StringTokenizer stRemplazo = new StringTokenizer(numbers, "]");
//                        nuevoDelimitador = "";
//
//                        while(stRemplazo.hasMoreTokens()){
//
//                            String palabraTemporal;
//                            palabraTemporal = stRemplazo.nextToken();
//
//                            for (int j = 0; j < palabraTemporal.length(); j++) {
//                                if(palabraTemporal.charAt(j)!= '/' && palabraTemporal.charAt(j)!= '\n' && palabraTemporal.charAt(j)!= '['){
//                                    nuevoDelimitador += palabraTemporal.charAt(j);
//                                    continue;
//                                }
//                            }
//                            numbers = numbers.replace('/', ',');
//                            numbers = numbers.replace('[', ',');
//                            numbers = numbers.replace(']', ',');
//                            break;
//                        }
//                    }
//                }
//            }
//
//            numbers = numbers.replace(nuevoDelimitador, ",");
//            numbers = numbers.replace("\n", ",");
//
//            StringTokenizer st = new StringTokenizer(numbers, ",");
//
//            while(st.hasMoreTokens()){
//                int numeroParaSumar = Integer.parseInt(st.nextToken());
//                if(numeroParaSumar < 0){
//                    throw new RuntimeException("No se aceptan numeros negativos");
//                }else{
//                    if(numeroParaSumar <= 1000){
//                        sumatoria += numeroParaSumar;
//                    }
//                }
//            }
//        }
//        return sumatoria;
//    }

//Se valida el punto 11 y 12, puesto que ahora los delimitadores pueden ser varios
//Ademas se necesita que la variable que contiene el delimitador a agregar no este vacia para que este sea valido
        public int add(String numbers){
        int sumatoria = 0;
        String nuevoDelimitador="___";
        ArrayList<String> contenedorDelimitadores = new ArrayList<String>();

        if(numbers.isEmpty()){
            sumatoria = 0;
        }else{
            for (int i = 0; i < numbers.length() ; i++) {
                if(numbers.charAt(i) == '/' && numbers.charAt(i+1) == '/'){
                    if(numbers.charAt(i+2) != '['){
                        numbers = numbers.replace(numbers.charAt(i), ',');
                        numbers = numbers.replace(numbers.charAt(i+2), ',');

                    }else{

                        StringTokenizer stRemplazo = new StringTokenizer(numbers, "]");
                        nuevoDelimitador = "";

                        while(stRemplazo.hasMoreTokens()){

                            String palabraTemporal;
                            palabraTemporal = stRemplazo.nextToken();
                            System.out.println(palabraTemporal);

                            if(!(nuevoDelimitador.isEmpty())){
                                contenedorDelimitadores.add(nuevoDelimitador);
                                System.out.println("Esto hay dentro del nuevoDelimitador" + nuevoDelimitador);
                                nuevoDelimitador = "";
                            }

                            for (int j = 0; j < palabraTemporal.length(); j++) {
                                if(palabraTemporal.charAt(j)!= '/' && palabraTemporal.charAt(j)!= '\n' && palabraTemporal.charAt(j)!= '['){
                                    System.out.println(palabraTemporal);
                                    nuevoDelimitador += palabraTemporal.charAt(j);
                                    break;
                                }else{
                                    System.out.println("Se ha encontrado el salto de linea" + nuevoDelimitador);
                                    if(palabraTemporal.charAt(j) == '\n'){
                                        break;
                                    }
                                }
                            }
                            continue;
                        }
                    }
                }
            }

            System.out.println(numbers);

            for (String delimitador : contenedorDelimitadores) {
                System.out.println("Se va a remplazar" + delimitador);
                numbers = numbers.replace(delimitador, ",");
            }

            numbers = numbers.replace('/', ',');
            numbers = numbers.replace('[', ',');
            numbers = numbers.replace(']', ',');
            numbers = numbers.replace(nuevoDelimitador, ",");
            numbers = numbers.replace('\n', ',');

            System.out.println(numbers);

            StringTokenizer st = new StringTokenizer(numbers, ",");

            System.out.println(numbers);
            while(st.hasMoreTokens()){
                int numeroParaSumar = Integer.parseInt(st.nextToken());
                if(numeroParaSumar < 0){
                    throw new RuntimeException("No se aceptan numeros negativos");
                }else{
                    if(numeroParaSumar <= 1000){
                        sumatoria += numeroParaSumar;
                    }
                }
            }
        }
        return sumatoria;
    }
}
