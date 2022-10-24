package layeredApp;

import layeredApp.business.BaseManager;
import layeredApp.core.logging.DatabaseLoggger;
import layeredApp.core.logging.FileLogger;
import layeredApp.core.logging.Logger;
import layeredApp.core.logging.MailLogger;

import layeredApp.dataAccess.JdbcDao;
import layeredApp.entities.Category;
import layeredApp.entities.Course;
import layeredApp.entities.Instructor;

public class Main {

	public static void main(String[] args) throws Exception {

		Instructor instructor = new Instructor(2, "Engin Demiroğ", 25);
		Course course = new Course(30, "Java Programlama", 1000);
		Category category = new Category(1, "Veri");

		Logger[] loggers = { new DatabaseLoggger(), new FileLogger(), new MailLogger() };
		BaseManager baseManager = new BaseManager(new JdbcDao(), loggers);
		baseManager.addInstructor(instructor);
		baseManager.addCourse(course);
		baseManager.addCategory(category);

	}

}
