# csx42-assign3-megh_shashwat

Assignment 3 - Tool for Campus Tours at BU is done in Team by Megh Shah And Shashwat Maru. We have tried my best to keep the code easy to understand and flexible for future use.

--------------------------------------------------------------------------

## To clean:
ant -buildfile campusTour/build.xml clean

Description: Run the above command from parent Directory of campusTour. It cleans up all the .class files that were generated when you
compiled your code.
-----------------------------------------------------------------------
## To compile: 
ant -buildfile campusTour/build.xml all

Description: Compiles your code and generates .class files inside the BUILD folder.

-----------------------------------------------------------------------
## To run by specifying arguments from command line 
## I used this to run my code
ant -buildfile campusTour/build.xml run

Description: Will run the program with above line of code ONLY.

-----------------------------------------------------------------------

## Created tarball for submission with following command.

tar -cvf Shashwat_Maru_Megh_Shah_assign3.tar Shashwat_Maru_Megh_Shah/
gzip Shashwat_Maru_Megh_Shah_assign3.tar

-----------------------------------------------------------------------

"I have done this assignment completely on my own. I have not copied
it, nor have I given my solution to anyone else. I understand that if
I am involved in plagiarism or cheating I will have to sign an
official form that I have cheated and that this form will be stored in
my official university record. I also understand that I will receive a
grade of 0 for the involved assignment for my first offense and that I
will receive a grade of F for the course for any additional
offense.ù"

[Date: 4/10/2018]

-----------------------------------------------------------------------

Provide justification for Data Structures used in this assignment in
term of Big O complexity (time and/or space)

1) ArrayList - Used for Storing.....
Worst Case Time Complexity - O(1) for adding a element in a list. O(n) for removal of data from array list since we go through each element.
Getting an element from Array List take O(1).					
-----------------------------------------------------------------------
Assignment 3 : Tool for Campus Tours at BU

The Driver code has studentOrientation constructor which consists of 6 parameters.
The current Program runs for the following input :
Building 1 Visited: WATSON ,Building 2 Visited: CCPA, Gift Picked from WESTGYM, Lunch Done @ MARKETPLACE, Lecture attended is CS542.

It can be changed to other input for testing.
Options for Visiting Building are :
WATSON, GSE, SOM, BUCS,DSON,CCPA,HC (Ride Mode can be BUSMODE,ONFOOT)

Options for Picking the Gift are :
EVENTCENTER, UNIVERSITYUNION, WESTGYM

Options for Attending Lecture are:
CS542, CS540, CS541, CS543,CS544, CS545

Options for Lunch at Cafeteria is :
CAFETERIAINWOODS, MARKETPLACE, HINMANN, C4, MOUNTAINVIEW

You Can choose any Any Enums from the above for respective category and run the code.
-----------------------------------------------------------------------
list of citations (urls, etc.) from where you have taken code