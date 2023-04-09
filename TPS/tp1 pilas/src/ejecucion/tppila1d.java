package ejecucion;
import api.PilaTDA;
import impl.PilaLD;

public class tppila1d {
public static void main(String[] args) {
	// TODO Auto-generated method stub
	PilaTDA objPila = new PilaLD();
	objPila.InicializarPila();
	
	for(int i=0; i<10; i++)
		objPila.Apilar(i + 1);
	
	Pilacontada(objPila);
	
}

public static void Pilacontada(PilaTDA obj) {
	int contar=0,contador=0,promedio;
	while(!obj.PilaVacia()) {
		contar=contar+obj.Tope();
		contador=contador+1;
		System.out.println("El valor del elemento de la pila inicial es: " + obj.Tope());
		obj.Desapilar();
	}
	System.out.println("La cantidad de elementos de la pila es: " + contador);
	promedio=contar/contador;
	System.out.println("El promedio de los elementos de la pila es: " + promedio);
	}
}


