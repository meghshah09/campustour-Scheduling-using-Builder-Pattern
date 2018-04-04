package studentOrientation.activity;

public class PickingGiftUNIVERSITYUNION implements PickingGiftI {
	private double costOfGift;
	private int durationOfPickingAGift;
	private double carboonFootPrint;
	private int caloriesBurnt;
	@Override
	public void calculateCost() {
		setCostOfGift(10.5);
		
	}

	@Override
	public void calculateCalories() {
		setCaloriesBurnt(60);
		
	}

	@Override
	public void calculateCo2Generated() {
		setCarboonFootPrint(1.5);	
	}

	@Override
	public void calculateDuration() {

		setDurationOfPickingAGift(70);
		
	}

	@Override
	public double getCost() {
		return getCostOfGift();
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
