package bridge;

import java.util.Scanner;

public class Client {

	public static void main(String[] args) {

		System.out.println(
				"Please enter the social networking site you want to use to publish the messege: 'Twitter' or 'Facebook' or 'GooglePlus'");
		Scanner scanner = new Scanner(System.in);
		String socialNetworkingSite = scanner.next();

		System.out.println("Please enter the message you want to publish");
		Scanner scanner1 = new Scanner(System.in);
		String message = scanner1.nextLine();

		if ("Twitter".compareTo(socialNetworkingSite) == 0) {
			Message shortMessage = new ShortMessage();
			shortMessage.setMessagePublisher(new Twitter());
			shortMessage.publishMessage(message);
		} else if ("GooglePlus".compareTo(socialNetworkingSite) == 0) {
			Message longMessage = new LongMessage();
			longMessage.setMessagePublisher(new GooglePlus());
			longMessage.publishMessage(message);
		} else if ("Facebook".compareTo(socialNetworkingSite) == 0) {
			Message longMessage = new LongMessage();
			longMessage.setMessagePublisher(new Facebook());
			longMessage.publishMessage(message);
		}
	}

}
