package studentOrientation.driver;

import studentOrientation.builder.StudentOrientation;
import studentOrientation.builder.StudentOrientationBuilder;
import studentOrientation.enums.CafeteriaEnum;
import studentOrientation.enums.GiftEnum;
import studentOrientation.enums.LectureEnum;
import studentOrientation.enums.SchoolBuildingEnum;
import studentOrientation.enums.SchoolBuildingVisitRideModeEnum;

public class Driver {

	public static void main(String[] args) {
			
		StudentOrientation studentOrientation = new StudentOrientation(CafeteriaEnum.MARKETPLACE,GiftEnum.EVENTCENTER,LectureEnum.CS540,SchoolBuildingEnum.BUCS,
				SchoolBuildingEnum.CCPA, SchoolBuildingVisitRideModeEnum.BUSMODE, SchoolBuildingVisitRideModeEnum.ONFOOT);
		StudentOrientationBuilder studentOrientationBuilder = new StudentOrientationBuilder();
		studentOrientationBuilder.buildStudentOrientation(studentOrientation);
		studentOrientation.showActivities();
	}
}
