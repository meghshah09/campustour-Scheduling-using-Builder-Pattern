package studentOrientation.builder;

/**
 * @author Megh Shah & Shashwat Maru
 *This class will build StudentOrientation for a particular student 
 */
public class StudentOrientationBuilder {
	/**
         * 
         * @param studentOrientationIn Student Orientation Object of type Interface.(Basically contains the Umbrella Object)
         */
	public void buildStudentOrientation(StudentOrientationI studentOrientationIn) {
		studentOrientationIn.buildVisitingSchoolBuilding();
		studentOrientationIn.buildPickingGift();
		studentOrientationIn.buildLaunchAtCafeteria();
		studentOrientationIn.buildAttendingLecture();
		
	}
	
	
}
