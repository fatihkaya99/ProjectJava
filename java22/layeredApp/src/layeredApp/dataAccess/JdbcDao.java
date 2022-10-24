package layeredApp.dataAccess;

import layeredApp.entities.Category;

import layeredApp.entities.Course;
import layeredApp.entities.Instructor;

public class JdbcDao implements BaseDao {

	@Override
	public void addInstructorDao(Instructor instructor) {
		System.out.println("JDBC ile Eğitmen Eklendi : " + instructor.getName());

	}

	@Override
	public void addCourseDao(Course course) {

		System.out.println("JDBC ile Kurs Eklendi" + course.getName());
	}

	@Override
	public void addCategoryDao(Category category) {

		System.out.println("JDBC ile Kategori Eklendi : " + category.getName());

	}

}
