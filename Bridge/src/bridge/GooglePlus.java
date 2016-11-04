package bridge;

public class GooglePlus implements MessagePublisher {

	@Override
	public void publishMessage(String message) {
		System.out
				.println("'" + message + "' : This has been published to public in GooglePlus social networking site");
	}

}
