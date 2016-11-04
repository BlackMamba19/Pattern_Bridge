package bridge;

public class Facebook implements MessagePublisher {

	@Override
	public void publishMessage(String message) {
		System.out.println("'" + message + "' : This has been published to public in Facebook social networking site");
	}

}
