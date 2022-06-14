package learning.spring.mvc;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import learning.spring.mvc.validation.CourseCode;

public class Customer {
	private String firstName;
	
	@NotNull(message = "is required")
	@Size(min = 1, message = "Heelo")
	private String lastName;
	
	@NotNull(message = "is required")
	@Min(value=0, message="must greater than or equal to zero")
	@Max(value=10, message="must less than or equal to 10")
	private Integer freePasses;
	
	@CourseCode(value="TOPS", message="Must start with TOPS")
	private String courseCode;
	
	
	
	public String getCourseCode() {
		return courseCode;
	}
	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}
	@Pattern(regexp = "^[0-9]{5}(-[0-9]{4})?$", message = "Invalid Postal Code")
	private String postalCode;
	
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	public Integer getFreePasses() {
		return freePasses;
	}
	public void setFreePasses(Integer freePasses) {
		this.freePasses = freePasses;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
}
