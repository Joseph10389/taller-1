import PuntoCinco.Student;
import PuntoSiete.Person;

public class Principal {
	public static void main(String[] args) {
		
		//crear un objeto de tipo Studen con la siguiente sintaxis
		//primero coloco el tipo de dato del objeto, despues el nombre del objeto
		//luego el signo igual, despues la palabra new y por ultimo el constructor de la clase
		Student st = new Student ();
		System.out.println(st.name + "\n" + st.id + "\n" + st.status);
		
		PuntoSiete();
	}
	
	public static void PuntoSiete( ) {
		
		Person p1 = new Person(37, "Arial");
		Person p2 = new Person(15, "Joseph");
		
		if(p1.getAge() == p2.getAge()) {
			
			System.out.println(p1.getName()+" Tiene la misma edad "+p2.getName());
		}
		else
		{
			System.out.println(p1.getName()+" No es la misma edad "+p2.getName());
		}
	}

}
