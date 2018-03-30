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
	List<Double> listOfActivitiesCost = new ArrayList<Double>();
	List<Integer> listOfActivitiesCaloriesBurnt = new ArrayList<Integer>();
	List<Double> listOfActivitiesCarboonFootPrint = new ArrayList<Double>();
	List<Integer> listOfActivitiesDuration = new ArrayList<Integer>();
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
	public void addActivityCostToList(double d) {
		listOfActivitiesCost.add(d);
	}
	@Override
	public void addActivityCarboonFootPrintToList(double activityIn) {
		listOfActivitiesCarboonFootPrint.add(activityIn);
		
	}
	@Override
	public void addActivityDurationToList(int activityIn) {
		listOfActivitiesDuration.add(activityIn);
		
	}
	@Override
	public void addActivityCaloriesBurntToList(int activityIn) {
		listOfActivitiesCaloriesBurnt.add(activityIn);
	}

	@Override
	public double getCost() {
		double cost=0;
		for(int index=0; index<listOfActivitiesCost.size();index++ ) {
			cost += listOfActivitiesCost.get(index);
		}
		return cost;
	}
	@Override
	public int getDuration() {
		int duration=0;
		for(int index=0; index<listOfActivitiesDuration.size();index++ ) {
			duration += listOfActivitiesDuration.get(index);
		}
		return duration;
}
	@Override
	public double getCarboonFootPrint() {
		double carboonFootPrint=0;
		for(int index=0; index<listOfActivitiesCarboonFootPrint.size();index++ ) {
			carboonFootPrint += listOfActivitiesCarboonFootPrint.get(index);
		}
		return carboonFootPrint;
	}
	@Override
	public int getCalories() {
		int calories=0;
		for(int index=0; index<listOfActivitiesCaloriesBurnt.size();index++ ) {
			calories += listOfActivitiesCaloriesBurnt.get(index);
		}
		return calories;
	}

	public void showActivities() {
		System.out.println("==================================================Below is the Student Orientation Plan for given preferences=====================================================");
		System.out.println();
		System.out.println("Building 1 Visited: "+getBuildingToVisit1()+ " ,Building 2 Visited: "+getBuildingToVisit2()+", Gift Picked from "+getGiftToPick()+", Launch Done @ "+getCafeteriaToLaunch()+", Lecture attended is "+getLectureToAttend()+".");
		System.out.println();
		System.out.println("=====================================================Total efforts associated while doing above activities=====================================================");
		System.out.println("   Total Duration:" +getDuration() +" minutes, ");
		System.out.println("   total Cost: $" +getCost() + ", ");
		System.out.println("   total Calories Burnt :" +getCalories()+ " calories, ");
		System.out.println("   and total Carboon foot print :" +getCarboonFootPrint() + " tonnes of CO2.");
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
		
		addActivityCostToList(visitingSchoolBuilding1.getCost());
		addActivityCostToList(visitingSchoolBuilding2.getCost());
		addActivityCaloriesBurntToList(visitingSchoolBuilding1.getCalories());
		addActivityCaloriesBurntToList(visitingSchoolBuilding2.getCalories());
		addActivityCarboonFootPrintToList(visitingSchoolBuilding1.getCO2Generated());
		addActivityCarboonFootPrintToList(visitingSchoolBuilding2.getCO2Generated());
		addActivityDurationToList(visitingSchoolBuilding1.getDuration());
		addActivityDurationToList(visitingSchoolBuilding2.getDuration());
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
	
		addActivityCostToList(pickingGift.getCost());
		addActivityCaloriesBurntToList(pickingGift.getCalories());
		addActivityCarboonFootPrintToList(pickingGift.getCO2Generated());
		addActivityDurationToList(pickingGift.getDuration());
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
		addActivityCostToList(lectureForOrientation.getCost());
		addActivityCaloriesBurntToList(lectureForOrientation.getCalories());
		addActivityCarboonFootPrintToList(lectureForOrientation.getCO2Generated());
		addActivityDurationToList(lectureForOrientation.getDuration());
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
		addActivityCostToList(cafeteria.getCost());
		addActivityCaloriesBurntToList(cafeteria.getCalories());
		addActivityCarboonFootPrintToList(cafeteria.getCO2Generated());
		addActivityDurationToList(cafeteria.getDuration());
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
