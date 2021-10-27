package co.edu.unbosque.controller;

import co.edu.unbosque.model.numerolimite;
import co.edu.unbosque.view.view;

public class controller {
	private numerolimite num;
	private view vista;
	public controller() {
		num=new numerolimite(0,0);
		vista=new view();
		funcionar();
	}
	public void funcionar() {
		while(vista.getSelect()!=0) {
			int select=vista.mostrarmensaje();
			switch(select) {
			case 1:
				num.setNumero(vista.leerDato1()); 
				vista.mostrarmensaje2(""+iteradordivisores());
				System.exit(0);
			case 3:
				num.setNumero(vista.leerDato1());
				vista.mostrarmensaje2(""+iterador());
				System.exit(0);
			case 5:
				num.setNumero(vista.leerDato1());
				num.setNumero2(vista.leerDato1());
				vista.mostrarmensaje2(""+terminacon4());
				System.exit(0);
			case 7:
				vista.mostrarmensaje2(""+entre1y100());
				System.exit(0);
			case 9:
				vista.mostrarmensaje2(""+numerosterminadosen6());
				System.exit(0);
			case 10:
				num.setNumero(vista.leerDato1());
				vista.mostrarmensaje2(sumanumeros());
				System.exit(0);
			case 16:
				num.setNumero(vista.leerDato1());
				vista.mostrarmensaje2(""+premedio3());
				System.exit(0);
			case 21:
				num.setNumero(vista.leerDato1());
				vista.mostrarmensaje2(""+sumadigitos());
				System.exit(0);


			case 0:
				vista.mostrarmensaje2("hasta luego");
				System.exit(0);
			}
		}
	}
	public int premedio3() {
		int respuesta=0;
		int contador=0;
		int promedio=0;
		for(int x=0;x<=num.getNumero();x++) {
			if(x%3==0) {
				contador+=x;
				promedio=contador/num.getNumero();
				respuesta=promedio;
			}
		}
		return respuesta;
	}
	public String sumanumeros() {
		String	 respuesta="";
		int entero=0;
		for(int x=0;x<num.getNumero();x++) {
			entero+=x;
			respuesta=""+entero;
		}
		return respuesta;
	}
	public String entre1y100() {
		String respuesta="";
		for(int x=1;x<100;x++) {
			respuesta=respuesta+x+"\n";
		}
		return respuesta;
	}
	public String terminacon4() {
		String respuesta="";

		for(int x=num.getNumero();x<num.getNumero2();x++) {
			if(x%10==4) {
				respuesta=respuesta+x+"\n";
			}
		}
		return respuesta;
	}
	public String iterador() {
		String respuesta="";
		for (int x=0;x<num.getNumero2();x++) {
			respuesta=respuesta+x;
		}
		return respuesta;
	}
	public String numerosterminadosen6() {
		String respuesta="";
		for(int x=25;x<205;x++) {
			if(x%10==6) {
				respuesta=respuesta+x+"\n";
			}
		}
		return respuesta;
	}

	public String iteradordivisores() {
		String respuesta="";
		for(int x=1;x<num.getNumero();x++) {
			if ((num.getNumero()%x==0)) {
				respuesta=respuesta+x+"\n";
			}
		}
		return respuesta;
	}
	public int sumadigitos() {
		int respuesta=0;
		int contador=0;
		String numerop=String.valueOf(num.getNumero());
		for(int x=0;x<numerop.length();x++) {
			int numero= Character.getNumericValue(numerop.charAt(x));
			System.out.println(numero);
			contador+=numero;
			respuesta=contador;
		}
		return respuesta;
	}
}

