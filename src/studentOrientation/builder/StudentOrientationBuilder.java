package studentOrientation.builder;

/**
 * @author Shashwat Maru
 *This class will build StudentOrientation for a particular student 
 */
public class StudentOrientationBuilder {
	
	public void planOrientation(StudentOrientationI studentOrientationIn) {
		studentOrientationIn.buildVisitingSchoolBuilding();
		studentOrientationIn.buildPickingGift();
		studentOrientationIn.buildLaunchAtCafeteria();
		studentOrientationIn.buildAttendingLecture();
		
	}
	
	
}
