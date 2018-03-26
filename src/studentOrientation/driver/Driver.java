package studentOrientation.driver;

import studentOrientation.builder.StudentOrientation;
import studentOrientation.builder.StudentOrientationBuilder;
import studentOrientation.enums.CafeteriaEnum;
import studentOrientation.enums.GiftEnum;
import studentOrientation.enums.LectureEnum;
import studentOrientation.enums.SchoolBuildingEnum;

public class Driver {

	public static void main(String[] args) {
			
		StudentOrientation studentOrientation = new StudentOrientation(CafeteriaEnum.C4,GiftEnum.EVENTCENTER,LectureEnum.CS540,SchoolBuildingEnum.BUCS,SchoolBuildingEnum.CCPA);
		StudentOrientationBuilder studentOrientationBuilder = new StudentOrientationBuilder();
		studentOrientationBuilder.planOrientation(studentOrientation);
		
	}
}
