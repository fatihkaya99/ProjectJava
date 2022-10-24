package layeredApp.dataAccess;

import layeredApp.entities.Category;
import layeredApp.entities.Course;
import layeredApp.entities.Instructor;

public class HibernateDao implements BaseDao {

	@Override
	public void addInstructorDao(Instructor instructor) {

		System.out.println("Hibernate ile Eğitmen Eklendi : " + instructor.getName());

	}

	@Override
	public void addCourseDao(Course course) {

		System.out.println("Hibernate ile Kurs Eklendi" + course.getName());
	}

	@Override
	public void addCategoryDao(Category category) {
		System.out.println("Hibernate ile Kategori Eklendi : " + category.getName());

	}

}