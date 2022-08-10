
public class StandardMembership extends BaseMembership{
	private int visits;
	
	/**
	 * The parameter visits is supposed to be positive. If not, initialize the number of visits to 0.
	 * @param name Member's Name.
	 * @param visits Checking member's visits.
	 */
	public StandardMembership(String name, int visits) {
		super(name, "Standard Membership");
		if (visits > 0) {
			this.visits = visits;
		}
		else {
			this.visits = 0;
		}
	}
	
	/**
	 * An accessor to return the number of remaining visits.
	 * @return To return the number of remaining visits.
	 */
	public int getRemainingVisits() {
		return this.visits;
	}
	
	/**
	 * A method to decide if one's membership is still valid.
	 * @return Return true if the number of remaining visits is great than 0. Otherwise, false.
	 */
	public boolean isValid() {
		return this.visits > 0;
	}
	
	/**
	 * A method to add additional visits to the remainingVisits.
	 * @param additionalVisits Additional visits.
	 * @return Return true if the top up succeeds. Otherwise, false.
	 */
	public boolean topUp (int additionalVisits) {
		if (additionalVisits > 0) {
			this.visits += additionalVisits;
			return true;
		}
		else {
			return false;
		}
	}
	
	/**
	 * A method that deducts 1 from the number of remaining visits when the membership is valid.
	 * @return Return true if the charge succeeds. Otherwise, false.
	 */
	public boolean charge() {
		if (this.isValid()) {
			this.visits -=1;
			return true;
		}
		else {
			return false;
		}
	}
	
	/**
	 * Standard membership not allowed to access equipments.
	 */
	public boolean equipmentAllowed() {
		return false;
	}
	
	/**
	 * A method that indicates weather the fitness classes at the gym are available to this kind of membership.
	 */
	public boolean classesAllowed() {
		return true;
	}

	@Override
	public boolean isVaild() {
		// TODO Auto-generated method stub
		return false;
	}
}
