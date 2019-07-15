package Vistas;

import java.util.List;

import Dao.EstudianteDao;
import entity.Estudiante;

public class VistaApp {

	public static void main(String[] args) {
		
		EstudianteDao stDao = new EstudianteDao();
		Estudiante estudiante = new Estudiante("Kike","Fadatare","rameshfadatare@javaguides.com");
		stDao.saveStudent(estudiante);
		
		List<Estudiante>estudiantes = stDao.getStudents();
		estudiantes.forEach(s -> System.out.println(s.getNombre()));
	}

}
