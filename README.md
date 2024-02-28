# Airline-Rewards-Program
The Airline Rewards Program is a Java-based software application designed to determine the tier/class of passengers based on their travel history with the airline. The program calculates tiers based on the number of flight cancellations and associated complaints made by passengers over the entire year.

# Tiers and Rewards:
Base Tier: For passengers with 0-25 flight cancellations.
Gold Tier: For passengers with 25-49 cancellations, receiving 1000 points for each cancellation.
Platinum Tier: For passengers with 50-100 cancellations, receiving 1000 points for each cancellation.
Platinum Pro Tier: For passengers with 50-99 cancellations without any complaints, receiving 2000 bonus points for each cancellation.
Executive Platinum Tier: For passengers with more than 100 cancellations, receiving 1000 points.
Super Executive Platinum Tier: For passengers with more than 100 cancellations without any complaints, receiving 3000 points for each cancellation.

# Program Execution:
Input Data: Ensure that the flight data is provided in a structured format in a file named flightdata.txt.
Program Execution: Run the main Java file (main.java) to initiate the program.
Passenger Identification: Input the passenger ID to find their tier.
Tier Determination: The program reads the data from flightdata.txt, calculates the tier based on flight cancellations and complaints, and returns the tier for the specified passenger ID.
Output: The program displays the tier of the passenger or prompts to enter the ID again if not found.
Usage:
Ensure Java is installed on your system.
Compile and run the main.java file using a Java compiler or IDE.
Follow the on-screen instructions to input the passenger ID and view their tier.

# Technologies Used:
Programming Language: Java
File Handling: Read data from flightdata.txt using file I/O.
Data Structures: Utilizes ArrayList for efficient storage and retrieval of passenger data.
Credits:
This project is created by Aarya Desai.
