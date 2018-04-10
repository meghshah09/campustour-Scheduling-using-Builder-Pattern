package studentOrientation.builder;

import studentOrientation.activity.ActivityI;
import studentOrientation.util.Results;
/**
 * 
 * @author Megh Shah and Shashwat Maru
 * Student Orientation Interface which builds various events.
 */
public interface StudentOrientationI {
	public void buildVisitingSchoolBuilding();
	public void buildPickingGift();
	public void buildAttendingLecture();
	public void buildLaunchAtCafeteria();
	public void addActivityToList(ActivityI activityIn);
	public double getTotalCost();
	public int getTotalDuration();
	public double getTotalCarboonFootPrint();
	public int getTotalCalories();
	public void showActivities(Results rIn);
}
