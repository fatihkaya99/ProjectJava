package layeredApp.dataAccess;

import layeredApp.entities.Category;
import layeredApp.entities.Course;
import layeredApp.entities.Instructor;

public interface BaseDao {
	
	void addInstructorDao(Instructor instructor);

	void addCourseDao(Course course);

	void addCategoryDao(Category category);
}