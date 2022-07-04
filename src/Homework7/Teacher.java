package Homework7;

public class Teacher {
	
	int experienceYears;
	String course;
	String schedule;
	
	public int getExperienceYears() {
		return experienceYears;
	}
	public void setExperienceYears(int experienceYears) {
		this.experienceYears = experienceYears;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getSchedule() {
		return schedule;
	}
	public void setSchedule(String schedule) {
		this.schedule = schedule;
	}
	
	public void verifyTeacher() {
		if ((experienceYears >= 3) && (course.equals("Java")) && (schedule.equals("Afternoon"))) {
			System.out.println("You qualify to teach at this school!");
		} else {
			System.out.println("You do not qualify!");
		}
	}
	
	
	

}
