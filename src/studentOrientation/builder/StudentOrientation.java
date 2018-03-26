package studentOrientation.builder;
import java.util.ArrayList;
import java.util.List;
import studentOrientation.activity.*;
import studentOrientation.enums.*;

/**
 * @author Shashwat Maru
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
	CafeteriaForLaunchI cafeteria;
	LectureForOrientationI lectureForOrientation;
	PickingGiftI pickingGift;
	VisitingSchoolBuildingI visitingSchoolBuilding1;
	VisitingSchoolBuildingI visitingSchoolBuilding2;


	public StudentOrientation(CafeteriaEnum cafeteriaIn, GiftEnum giftIn, LectureEnum lectureForOrientationIn, SchoolBuildingEnum visitingSchoolBuilding1In,
			SchoolBuildingEnum visitingSchoolBuilding2In) {

		setCafeteriaToLaunch(cafeteriaIn);
		setGiftToPick(giftIn);
		setLectureToAttend(lectureForOrientationIn);
		setBuildingToVisit1(visitingSchoolBuilding1In);
		setBuildingToVisit2(visitingSchoolBuilding2In);
	}

	public void addActivityToList(ActivityI activityIn) {
		listOfActivities.add(activityIn);

	}

	public void buildVisitingSchoolBuilding() {

		switch(getBuildingToVisit1()) {
		case BUCS:
			visitingSchoolBuilding1 = new VisitingSchoolBUCS();
			break;
		case SOM:
			visitingSchoolBuilding1 = new VisitingSchoolSOM();
			break;
		case WATSON:
			visitingSchoolBuilding1 = new VisitingSchoolWATSON();
			break;
		case GSE:
			visitingSchoolBuilding1 = new VisitingSchoolGSE();
			break;
		case DSON:
			visitingSchoolBuilding1 = new VisitingSchoolDSON();
			break;
		case CCPA:
			visitingSchoolBuilding1 = new VisitingSchoolCCPA();
			break;
		case HC:
			visitingSchoolBuilding1 = new VisitingSchoolHC();
			break;
		default:
			break;
		}

		switch(getBuildingToVisit2()) {
		case BUCS:
			visitingSchoolBuilding2 = new VisitingSchoolBUCS();
			break;
		case SOM:
			visitingSchoolBuilding2 = new VisitingSchoolSOM();
			break;
		case WATSON:
			visitingSchoolBuilding2 = new VisitingSchoolWATSON();
			break;
		case GSE:
			visitingSchoolBuilding2 = new VisitingSchoolGSE();
			break;
		case DSON:
			visitingSchoolBuilding2 = new VisitingSchoolDSON();
			break;
		case CCPA:
			visitingSchoolBuilding2 = new VisitingSchoolCCPA();
			break;
		case HC:
			visitingSchoolBuilding2 = new VisitingSchoolHC();
			break;
		default:
			break;
		}

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


}
