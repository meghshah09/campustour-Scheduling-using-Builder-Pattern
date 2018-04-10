package studentOrientation.activity;

public class PickingGiftEVENTCENTER implements PickingGiftI {
	private double costOfGift;
	private int durationOfPickingAGift;
	private double carboonFootPrint;
	private int caloriesBurnt;

	@Override
	public void calculateCost() {
		setCostOfGift(18.8);
		
	}

	@Override
	public void calculateCalories() {
		setCaloriesBurnt(45);
		
	}

	@Override
	public void calculateCo2Generated() {
		setCarboonFootPrint(3.2);
		
	}

	@Override
	public void calculateDuration() {
		setDurationOfPickingAGift(50);
		
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
        
        
        @Override
        public String toString(){
            String str = "Cost : $" +getCost()+" Co2 : "+ getCO2Generated() +" Calories : "+getCalories()+" Duration(minutes) : "+getDuration();
            return str;
        }

}
