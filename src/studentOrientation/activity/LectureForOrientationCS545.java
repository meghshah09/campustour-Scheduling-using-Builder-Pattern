package studentOrientation.activity;

public class LectureForOrientationCS545 implements LectureForOrientationI {
	private double costOfAttendingALecture;
	private int durationOfAttendingALecture;
	private double carboonFootPrint;
	private int caloriesBurnt;
	@Override
	public void calculateCost() {
		double surchargeCost=0;
		setCostOfAttendingALecture(6+surchargeCost);
		
	}
	@Override
	public void calculateCalories() {
		setCaloriesBurnt(6);
	}
	@Override
	public void calculateCo2Generated() {
		setCarboonFootPrint(3);
			
	}
	@Override
	public void calculateDuration() {
		setDurationOfAttendingALecture(45);
		
	}

	@Override
	public double getCost() {
		return getCostOfAttendingALecture();
	}
	@Override
	public int getCalories() {
		return getCaloriesBurnt();
	}
	@Override
	public double getCO2Generated() {
		return getCarboonFootPrint();
	}
	@Override
	public int getDuration() {
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
