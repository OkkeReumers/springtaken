package be.vdab;

import java.util.Arrays;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import be.vdab.entities.Persoon;
import be.vdab.presentation.PersoonViewer;

public class Main {
	public static void main(String[] args) {
		try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"container.xml")) {
			context.getBean(PersoonViewer.class).afbeelden(
					Arrays.asList(new Persoon(1, "Eddy", "Wally", 1),
							new Persoon(2, "Willy", "Sommers", 2)));
		}
	}
}