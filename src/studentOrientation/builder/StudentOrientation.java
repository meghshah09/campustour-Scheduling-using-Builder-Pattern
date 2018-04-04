package studentOrientation.builder;
import java.util.ArrayList;
import java.util.List;

import studentOrientation.activity.*;
import studentOrientation.enums.CafeteriaEnum;
import studentOrientation.enums.GiftEnum;
import studentOrientation.enums.LectureEnum;
import studentOrientation.enums.SchoolBuildingEnum;
import studentOrientation.enums.SchoolBuildingVisitRideModeEnum;

/**
 * @author Megh Shah & Shashwat Maru
 *This class will hold a object of StudentOrientation of a particular
 *Student, It holds all the activity and the cost of doing it. 
 */
public class StudentOrientation implements StudentOrientationI {
	List<ActivityI> listOfActivities = new ArrayList<ActivityI>();
	private CafeteriaEnum cafeteriaToLaunch;
	private GiftEnum giftToPick;
	private LectureEnum lectureToAttend;
	private SchoolBuildingEnum buildingToVisit1;
	private SchoolBuildingEnum buildingToVisit2;
	private SchoolBuildingVisitRideModeEnum schoolBuildingVisitRideMode1;
	private SchoolBuildingVisitRideModeEnum schoolBuildingVisitRideMode2;
	CafeteriaForLaunchI cafeteria;
	LectureForOrientationI lectureForOrientation;
	PickingGiftI pickingGift;
	VisitingSchoolBuildingI visitingSchoolBuilding1;
	VisitingSchoolBuildingI visitingSchoolBuilding2;
	
	public StudentOrientation(CafeteriaEnum cafeteriaIn, GiftEnum giftIn, LectureEnum lectureForOrientationIn, SchoolBuildingEnum visitingSchoolBuilding1In,
			SchoolBuildingEnum visitingSchoolBuilding2In, SchoolBuildingVisitRideModeEnum schoolBuildingVisitRideMode1In, SchoolBuildingVisitRideModeEnum schoolBuildingVisitRideMode2In) {

		setCafeteriaToLaunch(cafeteriaIn);
		setGiftToPick(giftIn);
		setLectureToAttend(lectureForOrientationIn);
		setBuildingToVisit1(visitingSchoolBuilding1In);
		setBuildingToVisit2(visitingSchoolBuilding2In);
		setSchoolBuildingVisitRideMode1(schoolBuildingVisitRideMode1In);
		setSchoolBuildingVisitRideMode2(schoolBuildingVisitRideMode2In);
	}
	@Override
	public void addActivityToList(ActivityI activityIn) {
		listOfActivities.add(activityIn);

	}

	@Override
	public double getTotalCost() {
		double cost=0;
		for(ActivityI activity: listOfActivities) {
			cost += activity.getCost();
		}
		return cost;
	}
	@Override
	public int getTotalDuration() {
		int duration=0;
		for(ActivityI activity: listOfActivities) {
			duration += activity.getDuration();
	}

		return duration;
}
	@Override
	public double getTotalCarboonFootPrint() {
		double carboonFootPrint=0;
		for(ActivityI activity: listOfActivities) {
			carboonFootPrint += activity.getCO2Generated();
			
		}
		return carboonFootPrint;
	}
	@Override
	public int getTotalCalories() {
		int calories=0;
		for(ActivityI activity: listOfActivities) {
			calories += activity.getCalories();
		}
		return calories;
	}

	public void showActivities() {
		System.out.println("==================================================Below is the Student Orientation Plan for given preferences=====================================================");
		System.out.println();
		System.out.println("Building 1 Visited: "+getBuildingToVisit1()+ " ,Building 2 Visited: "+getBuildingToVisit2()+", Gift Picked from "+getGiftToPick()+", Launch Done @ "+getCafeteriaToLaunch()+", Lecture attended is "+getLectureToAttend()+".");
		System.out.println();
		System.out.println("=====================================================Total efforts associated while doing above activities=====================================================");
		System.out.println("   Total Duration:" +getTotalDuration() +" minutes, ");
		System.out.println("   total Cost: $" +getTotalCost() + ", ");
		System.out.println("   total Calories Burnt :" +getTotalCalories()+ " calories, ");
		System.out.println("   and total Carboon foot print :" +getTotalCarboonFootPrint() + " tonnes of CO2.");
		System.out.println("===========================================Kindly give new Input for other student orientation with his/her preferences=============================================");
	}
	public void buildVisitingSchoolBuilding() {

		switch(getBuildingToVisit1()) {
		case BUCS:
			visitingSchoolBuilding1 = new VisitingSchoolBUCS(getSchoolBuildingVisitRideMode1());
			break;
		case SOM:
			visitingSchoolBuilding1 = new VisitingSchoolSOM(getSchoolBuildingVisitRideMode1());
			break;
		case WATSON:
			visitingSchoolBuilding1 = new VisitingSchoolWATSON(getSchoolBuildingVisitRideMode1());
			break;
		case GSE:
			visitingSchoolBuilding1 = new VisitingSchoolGSE(getSchoolBuildingVisitRideMode1());
			break;
		case DSON:
			visitingSchoolBuilding1 = new VisitingSchoolDSON(getSchoolBuildingVisitRideMode1());
			break;
		case CCPA:
			visitingSchoolBuilding1 = new VisitingSchoolCCPA(getSchoolBuildingVisitRideMode1());
			break;
		case HC:
			visitingSchoolBuilding1 = new VisitingSchoolHC(getSchoolBuildingVisitRideMode1());
			break;
		default:
			break;
		}

		switch(getBuildingToVisit2()) {
		case BUCS:
			visitingSchoolBuilding2 = new VisitingSchoolBUCS(getSchoolBuildingVisitRideMode2());
			break;
		case SOM:
			visitingSchoolBuilding2 = new VisitingSchoolSOM(getSchoolBuildingVisitRideMode2());
			break;
		case WATSON:
			visitingSchoolBuilding2 = new VisitingSchoolWATSON(getSchoolBuildingVisitRideMode2());
			break;
		case GSE:
			visitingSchoolBuilding2 = new VisitingSchoolGSE(getSchoolBuildingVisitRideMode2());
			break;
		case DSON:
			visitingSchoolBuilding2 = new VisitingSchoolDSON(getSchoolBuildingVisitRideMode2());
			break;
		case CCPA:
			visitingSchoolBuilding2 = new VisitingSchoolCCPA(getSchoolBuildingVisitRideMode2());
			break;
		case HC:
			visitingSchoolBuilding2 = new VisitingSchoolHC(getSchoolBuildingVisitRideMode2());
			break;
		default:
			break;
		}
		
				
		visitingSchoolBuilding1.calculateCost();
		visitingSchoolBuilding2.calculateCost();
		visitingSchoolBuilding1.calculateCalories();
		visitingSchoolBuilding2.calculateCalories();
		visitingSchoolBuilding1.calculateCo2Generated();
		visitingSchoolBuilding2.calculateCo2Generated();
		visitingSchoolBuilding1.calculateDuration();
		visitingSchoolBuilding2.calculateDuration();
		addActivityToList(visitingSchoolBuilding1);
		addActivityToList(visitingSchoolBuilding2);
	}

	public void buildPickingGift() {
		switch(getGiftToPick()) {
		case EVENTCENTER:
			pickingGift = new PickingGiftEVENTCENTER();
			break;
		case UNIVERSITYUNION:
			pickingGift = new PickingGiftUNIVERSITYUNION();
			break;
		default:
			break;
		}
	
		pickingGift.calculateCost();
		pickingGift.calculateCalories();
		pickingGift.calculateCo2Generated();
		pickingGift.calculateDuration();
		addActivityToList(pickingGift);
	}

	public void buildAttendingLecture() {
		switch(getLectureToAttend()) {
		case CS542: 
			lectureForOrientation = new LectureForOrientationCS542();
			break;
		case CS540:
			lectureForOrientation = new LectureForOrientationCS540();
			break;
		case CS541:
			lectureForOrientation = new LectureForOrientationCS541();
			break;
		case CS543:
			lectureForOrientation = new LectureForOrientationCS543();
			break;
		case CS544:
			lectureForOrientation = new LectureForOrientationCS544();
			break;
		case CS545:
			lectureForOrientation = new LectureForOrientationCS545();
			break;
		default:
			break;
		}
		lectureForOrientation.calculateCost();
		lectureForOrientation.calculateCalories();
		lectureForOrientation.calculateCo2Generated();
		lectureForOrientation.calculateDuration();
		addActivityToList(lectureForOrientation);
	}

	public void buildLaunchAtCafeteria() {
		switch(getCafeteriaToLaunch()) {
		case CAFETERIAINWOODS: 
			cafeteria = new CafeteriaForLaunchCAFETERIAINWOODS();
			break;
		case MARKETPLACE: 
			cafeteria = new CafeteriaForLaunchMARKETPLACE();
			break;
		case HINMANN: 
			cafeteria = new CafeteriaForLaunchHINMANN();
			break;
		case C4:
			cafeteria = new CafeteriaForLaunchC4();
			break;
		case MOUNTAINVIEW:
			cafeteria = new CafeteriaForLaunchMOUNTAINVIEW();
			break;
		default:
			break;
		}
		cafeteria.calculateCost();
		cafeteria.calculateCalories();
		cafeteria.calculateCo2Generated();
		cafeteria.calculateDuration();
		addActivityToList(cafeteria);
	}

	public CafeteriaEnum getCafeteriaToLaunch() {
		return cafeteriaToLaunch;
	}

	public void setCafeteriaToLaunch(CafeteriaEnum cafeteriaToLaunch) {
		this.cafeteriaToLaunch = cafeteriaToLaunch;
	}

	public GiftEnum getGiftToPick() {
		return giftToPick;
	}

	public void setGiftToPick(GiftEnum giftToPick) {
		this.giftToPick = giftToPick;
	}

	public LectureEnum getLectureToAttend() {
		return lectureToAttend;
	}

	public void setLectureToAttend(LectureEnum lectureToAttend) {
		this.lectureToAttend = lectureToAttend;
	}

	public SchoolBuildingEnum getBuildingToVisit1() {
		return buildingToVisit1;
	}

	public void setBuildingToVisit1(SchoolBuildingEnum buildingToVisit1) {
		this.buildingToVisit1 = buildingToVisit1;
	}

	public SchoolBuildingEnum getBuildingToVisit2() {
		return buildingToVisit2;
	}

	public void setBuildingToVisit2(SchoolBuildingEnum buildingToVisit2) {
		this.buildingToVisit2 = buildingToVisit2;
	}

	public SchoolBuildingVisitRideModeEnum getSchoolBuildingVisitRideMode1() {
		return schoolBuildingVisitRideMode1;
	}
	public void setSchoolBuildingVisitRideMode1(SchoolBuildingVisitRideModeEnum schoolBuildingVisitRideMode1) {
		this.schoolBuildingVisitRideMode1 = schoolBuildingVisitRideMode1;
	}
	public SchoolBuildingVisitRideModeEnum getSchoolBuildingVisitRideMode2() {
		return schoolBuildingVisitRideMode2;
	}
	public void setSchoolBuildingVisitRideMode2(SchoolBuildingVisitRideModeEnum schoolBuildingVisitRideMode2) {
		this.schoolBuildingVisitRideMode2 = schoolBuildingVisitRideMode2;
	}	
}
