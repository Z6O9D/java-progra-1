package impl;

import api.PilaTDA;

public class PilaLD implements PilaTDA{
	public class Nodo{
		int info;
		Nodo sig;
	}
	
	private Nodo origen;
	
	@Override
	public void InicializarPila() {
		// TODO Auto-generated method stub
		origen = null;
	}

	@Override
	public void Apilar(int x) {
		// TODO Auto-generated method stub
		Nodo nuevo = new Nodo();
		
		nuevo.info = x;
		nuevo.sig = origen;
		
		origen = nuevo;
		
	}

	@Override
	public void Desapilar() {
		// TODO Auto-generated method stub
		origen = origen.sig;
		
	}

	@Override
	public int Tope() {
		// TODO Auto-generated method stub
		return origen.info;
	}

	@Override
	public boolean PilaVacia() {
		// TODO Auto-generated method stub
		return (origen == null);
		/*
		if(origen == null) {
			return true;
		}else {
			return false;
		}*/
		
		
	}

}
