package lt.kaunas.jug.stream;

import java.util.ArrayList;
import java.util.List;

public class EmployeeStreamMain {

	public static void main(String... args) {

		// test list of employee ids
		List<Long> idList = new ArrayList<>();
		for (long i = 0; i < 20; i++) {
			idList.add(i);
			idList.add(i);
		}

		Programmer result = idList.stream().distinct()
				.map(EmployeeStreamMain::findById).filter(e -> e != null)
				.filter(e -> e.getSalary() > 40000).findFirst().orElse(null);

		System.out.println("result=" + result);

		// list before processing
		System.out.println("ids=" + idList);
		result = idList.stream().map(EmployeeStreamMain::findById)
				.filter(e -> e != null).filter(e -> {
					System.out.println("filter " + e);
					boolean greater = e.getSalary() > 40000;
					return greater;
				}).findFirst().orElse(null);

		System.out.println("result=" + result);

		// list after processing
		System.out.println("ids=" + idList);
	}

	private static Programmer findById(long id) {
		System.out.println("findById id=" + id);
		Programmer employee = null;
		if (id > 1) {
			employee = new Programmer();
			employee.setId(id);
			employee.setName("name" + id);
			employee.setSalary(12000 * (int) (id % 10));
			// employee.setSalary(50000);

		}
		return employee;
	}
}
