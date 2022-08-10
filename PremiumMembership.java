import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class PremiumMembership extends BaseMembership{
	private Date startDate;
	private static long MILLIS_YEAR = 360*24*60*60*1000L;

	/**
	 * A constructor to set up the member's name and start date.
	 * @param name Member's name.
	 * @param startDateString Member's date.
	 */
	public PremiumMembership(String name, String startDateString) {
		super(name, "Premium Membership");
		DateFormat f = new SimpleDateFormat("yyyy-MM-dd");
		this.startDate = null;
		try {
			this.startDate = f.parse(startDateString);
		}catch (ParseException e) {
			e.printStackTrace();
			this.startDate = new Date();
		}
	}
	
	/**
	 * A method to decide if one's membership is still valid
	 * @return To return
	 */
	public boolean isValid() {
		return ((this.startDate.getTime() - System.currentTimeMillis()) / MILLIS_YEAR) >=0;
	}
	
	/**
	 * Premium membership is allowed to access equipments.
	 * @return Return true.
	 */
	public boolean equipmentAllowed() {
		return true;
	}
	
	/**
	 * Premium membership is not allowed to access classes.
	 * @return Return false.
	 */
	public boolean classesAllowed() {
		return false;
	}
	
	/**
	 * Premium membership is allowed to access pool.
	 * @return Return true.
	 */
	public boolean poolAllowed() {
		return true;
	}
	
	@Override
	public boolean isVaild() {
		// TODO Auto-generated method stub
		return false;
	}
}
