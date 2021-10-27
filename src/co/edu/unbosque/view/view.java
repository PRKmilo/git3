package co.edu.unbosque.view;
import javax.swing.JOptionPane;
public class view {
	private int select=-1;
	public view() {
	}
	public int getSelect() {
		return select;
	}
	public void setSelect(int select) {
		this.select = select;
	}
	public String leerstring() {
		String respuesta="";
		respuesta=JOptionPane.showInputDialog("ingrese el primer numero");
		return respuesta;
	}
	public int leerDato1() {
		String d="";
		d=JOptionPane.showInputDialog("ingrese el primer numero");
		float f=Float.parseFloat(d);
		int  x=Math.round(f);
		System.out.println(x);
		return x;
	}
	public int mostrarmensaje() {
		String d="";
		d=JOptionPane.showInputDialog("que va hacer profe "
				+"\n 1.divisores"
				+"\n 3.iterador de entero"
				+ "\n5.numeros terminados en cuatro"
				+ "\n7.numeros entre 1 y 100"
				+"\n9.numeros terminados en 6"
				+"\n10 suma de un iterador"
				+"\n16 el promedio de los numeros con tres"
				+"\n21 suma digitos"
				+ "\n 0.salir\n");
		int f=Integer.parseInt(d);
		return f;
	}
	public void mostrarmensaje2(String mensaje) {
		JOptionPane.showMessageDialog(null, mensaje);
	}
}