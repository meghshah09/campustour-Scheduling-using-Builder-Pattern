package studentOrientation.activity;

public class CafeteriaForLaunchMARKETPLACE implements CafeteriaForLaunchI {
	private double costOflaunch;
	private int durationOfLaunch;
	private double carboonFootPrint;
	private int caloriesBurnt;

	@Override
	public double getCost() {
		double surchargeCost=0;
		surchargeCost=(12*6)/100;
		setCostOflaunch(12+surchargeCost);
		return getCostOflaunch();
	}

	@Override
	public int getCalories() {

		setCaloriesBurnt(-20);
		return getCaloriesBurnt();
	}

	@Override
	public double getCO2Generated() {
		setCarboonFootPrint(6);
		return getCarboonFootPrint();
	}

	@Override
	public int getDuration() {
		setDurationOfLaunch(30);
		return getDurationOfLaunch();
	}
	public double getCostOflaunch() {
		return costOflaunch;
	}

	public void setCostOflaunch(double costOflaunch) {
		this.costOflaunch = costOflaunch;
	}

	public int getDurationOfLaunch() {
		return durationOfLaunch;
	}

	public void setDurationOfLaunch(int durationOfLaunch) {
		this.durationOfLaunch = durationOfLaunch;
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
