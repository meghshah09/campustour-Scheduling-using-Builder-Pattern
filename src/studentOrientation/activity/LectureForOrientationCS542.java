package studentOrientation.activity;

public class LectureForOrientationCS542 implements LectureForOrientationI {
	private double costOfAttendingALecture;
	private int durationOfAttendingALecture;
	private double carboonFootPrint;
	private int caloriesBurnt;
	@Override
	public double getCost() {
		double surchargeCost=0;
		surchargeCost=(18*10)/100;
		setCostOfAttendingALecture(18+surchargeCost);
		return getCostOfAttendingALecture();
	}
	@Override
	public int getCalories() {
		setCaloriesBurnt(5);
		return getCaloriesBurnt();
	}
	@Override
	public double getCO2Generated() {
		setCarboonFootPrint(9);
		return getCarboonFootPrint();
	}
	@Override
	public int getDuration() {
		setDurationOfAttendingALecture(120);
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
