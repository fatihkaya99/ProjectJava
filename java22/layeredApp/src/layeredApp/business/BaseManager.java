package layeredApp.business;

import java.util.ArrayList;
import java.util.List;
import layeredApp.core.logging.Logger;
import layeredApp.dataAccess.BaseDao;
import layeredApp.entities.Category;
import layeredApp.entities.Course;
import layeredApp.entities.Instructor;

public class BaseManager {
	private BaseDao courseDao;
	private Logger[] loggers;

	List<Course> courses = new ArrayList<>();
	List<Category> categories = new ArrayList<>();

	public BaseManager(BaseDao courseDao, Logger[] loggers) {
		this.courseDao = courseDao;
		this.loggers = loggers;
	}

	public void addInstructor(Instructor instructor) {
		courseDao.addInstructorDao(instructor);
		for (Logger logger : loggers) {
			logger.log(instructor.getName());
		}
	}

	public void addCourse(Course course) throws Exception {
		if (course.getPrice() < 0) {
			throw new Exception("Kurs Fiyatı 0'dan Küçük Olamaz");
		} else if (courses.contains(course)) {
			throw new Exception("Farklı Bir Kurs Adı Giriniz!!");
		} else {
			courseDao.addCourseDao(course);
			for (Logger logger : loggers) {
				logger.log(course.getName());
			}
		}
	}

	public void addCategory(Category category) throws Exception {
		if (categories.contains(category)) {
			throw new Exception("Farklı Bir Kategori Adı Giriniz!!");
		} else {

			courseDao.addCategoryDao(category);
			for (Logger logger : loggers) {
				logger.log(category.getName());
			}
		}
	}
}