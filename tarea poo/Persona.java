/* Tarea POO
Ivan Andres Lopez Linares*/

public class Persona{
	private string nombre;
	private int edad;
	private string estado;
	private string pais;

	public Persona(string nombre, int edad, string estado, string pais){
		this.nombre=nombre;
		this.edad=edad;
		this.string=estado;
		this.string=pais;
	}

	void mostrar(){
		System.out.println("nombre= " + nombre);
		System.out.println("edad= " + edad);
		System.out.println("estado= " + estado);
		System.out.println("pais= " + pais);
	}

	public static void main(String args[]){
		int edad=18;
		string nombre="Iván", estado="estudiante", pais="El Salvador";

		Persona persona=new Persona(nombre,edad,estado,pais);

		persona.mostrar();
	}
}