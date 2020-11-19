package com.main;

import java.util.Scanner;

import com.pojo.MembershipCard;
import com.pojo.PayBackCard;
/**
 * 
 * @author MokaSaiSuryaPrakash
 * 
 * This program is a real world example related to banking sector using the concept of abstract classes.
 *
 */
public class CardMain {

	public static void main(String[] args) {

		String cardDetails;
		String cardDetailsArr[];

		int choice;
		int pointsEarned;
		double totalAmount;
		int rating;

		Scanner scanner = new Scanner(System.in);
		PayBackCard payBackCard = null;
		MembershipCard membershipCard = null;

		System.out.println(
				"\nSelect Card: \nPress 1 for Payback Card \nPress 2 for Membership Card \nEnter your choice:");
		choice = scanner.nextInt();
		scanner.nextLine();

		System.out.println("Enter the Card details");
		cardDetails = scanner.nextLine();

		cardDetailsArr = cardDetails.split("\\|");

		switch (choice) {
		case 1:
			System.out.println("Enter the Points Earned:");
			pointsEarned = scanner.nextInt();

			System.out.println("Enter the Total Amount:");
			totalAmount = scanner.nextDouble();

			payBackCard = new PayBackCard(cardDetailsArr[0], cardDetailsArr[1], cardDetailsArr[2], pointsEarned,
					totalAmount);

			System.out.println(payBackCard.getHolderName() + "'s Payback card details");
			System.out.println("Card Number:" + payBackCard.getCardNumber());
			System.out.println("Point Earned:" + payBackCard.getPointsEarned());
			System.out.println("Total Amount:" + payBackCard.getTotalAmount());

			payBackCard = null;
			break;

		case 2:
			System.out.println("Enter the rating");
			rating = scanner.nextInt();

			membershipCard = new MembershipCard(cardDetailsArr[0], cardDetailsArr[1], cardDetailsArr[2], rating);

			System.out.println(membershipCard.getHolderName() + "'s Membership card details");
			System.out.println("Card Number:" + membershipCard.getCardNumber());
			System.out.println("Rating:" + membershipCard.getRating());
			System.out.println("Expiry Date:" + membershipCard.getExpiryDate());

			membershipCard = null;
			break;

		default:
			System.out.println("Invalid Input");
		}

		cardDetailsArr = null;
		scanner.close();
	}
}
