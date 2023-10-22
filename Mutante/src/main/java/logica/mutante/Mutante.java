package logica.mutante;
/*
 La idea es crear cinco tipos diferentes de superhéroes/mutantes, utilizando POO,
con las carácterísticas especificadas en la toma de requerimientos.
 */
public class Mutante {

    public static void main(String[] args) {
        
        // Creamos un hombre de hielo.
        hombreDHielo hombreDHielo01, hombreDHielo02, hombreDHielo03;
        hombreDHielo01 = new hombreDHielo ("ICeMan01", "V", 100, true);
        hombreDHielo02 = new hombreDHielo ("ICeMan02", "V", 200, false);
        hombreDHielo03 = new hombreDHielo ("ICeMan03", "H", 300, true);
        
        System.out.println("**************************** Inicio: Jugando con los hombres de hielo");
        System.out.println(" nombre: " + hombreDHielo01.getNombre() +  " Sexo: " + hombreDHielo01.getSexo() + " Peso: " + hombreDHielo01.getPeso() + " Villano: " + hombreDHielo01.getVillano() );
        System.out.println(" nombre: " + hombreDHielo02.getNombre() +  " Sexo: " + hombreDHielo02.getSexo() + " Peso: " + hombreDHielo02.getPeso() + " Villano: " + hombreDHielo02.getVillano() );
        System.out.println(" nombre: " + hombreDHielo03.getNombre() +  " Sexo: " + hombreDHielo03.getSexo() + " Peso: " + hombreDHielo03.getPeso() + " Villano: " + hombreDHielo03.getVillano() );
          
        System.out.println("**************************** Añadimos 100 kilos a cada uno");
        hombreDHielo01.setPeso(hombreDHielo01.getPeso() + 100);
        hombreDHielo02.setPeso(hombreDHielo02.getPeso() + 100);
        hombreDHielo03.setPeso(hombreDHielo03.getPeso() + 100);
        
        System.out.println(" nombre: " + hombreDHielo01.getNombre() +  " Sexo: " + hombreDHielo01.getSexo() + " Peso: " + hombreDHielo01.getPeso() + " Villano: " + hombreDHielo01.getVillano() );
        System.out.println(" nombre: " + hombreDHielo02.getNombre() +  " Sexo: " + hombreDHielo02.getSexo() + " Peso: " + hombreDHielo02.getPeso() + " Villano: " + hombreDHielo02.getVillano() );
        System.out.println(" nombre: " + hombreDHielo03.getNombre() +  " Sexo: " + hombreDHielo03.getSexo() + " Peso: " + hombreDHielo03.getPeso() + " Villano: " + hombreDHielo03.getVillano() );
          
            
        hombreDHielo01.atacarConAgua();
        hombreDHielo01.moverseSH();
        hombreDHielo01.calcularNivelDPoder("Hombre_de_hielo");
        
         System.out.println("**************************** Inicio: Jugando con Aquaman");
        
        
    }
}
