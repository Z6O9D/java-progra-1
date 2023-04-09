	package ejecucion;
	import api.PilaTDA;
	import impl.PilaLD;

public class tppila1b {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PilaTDA objPila = new PilaLD();
		objPila.InicializarPila();
		
		for(int i=0; i<10; i++)
			objPila.Apilar(i + 1);
		
		PilaTDA inversaPila = pasarPila(objPila);
		imprimirPila(inversaPila);
	}
	
	public static PilaTDA pasarPila(PilaTDA obj) {
		PilaTDA nuevaPila = new PilaLD();
		nuevaPila.InicializarPila();
		PilaTDA igualPila = new PilaLD();
		igualPila.InicializarPila();
		while(!obj.PilaVacia()) {
			nuevaPila.Apilar(obj.Tope());
			System.out.println("El valor del elemento de la pila inicial es: " + obj.Tope());
			obj.Desapilar();
		}
		while(!nuevaPila.PilaVacia()) {
			igualPila.Apilar(nuevaPila.Tope());
			nuevaPila.Desapilar();
		}
		return igualPila;
	}
	public static void imprimirPila(PilaTDA objPila) {
		while(!objPila.PilaVacia()) {
			System.out.println("El valor del elemento de la pila es: " + objPila.Tope());
			objPila.Desapilar();
		}
			
	}

}
