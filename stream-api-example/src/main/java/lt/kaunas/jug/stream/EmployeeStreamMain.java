package lt.kaunas.jug.stream;

import java.util.ArrayList;
import java.util.List;

/**
 * Stream example to demonstrate distinct, map, filter and findFirst operations.
 * Applications find first programmer in stream with salary > 40000
 * 
 * @author Valdas Zigas
 *
 */
public class EmployeeStreamMain {

	public static void main(String... args) {

		// test list of employee ids
		List<Long> idList = new ArrayList<>();
		for (long i = 0; i < 20; i++) {
			idList.add(i);
			// simulate duplicates
			idList.add(i);
		}
		// list before processing
		System.out.println("ids=" + idList);

		Programmer result = idList.stream().distinct()
				.map(EmployeeStreamMain::findById).filter(e -> e != null)
				.filter(e -> e.getSalary() > 40000).findFirst().orElse(null);

		System.out.println("result=" + result);

		// list after processing
		System.out.println("ids=" + idList);
	}

	/**
	 * Provides programmer by id
	 * 
	 * @param id
	 *            programmer id
	 * @return resoved programmer
	 */
	private static Programmer findById(long id) {
		System.out.println("findById id=" + id);
		Programmer employee = null;
		if (id > 1) {
			employee = new Programmer();
			employee.setId(id);
			employee.setName("name" + id);
			// some algorithm to derive salary from id .. :)
			employee.setSalary(12000 * (int) (id % 10));

		}
		return employee;
	}
}
