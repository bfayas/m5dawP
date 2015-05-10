package p;

import java.util.Scanner;

public class EdadPersonas {
		    private Scanner teclado;
		    private String nombre;
		    private int edad;
		    
		    public void inicializar() {
		        teclado=new Scanner(System.in);
		        System.out.print("Indiqueu el nom:");
		        nombre=teclado.next();
		        System.out.print("Indiqueu la edat:");
		        edad=teclado.nextInt();
		    }
		    
		    public void imprimir() {
		        System.out.println("Nom:"+nombre);
		        System.out.println("Edat:"+edad);
		    }
		    
		    public void esMayorEdad() {
		        if (edad>=18) {
		            System.out.print(nombre+" és major d'edat.");
		        } else {
		            System.out.print(nombre+" no és major d'edat.");
		        }
		    }
		    
		    public static void main(String[] ar) {
		        EdadPersonas persona1;
		        persona1=new EdadPersonas();
		        persona1.inicializar();
		        persona1.imprimir();
		        persona1.esMayorEdad();
		    }
}


