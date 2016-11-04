package bridge;

public abstract class Message {

	protected MessagePublisher messagePublisher;

	public MessagePublisher getMessagePublisher() {
		return messagePublisher;
	}

	public void setMessagePublisher(MessagePublisher messagePublisher) {
		this.messagePublisher = messagePublisher;
	}

	public abstract void publishMessage(String message);

}
