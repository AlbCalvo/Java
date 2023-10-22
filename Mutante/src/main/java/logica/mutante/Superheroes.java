package logica.mutante;
/*
 Vamos a crear cinco tipos diferentes de superhéroes/mutantes, utilizando POO,
con las carácterísticas especificadas en la toma de requerimientos.
  Creación de una clase que englobe las características comunes de cualquier superhéroe */

public abstract class Superheroes {
    // Atributos
    protected String nombre; 
    protected String sexo; //  Hombre ó Mujer
    protected int peso;
    protected Boolean villano; // 0 - Villano 1-Héroe
    
    // CONSTRUCTOR: Con el que crearemos los objetos/superhéroes.
    public Superheroes(String nombre, String sexo, int peso, Boolean villano) {
        this.nombre = nombre;
        this.sexo = sexo;
        this.peso = peso;
        this.villano = villano;
    }
    // GETTER: Leeremos los atributos de nuestros superhéroes.

    public String getNombre() {
        return nombre;
    }

    public String getSexo() {
        return sexo;
    }

    public int getPeso() {
        return peso;
    }

    public Boolean getVillano() {
        return villano;
    }
    // SETTER: Modificaremos las característcas de nuestros superhéroes.

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public void setVillano(Boolean villano) {
        this.villano = villano;
    }
    
    // Método común a todos los superhéroes.
    public void calcularNivelDPoder (String nombreMutante){
        int nivelDPoder;
        
        switch (nombreMutante) {
            case "Hombre_de_hielo": nivelDPoder = 1;
            break;
            case "Aquaman": nivelDPoder = 2;
            break;
            case "Ciclope": nivelDPoder = 3;
            break;
            case "Tormenta": nivelDPoder = 4;
            break;
            default: nivelDPoder = 99;
        }
        System.out.println(" El superhéroe " + nombreMutante + " está considerado de nivel " + nivelDPoder + " de poder en el universo.");
     }
    
    // MÉTODO ABASTRACTO: Todos hacen la acción pero cada uno de diferente manera.
    protected abstract void moverseSH();
      
    
    
}
