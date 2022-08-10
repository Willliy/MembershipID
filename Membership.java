
public class Membership {
	private String name;
	private int visits;
	
	/**
	 * A constructor to set up the member'sname and the initial number of visits allowed.
	 * @param name The member's name.
	 * @param visits The number of visits allowed.
	 */
	public Membership(String name, int visits) {
		this.name = name;
		if (visits > 0) {
			this.visits = visits;
		}
		else {
			this.visits = 0;
		}
	}
	
	/**
	 * An accessor to return the member's name.
	 * @return To return Member's name.
	 */
	public String getName(){
		return this.name;
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
	 * @return Return true if the number of remaining visits is greater than 0. Otherwise, false.
	 */
	public boolean isValid() {
		return this.visits > 0;
	}
	
	/**
	 * A method to add additional visits (represented by additionalVisits) to the remainingVisits.
	 * @param additionalVisits Additional visits.
	 * @return Return true if top up succeeds. Otherwise, false.
	 */
	public boolean topUp(int additionalVisits) {
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
	 * @return Return true if thr charge succeeds. Otherwise, false.
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
	 * A method that indicates whether the equipment at the gym is available to this kind of membership.
	 * @return Return true if is available. Otherwise, false.
	 */
	public boolean equipmentAllowed() {
		return true;
	}
	
	/**
	 * A method that indicates whether the fitness classes at the gym are available to this kind of membership.
	 * @return Return true if is available. Otherwise, false.
	 */
	public boolean classAllowed() {
		return true;
	}
}
