package studentOrientation.activity;

import studentOrientation.activityEfforts.CaloriesBurntI;
import studentOrientation.activityEfforts.CarboonFootPrintI;
import studentOrientation.activityEfforts.CostI;
import studentOrientation.activityEfforts.DurationI;
import studentOrientation.enums.SchoolBuildingVisitRideModeEnum;

public class VisitingSchoolCCPA   implements VisitingSchoolBuildingI,CostI,CaloriesBurntI, CarboonFootPrintI, DurationI {

	public VisitingSchoolCCPA(SchoolBuildingVisitRideModeEnum schoolBuildingVisitRideModeIn) {
//		setSchoolBuildingVisitRideMode(schoolBuildingVisitRideModeIn);
	schoolBuildingVisitRideModeEnum = schoolBuildingVisitRideModeIn;
	}
	private SchoolBuildingVisitRideModeEnum schoolBuildingVisitRideModeEnum;
	private double costOfRide;
	private int durationOfSchoolBuildingVisit;
	private double carboonFootPrint;
	private int caloriesBurnt;

	@Override
	public double getCost() {
		switch(schoolBuildingVisitRideModeEnum) {
		case BUSMODE:
			setCostOfRide(1.0);
			break;
		case ONFOOT:
			setCostOfRide(0.5);
			break;
		default:
			break;
		}
		return getCostOfRide();
	}
	@Override
	public int getDuration() {
		switch(getSchoolBuildingVisitRideMode()) {
		case BUSMODE:
			setDurationOfSchoolBuildingVisit(30);
			break;
		case ONFOOT:
			setDurationOfSchoolBuildingVisit(60);
			break;
		default:
			break;
		}
		return getDurationOfSchoolBuildingVisit();
	}


	@Override
	public double getCO2Generated() {
		switch(getSchoolBuildingVisitRideMode()) {
		case BUSMODE:
			setCarboonFootPrint(3.5);;
			break;
		case ONFOOT:
			setCarboonFootPrint(0.5);
			break;
		default:
			break;
		}
		return getCarboonFootPrint();
	}


	@Override
	public int getCalories() {
		switch(getSchoolBuildingVisitRideMode()) {
		case BUSMODE:
			setCaloriesBurnt(2);
			break;
		case ONFOOT:
			setCaloriesBurnt(100);
			break;
		default:
			break;
		}
		return getCaloriesBurnt();
	}


	public SchoolBuildingVisitRideModeEnum getSchoolBuildingVisitRideMode() {
		return schoolBuildingVisitRideModeEnum;
	}
	public double getCostOfRide() {
		return costOfRide;
	}

	public void setCostOfRide(double d) {
		this.costOfRide = d;
	}

	public void setSchoolBuildingVisitRideMode(SchoolBuildingVisitRideModeEnum schoolBuildingVisitRideModeEnum) {
		this.schoolBuildingVisitRideModeEnum = schoolBuildingVisitRideModeEnum;
	}


	public int getDurationOfSchoolBuildingVisit() {
		return durationOfSchoolBuildingVisit;
	}


	public void setDurationOfSchoolBuildingVisit(int durationOfSchoolBuildingVisit) {
		this.durationOfSchoolBuildingVisit = durationOfSchoolBuildingVisit;
	}
	public double getCarboonFootPrint() {
		return carboonFootPrint;
	}
	public void setCarboonFootPrint(double carboonFootPrint) {
		this.carboonFootPrint = carboonFootPrint;
	}
	public int getCaloriesBurnt() {
		return caloriesBurnt;
	}
	public void setCaloriesBurnt(int caloriesBurnt) {
		this.caloriesBurnt = caloriesBurnt;
	}


}
