# Java-Project-StudentGradeCalculator

The Grade Calculator is a simple Java console application that calculates the average percentage of marks for multiple subjects and assigns a grade based on predefined criteria. The user inputs the number of subjects and the marks for each subject, and the program outputs the total marks, average percentage, and grade.

**Features**
User can input marks for multiple subjects.
Automatically validates that the marks are between 0 and 100.
Calculates the average percentage of marks.
Assigns a grade based on the average percentage:
O for 90% and above
A+ for 80% to 89%
A for 70% to 79%
B+ for 60% to 69%
B for 50% to 59%
C for 40% to 49%
F for below 40%

**Code Explanation** 
calculateGrade(double averagePercentage)
This method takes the average percentage as input and returns the corresponding grade based on the predefined grade scale.
main(String[] args)
This is the entry point of the program where the user is prompted to input the number of subjects and the marks for each subject.
The marks are validated to ensure they are between 0 and 100.
The total marks are accumulated, and the average percentage is calculated.
The grade is determined using the calculateGrade method and then displayed to the various uses in the app
