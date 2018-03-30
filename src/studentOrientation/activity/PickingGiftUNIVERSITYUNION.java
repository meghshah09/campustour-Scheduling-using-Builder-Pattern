package studentOrientation.activity;

public class PickingGiftUNIVERSITYUNION implements PickingGiftI {
	private double costOfGift;
	private int durationOfPickingAGift;
	private double carboonFootPrint;
	private int caloriesBurnt;

	@Override
	public double getCost() {
		setCostOfGift(10.5);
		return getCostOfGift();
	}

	@Override
	public int getCalories() {
		setCaloriesBurnt(60);
		return getCaloriesBurnt();
	}

	@Override
	public double getCO2Generated() {
		setCarboonFootPrint(1.5);
		return getCarboonFootPrint();
	}

	@Override
	public int getDuration() {
		setDurationOfPickingAGift(70);
		return getDurationOfPickingAGift();
	}
	public double getCostOfGift() {
		return costOfGift;
	}

	public void setCostOfGift(double costOfGift) {
		this.costOfGift = costOfGift;
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

	public int getDurationOfPickingAGift() {
		return durationOfPickingAGift;
	}

	public void setDurationOfPickingAGift(int durationOfPickingAGift) {
		this.durationOfPickingAGift = durationOfPickingAGift;
	}


}
