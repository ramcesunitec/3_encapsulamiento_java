
package dominio;

//Con la palabra final no se puede tener clase hija
public final class e_Persona_PalabraFinal {
   
    public final static int MI_CONSTANTE=1; 
    private String nombre;
    
    //Con palabra final no se puede alterar este metodo
    public final void imprimir(){
        System.out.println("Metodo Imprimir");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
}
