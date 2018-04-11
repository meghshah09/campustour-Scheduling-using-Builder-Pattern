package studentOrientation.builder;
import java.util.ArrayList;
import java.util.List;

import studentOrientation.activity.*;
import studentOrientation.enums.CafeteriaEnum;
import studentOrientation.enums.GiftEnum;
import studentOrientation.enums.LectureEnum;
import studentOrientation.enums.SchoolBuildingEnum;
import studentOrientation.enums.SchoolBuildingVisitRideModeEnum;
import studentOrientation.util.Results;

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
	/**
         * Parameterized Constructor.
         * @param cafeteriaIn type of cafeteria from ENUM.
         * @param giftIn type of gift from ENUM.
         * @param lectureForOrientationIn type of Lecture for orientation from ENUM.
         * @param visitingSchoolBuilding1In type of ENUM for Visiting School Building.(visit 1)
         * @param visitingSchoolBuilding2In type of ENUM for Visiting School Building. (visit 2)
         * @param schoolBuildingVisitRideMode1In type of ENUM for Ride mode take for Visiting School Building.(visit 1)
         * @param schoolBuildingVisitRideMode2In type of ENUM for Ride mode take for Visiting School Building.(visit 2)
         */
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
        
        /**
         * 
         * @param activityIn type of Interface ActivityI
         */
	@Override
	public void addActivityToList(ActivityI activityIn) {
		listOfActivities.add(activityIn);

	}

        /**
         * 
         * @return the total cost of the planned activity which is of type double. 
         */
	@Override
	public double getTotalCost() {
		double cost=0.0;
		for(ActivityI activity: listOfActivities) {
			cost += activity.getCost();
		}
                
		return cost;
	}
        
        /**
         * 
         * @return the total Duration for visiting all the activities of type int. 
         */
	@Override
	public int getTotalDuration() {
		int duration=0;
		for(ActivityI activity: listOfActivities) {
			duration += activity.getDuration();
	}

		return duration;
        }
        
        /**
         * 
         * @return the total Carbon Foot print of type double. 
         */
	@Override
	public double getTotalCarboonFootPrint() {
		double carboonFootPrint=0;
		for(ActivityI activity: listOfActivities) {
			carboonFootPrint += activity.getCO2Generated();
			
		}
		return carboonFootPrint;
	}
        
        /**
         * 
         * @return the total calories of type int. 
         */
	@Override
	public int getTotalCalories() {
		int calories=0;
		for(ActivityI activity: listOfActivities) {
			calories += activity.getCalories();
		}
		return calories;
	}

        /**
         * method use for printing to stdout.
         * @param rIn Results class object
         */
        @Override
	public void showActivities(Results rIn) {
		String str = "==================================================Below is the Student Orientation Plan for given preferences=====================================================\n";
		str = str + "\n";
		str += "Building 1 Visited: "+getBuildingToVisit1()+ " ,Building 2 Visited: "+getBuildingToVisit2()
                        +", Gift Picked from "+getGiftToPick()+", Lunch Done @ "+getCafeteriaToLaunch()+", Lecture attended is "+getLectureToAttend()+".\n";
		str += "\n";
		str += "=====================================================Total efforts associated while doing above activities=====================================================\n";
                       str += "   Total Duration:" + getTotalDuration() +" minutes, \n";
                str += "   total Cost: $" +getTotalCost() + ", \n";
		str += "   total Calories Burnt :" +getTotalCalories()+ " calories, \n";
		str += "   and total Carboon foot print :" +getTotalCarboonFootPrint() + " tonnes of CO2.\n";
		str +="===========================================Kindly give new Input for other student orientation with his/her preferences=============================================\n";
                
                rIn.stdoutDisplay(str);
        }
        
        /**
         * Plans the two visit to School Building, calculates the Cost,Duration,Carbon Foot Prints and Calories and adds to the Array list of Activity.
         */
        @Override
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

        /**
         * Builds the Packing Gift event and calculates the cost,calories, carbon footprints and duration.
         */
        @Override
	public void buildPickingGift() {
		switch(getGiftToPick()) {
		case EVENTCENTER:
			pickingGift = new PickingGiftEVENTCENTER();
			break;
		case UNIVERSITYUNION:
			pickingGift = new PickingGiftUNIVERSITYUNION();
			break;
                case WESTGYM:
			pickingGift = new PickingGiftWESTGYM();
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

        /**
         * Builds the Attending Lecture event and calculates its cost, duration and carbon foot prints
         */
        @Override
	public void buildAttendingLecture() {
		switch(getLectureToAttend()) {
		case CS542: 
			lectureForOrientation = new LectureForOrientationCS542(); //Surchage for this class
			break;
		case CS540:
			lectureForOrientation = new LectureForOrientationCS540(); //surchage for this class
			break;
		case CS541:
			lectureForOrientation = new LectureForOrientationCS541(); //surchage for this class
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

        /**
         * Builds the Lunch at cafeteria event and calculates the Calories, Duration, cost and carbon foot prints for this event.
         */
        @Override
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
		//System.out.println(cafeteria.toString());
                addActivityToList(cafeteria);
	}

        /**
         * 
         * @return the cafeteria selected by user for lunch which is of type ENUM.
         */
	public CafeteriaEnum getCafeteriaToLaunch() {
		return cafeteriaToLaunch;
	}
       
        /**
         * 
         * @param cafeteriaToLaunch contains the value of cafeteria (ENUM) selected by the USer for lunch.
         */
	public void setCafeteriaToLaunch(CafeteriaEnum cafeteriaToLaunch) {
		this.cafeteriaToLaunch = cafeteriaToLaunch;
	}

        /**
         * 
         * @return the Gift ENUM which is to be collected by the user. 
         */
	public GiftEnum getGiftToPick() {
		return giftToPick;
	}

        /**
         * 
         * @param giftToPick sets the ENUM selected which needs to be picked by the user.
         */
        
	public void setGiftToPick(GiftEnum giftToPick) {
		this.giftToPick = giftToPick;
	}

        /**
         * 
         * @return ENUM of Lecture which user will be attending.
         */
	public LectureEnum getLectureToAttend() {
		return lectureToAttend;
	}

        /**
         * 
         * @param lectureToAttend sets the Lecture to be attended by the user which is of type ENUM.
         */
	public void setLectureToAttend(LectureEnum lectureToAttend) {
		this.lectureToAttend = lectureToAttend;
	}

        /**
         * 
         * @return ENUM of building first visited.
         */
	public SchoolBuildingEnum getBuildingToVisit1() {
		return buildingToVisit1;
	}

        /**
         * 
         * @param buildingToVisit1 sets the ENUM of building to be visited.
         */
	public void setBuildingToVisit1(SchoolBuildingEnum buildingToVisit1) {
		this.buildingToVisit1 = buildingToVisit1;
	}

        /**
         * 
         * @return ENUM of Second building to be visited
         */
	public SchoolBuildingEnum getBuildingToVisit2() {
		return buildingToVisit2;
	}

        /**
         * 
         * @param buildingToVisit2 sets the Second building ENUM to be visited. 
         */
	public void setBuildingToVisit2(SchoolBuildingEnum buildingToVisit2) {
		this.buildingToVisit2 = buildingToVisit2;
	}

        /**
         * 
         * @return ENUM of the RIDE MODE of visiting the first school building. 
         */
	public SchoolBuildingVisitRideModeEnum getSchoolBuildingVisitRideMode1() {
		return schoolBuildingVisitRideMode1;
	}
        /**
         * 
         * @param schoolBuildingVisitRideMode1 ENUM of the RIDE MODE of visiting the first school building.
         */
	public void setSchoolBuildingVisitRideMode1(SchoolBuildingVisitRideModeEnum schoolBuildingVisitRideMode1) {
		this.schoolBuildingVisitRideMode1 = schoolBuildingVisitRideMode1;
	}
        /**
         * 
         * @return ENUM of the RIDE MODE of visiting the second school building.
         */
	public SchoolBuildingVisitRideModeEnum getSchoolBuildingVisitRideMode2() {
		return schoolBuildingVisitRideMode2;
	}
        /**
         * 
         * @param schoolBuildingVisitRideMode2 ENUM of the RIDE MODE of visiting the second school building.
         */
	public void setSchoolBuildingVisitRideMode2(SchoolBuildingVisitRideModeEnum schoolBuildingVisitRideMode2) {
		this.schoolBuildingVisitRideMode2 = schoolBuildingVisitRideMode2;
	}
        
        
        @Override
        public String toString(){
            String str = "List of Activities selected are : "+ this.listOfActivities;
            return str;
        }
}
