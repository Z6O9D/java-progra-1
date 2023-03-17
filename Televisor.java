class Televisor {
  private boolean estaPrendido;
  private int canal;
  private int volumen;

  public void prender() {
    estaPrendido = true;
  }

  public void apagar() {
    estaPrendido = false;
  }

  public void subirVolumen() {
    if (estaPrendido) {
      volumen++;

    } else {
      System.out.println("No se puede subir el volumen del televisor");
    }

  }

  public void bajarVolumen() {
    if (estaPrendido) {
      volumen--;

    } else {
      System.out.println("No se puede bajar el volumen del televisor");
    }
  }

  public void cambiarCanal(int canal) {
    if (estaPrendido) {
      this.canal = canal;
    } else {
      System.out.println("No se puede cambiar el canal del televisor");
    }
  }

  public int getVolumen() {
    return volumen;
  }

  public int getcanal() {
    return canal;
  }

}
