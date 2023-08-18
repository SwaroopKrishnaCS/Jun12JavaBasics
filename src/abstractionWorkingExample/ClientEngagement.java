package abstractionWorkingExample;

public class ClientEngagement {

	private String client;
	private int hoursWorked;
	private double anticipatedRevnue;

	public ClientEngagement(String client, int hoursWorked, double anticipatedRevnue) {
		this.client = client;
		this.hoursWorked = hoursWorked;
		this.anticipatedRevnue = anticipatedRevnue;
	}

	public String getClient() {
		return client;
	}

	public int getHoursWorked() {
		return hoursWorked;
	}

	public double getAnticipatedRevnue() {
		return anticipatedRevnue;
	}

	public String toString() {
		return "Client " + client + " has worked for " + hoursWorked + " hours and anticipated revnue is "
				+ anticipatedRevnue;
	}
}
