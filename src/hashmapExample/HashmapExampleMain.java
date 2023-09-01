package hashmapExample;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

public class HashmapExampleMain {

	public static void main(String[] args) {

		HashMap<Integer, Manager> managers = new HashMap<>();

		managers.put(101, new Manager(25, "Manpreet", "Kitchen"));

		managers.put(201, new Manager(205, "Surya", "Backyard"));

		int id = managers.get(201).getId();
		System.out.println(id);

		List<Employee> managerz = new ArrayList<>();

		managerz.add(new Manager(222, "Navi", "IT"));
		managerz.add(new Manager(444, "Vindhu", "HR"));

		List<Employee> hods = new ArrayList<>();
		hods.add(new HOD(654, "Munna", "Free"));
		hods.add(new HOD(784, "Devi", "Busy"));

		HashMap<Integer, List<Employee>> hm2 = new HashMap<>();

		hm2.put(1, managerz);
		hm2.put(2, hods);

		for (Entry<Integer, List<Employee>> entry : hm2.entrySet()) {
			if (entry.getKey().equals(2)) {
				List<Employee> val = entry.getValue();
				for (Employee employee : val) {
					System.out.println(employee.getName());
				}

			}
		}

		System.out.println("#################################################");

		Employee binu = new Employee(31, "Binu");
		Employee sandy = new Employee(32, "Sandy");
		Employee rajdeep = new Employee(33, "Raju");
		Employee abishek = new Employee(21, "Abi");
		Employee surya = new Employee(22, "Prakash");
		Employee blessey = new Employee(23, "Bl");

		Manager swaroop = new Manager(11, "Chitra", "Day");
		Manager amrinder = new Manager(12, "Aman", "Afternoon");

		List<Employee> swaroopEmpl = new ArrayList<>();

		swaroopEmpl.add(binu);
		swaroopEmpl.add(sandy);
		swaroopEmpl.add(rajdeep);

		List<Employee> amrinderEmpl = new ArrayList<>();

		amrinderEmpl.add(blessey);
		amrinderEmpl.add(abishek);
		amrinderEmpl.add(surya);

		HashMap<Manager, List<Employee>> relation = new HashMap<>();

		HashMap<Manager, Employee[]> relation2 = new HashMap<>();

		relation.put(swaroop, swaroopEmpl);
		relation.put(amrinder, amrinderEmpl);

		for (Entry<Manager, List<Employee>> entry : relation.entrySet()) {
			if (entry.getKey().getName().equals("Chitra")) {
				List<Employee> employee = entry.getValue();

				for (Employee employee2 : employee) {
					System.out.println(employee2.getName());
				}
			}

		}

	}
}
