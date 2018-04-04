package studentOrientation.builder;

/**
 * @author Megh Shah & Shashwat Maru
 *This class will build StudentOrientation for a particular student 
 */
public class StudentOrientationBuilder {
	
	public void buildStudentOrientation(StudentOrientationI studentOrientationIn) {
		studentOrientationIn.buildVisitingSchoolBuilding();
		studentOrientationIn.buildPickingGift();
		studentOrientationIn.buildLaunchAtCafeteria();
		studentOrientationIn.buildAttendingLecture();
		
	}
	
	
}
