public class Televisor {
  private boolean estaPrendido;
  private int canal;
  private int volumen;
  
  public Televisor(){
    estaPrendido = false;
  }
  public void prender(){
    estaPrendido = true;
  }
  
  public void apagar(){
    estaPrendido = false;
  }
  
  public void subirVolumen(){
    if(estaPrendido&&volumen<100){
      volumen ++; //Esto es lo mismo que volumen = volumen + 1;
    }else{
      System.out.println("No se puede subir el volumen si el televisor no está prendido o si se superó el volúmen mínimo");
    }
    
  }
  
  public void bajarVolumen(){
    if(estaPrendido){
      if(volumen>0){
        volumen --; //Esto es lo mismo que volumen = volumen + 1;
      }else{
        System.out.println("No se puede seguir bajando el volúmen");
      }
    }else{
      System.out.println("No se puede bajar el volumen si el televisor no está prendido");
    }
    
  }
  
  public void cambiarCanal(int canal){
    if(estaPrendido){
      this.canal = canal;
    }else{
      System.out.println("No se puede cambiar el canal si el televisor no está prendido");
    }
  }
  
  public int getCanal(){
    return canal;
  }
  
  public int getVolumen(){
    return volumen;
  }
  
  public boolean getEstado(){
    return estaPrendido;
  }
}
