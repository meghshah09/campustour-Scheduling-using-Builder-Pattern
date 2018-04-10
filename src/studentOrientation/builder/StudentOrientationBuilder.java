package studentOrientation.builder;

/**
 * @author Megh Shah & Shashwat Maru
 *This class will build StudentOrientation for a particular student 
 */
public class StudentOrientationBuilder {
	/**
         * 
         * @param studentOrientationIn Student Orientation Object of type Interface.(Basically builds the Umbrella Object)
         */
	public void buildStudentOrientation(StudentOrientationI studentOrientationIn) {
		studentOrientationIn.buildVisitingSchoolBuilding(); //event 1
		studentOrientationIn.buildPickingGift(); //event 2
		studentOrientationIn.buildLaunchAtCafeteria(); //event 3
		studentOrientationIn.buildAttendingLecture(); // event 4
		
	}
	
	
}
