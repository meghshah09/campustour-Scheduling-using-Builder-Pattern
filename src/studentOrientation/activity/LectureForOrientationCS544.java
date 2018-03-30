package studentOrientation.activity;

public class LectureForOrientationCS544 implements LectureForOrientationI {
	private double costOfAttendingALecture;
	private int durationOfAttendingALecture;
	private double carboonFootPrint;
	private int caloriesBurnt;
	@Override
	public double getCost() {
		double surchargeCost=0;
//		surchargeCost=(12*10)/100;
		setCostOfAttendingALecture(12+surchargeCost);
		return getCostOfAttendingALecture();
	}
	@Override
	public int getCalories() {
		setCaloriesBurnt(9);
		return getCaloriesBurnt();
	}
	@Override
	public double getCO2Generated() {
		setCarboonFootPrint(4.5);
		return getCarboonFootPrint();
	}
	@Override
	public int getDuration() {
		setDurationOfAttendingALecture(90);
		return getDurationOfAttendingALecture();
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
	public double getCostOfAttendingALecture() {
		return costOfAttendingALecture;
	}
	public void setCostOfAttendingALecture(double costOfAttendingALecture) {
		this.costOfAttendingALecture = costOfAttendingALecture;
	}
	public int getDurationOfAttendingALecture() {
		return durationOfAttendingALecture;
	}
	public void setDurationOfAttendingALecture(int durationOfAttendingALecture) {
		this.durationOfAttendingALecture = durationOfAttendingALecture;
	}

}
