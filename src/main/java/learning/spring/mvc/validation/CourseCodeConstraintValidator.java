package learning.spring.mvc.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode, String> {

	private String coursePrefix;
	
	@Override
	public void initialize(CourseCode theCourseCode) {
		
		coursePrefix = theCourseCode.value();
		
	}

	@Override
	public boolean isValid(String arg0, ConstraintValidatorContext arg1) {
		
		boolean result = arg0.startsWith(coursePrefix);
		
		return result;
	}

}
