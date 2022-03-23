package clase;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentiReader extends AplicantReader {

	public StudentiReader(String file) throws FileNotFoundException {
		super(file);
	}

	@Override
	public List<Aplicant> readAplicants() throws FileNotFoundException {
		
		scanner.useDelimiter(",|\n");
		List<Aplicant> studenti = new ArrayList<Aplicant>();

		while (scanner.hasNext()) {
			Student student=new Student();
			readAplicant(scanner, student);
			int an_studii = scanner.nextInt();
			String facultate = (scanner.next()).toString();
			student.setAnStudii(an_studii);
			student.setFacultate(facultate);
			studenti.add(student);
		}
		scanner.close();
		return studenti;
	}

}
