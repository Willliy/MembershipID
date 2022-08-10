
public abstract class BaseMembership {
	private String name;
	private String type;
	
	/**
	 * A constructor to set up the member's name and member's type.
	 * @param name Member's name.
	 * @param type Member's type.
	 */
	public BaseMembership (String name, String type) {
		this.name = name;
		this.type = type;
	}
	
	/**
	 * An accessor to return the member's name.
	 * @return To return member's name.
	 */
	public String getName() {
		return this.name;
	}
	
	/**
	 * An accessor to return a string that represents the types of membership.
	 * @return To return a string represents types of membership.
	 */
	public String getType() {
		return this.type;
	}
	
	/**
	 * An abstract method that should be overridden in the subclasses.
	 * @return To return.
	 */
	public abstract boolean isVaild();
	
	
	/**
	 * Set an initial return value and override in the subclasses.
	 * @return To return.
	 */
	public boolean equipmentAllowed() {
		return false;
	}
	
	/**
	 * Set an initial return value and override in the subclasses.
	 * @return To return.
	 */
	public boolean classesAllowed() {
		return false;
	}
}

