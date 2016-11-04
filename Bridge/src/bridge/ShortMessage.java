package bridge;

public class ShortMessage extends Message {

	private static final int MESSAGE_LENGHT = 200;

	@Override
	public void publishMessage(String message) {
		if (MESSAGE_LENGHT >= message.length()) {
			messagePublisher.publishMessage(message);
		} else {
			System.out.println("Sorry message lenght is more can't publish....");
		}

	}

}
