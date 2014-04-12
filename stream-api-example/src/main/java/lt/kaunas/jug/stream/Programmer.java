package lt.kaunas.jug.stream;

/**
 * Sample Programmer model
 * 
 * @author Valdas Zigas
 *
 */
public class Programmer {

	/**
	 * Identity
	 */
	private long id;

	/**
	 * Organic resource name
	 */
	private String name;

	/**
	 * Annual salary. Don't use short !!!
	 */
	private int annualSalary;

	/**
	 * 
	 */
	public Programmer(long id, String name, int annualSalary) {
		this.id = id;
		this.name = name;
		this.annualSalary = annualSalary;
	}

	/**
	 * 
	 */
	public Programmer() {

	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return annualSalary;
	}

	public void setSalary(int salary) {
		this.annualSalary = salary;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String toString() {
		return "Programmer [id=" + id + ", name=" + name + ", salary="
				+ annualSalary + "]";
	}

}
