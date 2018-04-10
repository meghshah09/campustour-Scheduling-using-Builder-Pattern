package studentOrientation.activity;

public class CafeteriaForLaunchMARKETPLACE implements CafeteriaForLaunchI {
	private double costOflaunch;
	private int durationOfLaunch;
	private double carboonFootPrint;
	private int caloriesBurnt;

        public CafeteriaForLaunchMARKETPLACE() {
        
        }
        
	@Override
	public void calculateCost() {
		double surchargeCost=0;
		surchargeCost=20*0.06;
		setCostOflaunch(20+surchargeCost);
		
	}

	@Override
	public void calculateCalories() {
		setCaloriesBurnt(-200);
		
	}

	@Override
	public void calculateCo2Generated() {
		setCarboonFootPrint(6);
		
	}

	@Override
	public void calculateDuration() {
		setDurationOfLaunch(30);
		
	}

	@Override
	public double getCost() {
		return getCostOflaunch();
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

        @Override
        public String toString(){
            String str = "Cost : $" +getCost()+" Co2 : "+ getCO2Generated() +" Calories : "+getCalories()+" Duration(minutes) : "+getDuration();
            return str;
        }

}
