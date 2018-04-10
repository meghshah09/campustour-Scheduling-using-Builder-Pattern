package studentOrientation.driver;

import studentOrientation.builder.StudentOrientation;
import studentOrientation.builder.StudentOrientationBuilder;
import studentOrientation.enums.CafeteriaEnum;
import studentOrientation.enums.GiftEnum;
import studentOrientation.enums.LectureEnum;
import studentOrientation.enums.SchoolBuildingEnum;
import studentOrientation.enums.SchoolBuildingVisitRideModeEnum;
import studentOrientation.util.Results;

/*
Driver Class
*/

public class Driver {

    /**
     * 
     * @param args Command line Arguments given by user.
     * Main method is public and returns void. 
     */
	public static void main(String[] args) {
			
		StudentOrientation studentOrientation = new StudentOrientation(CafeteriaEnum.MARKETPLACE,GiftEnum.WESTGYM,LectureEnum.CS541,SchoolBuildingEnum.BUCS,
				SchoolBuildingEnum.CCPA, SchoolBuildingVisitRideModeEnum.BUSMODE, SchoolBuildingVisitRideModeEnum.ONFOOT);
		StudentOrientationBuilder studentOrientationBuilder = new StudentOrientationBuilder();
		studentOrientationBuilder.buildStudentOrientation(studentOrientation);
                Results result = new Results();
		studentOrientation.showActivities(result);
	}
}
