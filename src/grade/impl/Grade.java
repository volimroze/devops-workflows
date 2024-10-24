package grade.impl;

import java.util.function.BooleanSupplier;

public class Grade {
	
	private boolean approved;
	private int points;
	private boolean cumLaude;
	
	
	public Grade(int points) {
		super();
		this.approved = points >= 18;
		this.points = points;
		this.cumLaude = points > 30;
	}

	public boolean isApproved() {
		return approved;
	}

	public int getPoints() throws Exception{
		if (points > 30)
			return 30;
		
		if (!this.approved)
			throw new Exception("If not approved, no grade");
		
		return points;
	}

	public boolean isCumLaude() {
		return cumLaude;
	}

}
