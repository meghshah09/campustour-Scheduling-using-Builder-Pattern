package studentOrientation.activity;

import studentOrientation.enums.SchoolBuildingVisitRideModeEnum;

public class VisitingSchoolCCPA   implements VisitingSchoolBuildingI{

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
	public void calculateDuration() {
		switch(getSchoolBuildingVisitRideMode()) {
		case BUSMODE:
			setDurationOfSchoolBuildingVisit(20);
			break;
		case ONFOOT:
			setDurationOfSchoolBuildingVisit(64);
			break;
		default:
			break;
		}
		
	}
	@Override
	public void calculateCo2Generated() {
		switch(getSchoolBuildingVisitRideMode()) {
		case BUSMODE:
			setCarboonFootPrint(4.5);;
			break;
		case ONFOOT:
			setCarboonFootPrint(0.9);
			break;
		default:
			break;
		}
		
	}
	@Override
	public void calculateCalories() {
		switch(getSchoolBuildingVisitRideMode()) {
		case BUSMODE:
			setCaloriesBurnt(10);
			break;
		case ONFOOT:
			setCaloriesBurnt(90);
			break;
		default:
			break;
		}
	
	}
	@Override
	public void calculateCost() {
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
		
	}


	
	@Override
	public double getCost() {
		return getCostOfRide();
	}
	@Override
	public int getDuration() {
		return getDurationOfSchoolBuildingVisit();
	}


	@Override
	public double getCO2Generated() {
		return getCarboonFootPrint();
	}


	@Override
	public int getCalories() {
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
        
        @Override
        public String toString(){
            String str = "Cost : $" +getCost()+" Co2 : "+ getCO2Generated() +" Calories : "+getCalories()+" Duration(minutes) : "+getDuration();
            return str;
        }

}
