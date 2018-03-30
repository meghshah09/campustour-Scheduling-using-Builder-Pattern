package studentOrientation.activity;

public class PickingGiftEVENTCENTER implements PickingGiftI {
	private double costOfGift;
	private int durationOfPickingAGift;
	private double carboonFootPrint;
	private int caloriesBurnt;

		@Override
	public double getCost() {
			setCostOfGift(18.8);
			return getCostOfGift();
	}

	@Override
	public int getCalories() {
		setCaloriesBurnt(45);
		return getCaloriesBurnt();
	}

	@Override
	public double getCO2Generated() {
		setCarboonFootPrint(3.2);
		return getCarboonFootPrint();
	}

	@Override
	public int getDuration() {
		setDurationOfPickingAGift(50);
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
