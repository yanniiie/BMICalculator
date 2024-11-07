# BMICalculator

This is a BMI Calculator application developed using Java and JavaFX. It allows users to calculate their Body Mass Index (BMI) based on their weight and height. The application supports both Metric (kg/m) and English (lb/in) units and provides feedback on the user’s BMI status according to the Department of Health and Human Services / National Institutes of Health guidelines.

###Features
BMI Calculation: Calculates BMI using either Metric (kg, m) or English (lb, in) units.
BMI Status: Displays BMI status based on calculated value:
Underweight: BMI < 18.5
Normal: 18.5 ≤ BMI ≤ 24.9
Overweight: 25 ≤ BMI ≤ 29.9
Obese: BMI ≥ 30
Clear Fields: Resets the input fields and clears the BMI result.
Exit: Closes the application.
Unit Selection: Option to choose between Metric or English units.

###Prerequisites
To run this project, you will need:

Java 8 or later (JavaFX is included with Java 8, or can be downloaded separately for later versions).
Scene Builder (optional, for modifying the user interface).
##Installation
###1. Clone the Repository
Clone the repository to your local machine using the following command:

bash
Копировать код
git clone https://github.com/your-username/BMI-Calculator.git

###2. Set Up the Project
Open your favorite IDE (e.g., IntelliJ IDEA or Eclipse).
Import the project into your IDE.
If you’re using Java 11 or later, make sure JavaFX is configured separately as it is no longer bundled with Java after version 8.

###4. Run the Application
Open the BMICalculatorApp.java file in your IDE.
Run the application by selecting the file and running it.

###5. Usage
Enter Weight: Enter your weight in the input field (either in kilograms or pounds, based on the selected units).
Enter Height: Enter your height in the input field (either in meters or inches, based on the selected units).
Select Units: Choose between Metric (kg/m) or English (lb/in) using the radio buttons.
Calculate BMI: Click the "Calculate BMI" button to calculate and display your BMI and BMI status.
Clear Fields: Use the "Clear" button to reset all input fields.
Exit Application: Click the "Exit" button to close the application.

###Code Structure
BMICalculatorApp.java: The entry point of the application. It loads the main user interface and launches the JavaFX application window.
SampleController.java: Contains the logic to handle user actions such as calculating the BMI, clearing input fields, and closing the application.
sample.fxml: The FXML layout file that defines the structure of the user interface, created using Scene Builder.
Screenshots
Here is a screenshot of the BMI Calculator application:


License
This project is licensed under the MIT License. See the LICENSE file for details.


