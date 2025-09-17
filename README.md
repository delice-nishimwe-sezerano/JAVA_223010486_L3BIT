Question one
package SUPERMARKET;

import java.util.Scanner;

public class BILLING {

	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("|Enter number of items |Customer bought: ");
		int itemsNumber = scanner.nextInt();
		String[] items = new String[itemsNumber];
		double[] prices = new double[itemsNumber];
		int[] quantity = new int[itemsNumber];
		double subTotal = 0;
		double discount = 0;

		for(int i =0;i<itemsNumber;i++){
			System.out.print("|Enter Item "+(i+1)+" Name: ");
			items[i]=scanner.next();
			System.out.print("|Enter Item "+(i+1)+" Price: ");
			prices[i]=scanner.nextDouble();
			System.out.print("|Enter Item "+(i+1)+" Quantity: ");
			quantity[i]=scanner.nextInt();

		}

		System.out.println("\nPayment receipt \nItem names \t quantity \t unit price \t  ");
		System.out.println("-------------------------------------");

		for(int i =0;i<itemsNumber;i++){
			subTotal += prices[i]*quantity[i];		
			System.out.println(items[i]+" | "+quantity[i]+" | "+prices[i]);			
		}
		if(subTotal>50000){
			discount =(50000*5)/100;
		}
		System.out.println("Grand total: "+subTotal);
		System.out.println("Discount: "+discount);
		System.out.println("Final amount payable: "+(subTotal-discount));

	}



	}


question two



import java.util.Scanner;


public class Grading {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        int totalStudents = 0;
        int passes = 0;
        int fails = 0;

        while (true) {
            System.out.print("Enter student's mark (0–100) or -1 to finish: ");
            int mark = scanner.nextInt();

            if (mark == -1) {
                break;
            }

            if (mark < 0 || mark > 100) {
                System.out.println("Invalid mark. Please enter a value between 0 and 100.");
                continue;
            }

            totalStudents++;

            // Assign grade
            String grade;
            if (mark >= 80) {
                grade = "A";
            } else if (mark >= 70) {
                grade = "B";
            } else if (mark >= 60) {
                grade = "C";
            } else if (mark >= 50) {
                grade = "D";
            } else {
                grade = "F";
            }

            // Count passes and fails
            if (mark >= 50) {
                passes++;
            } else {
                fails++;
            }

            System.out.println("Grade: " + grade);
        }

        // Summary report
        System.out.println("\nSummary Report:");
        System.out.println("Total students: " + totalStudents);
        System.out.println("Passed: " + passes);
        System.out.println("Failed: " + fails);

        if (totalStudents > 0) {
            double passRate = (double) passes / totalStudents * 100;
            System.out.println("Class Pass Rate: " + passRate + "%");
        } else {
            System.out.println("No student data entered.");
        }

    }


	}


question three


import java.util.Scanner;


public class Tracker {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        final int MAX_DAYS = 30;
	        int[] attendance = new int[MAX_DAYS];
	        int dayCount = 0;

	        System.out.print("Enter total number of students in the class: ");
	        int classSize = scanner.nextInt();

	        String moreData = "yes";
	        do {
	            if (dayCount >= MAX_DAYS) {
	                System.out.println("Maximum of 30 days reached.");
	                break;
	            }

	            System.out.print("Enter number of students present on Day " + (dayCount + 1) + ": ");
	            int present = scanner.nextInt();

	            // ✅ Basic validation
	            if (present < 0 || present > classSize) {
	                System.out.println("Invalid number. Please enter between 0 and " + classSize + ".");
	                continue;
	            }

	            attendance[dayCount] = present;
	            dayCount++;

	            System.out.print("Do you want to enter attendance for another day? (yes/no): ");
	            moreData = scanner.next();

	        } while (moreData.equalsIgnoreCase("yes"));

	        int totalAttendance = 0;
	        int lowAttendanceDays = 0;

	        System.out.println("\nAttendance Summary:");
	        System.out.println("Day\tStudents Present");

	        for (int i = 0; i < dayCount; i++) {
	            System.out.println((i + 1) + "\t" + attendance[i]);
	            totalAttendance += attendance[i];

	            if (attendance[i] < classSize / 2.0) {
	                lowAttendanceDays++;
	            }
	        }

	        if (dayCount > 0) {
	            double averageAttendance = (double) totalAttendance / dayCount;
	            double lowAttendancePercent = (double) lowAttendanceDays / dayCount * 100;

	            System.out.println("\nAverage attendance: " + averageAttendance + " students");
	            System.out.println("Days with attendance below 50%: " + lowAttendanceDays + " (" + lowAttendancePercent + "%)");
	        } else {
	            System.out.println("No attendance data recorded.");
	        }
	    }
	

	}


