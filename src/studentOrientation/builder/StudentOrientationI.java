package studentOrientation.builder;

import studentOrientation.activity.ActivityI;

public interface StudentOrientationI {
	public void buildVisitingSchoolBuilding();
	public void buildPickingGift();
	public void buildAttendingLecture();
	public void buildLaunchAtCafeteria();
	public void addActivityToList(ActivityI activityIn);
	public void addActivityCostToList(double dIn);
	public void addActivityCarboonFootPrintToList(double dIn);
	public void addActivityDurationToList(int iIn);
	public void addActivityCaloriesBurntToList(int iIn);
	public double getCost();
	public int getDuration();
	public double getCarboonFootPrint();
	public int getCalories();
	public void showActivities();
}
