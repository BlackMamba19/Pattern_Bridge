package bridge;

public class Twitter implements MessagePublisher {

	@Override
	public void publishMessage(String message) {
		System.out.println("'" + message + "' : This has been published to public in Twitter social networking site");
	}

}
