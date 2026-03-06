import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Declarar mi coleccion de objetos
		/* Indice 0 */Doctores doctor1 = new Doctores(32545, "Javier mendez", 6364646744l, 'H');
		/* Indice 1 */Doctores doctor2 = new Doctores(646464, "Carmelo Paniagua", 634747474, 'H');
		/* Indice 2 */Doctores doctor3 = new Doctores(747474, "Olga Sanchez Mendez", 64647474, 'M');

		// Declarar la lista
		List<Doctores> listaNueva = new ArrayList<Doctores>();

		System.out.println("Hola mundo");
		System.out.println("Tenes un " + 100);

		// Metodos del crud basico

		// Agregar elementos a la lista .add
		listaNueva.add(doctor1);
		listaNueva.add(doctor2);
		listaNueva.add(doctor3);

		// Mostrar
		System.out.println(listaNueva);

		// Reserva de espacio en memoria
		Doctores doctor = null;

		// Buscar elementos en la lista .get(indice)
		doctor = listaNueva.get(1);
		System.out.println("Se encontro " + doctor);

		// Editar --- primero hay que buscar
		doctor = listaNueva.get(0);
		doctor.setNombre("Benito Gonzales");

		// Mostrar
		System.out.println(listaNueva);

		// Eliminar por indice .remove
		listaNueva.remove(0);

		// Mostrar
		System.out.println(listaNueva);

	}

}
