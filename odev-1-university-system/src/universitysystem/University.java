package universitysystem;

import java.util.ArrayList;
import java.util.List;

public class University {
    private List<Department> departments = new ArrayList<>();
    private List<Office> offices = new ArrayList<>();
    private List<Classroom> classrooms = new ArrayList<>();
    private List<Employee> employees = new ArrayList<>();

    public void addDepartment(Department department) { departments.add(department); }
    public void addOffice(Office office) { offices.add(office); }
    public void addClassroom(Classroom classroom) { classrooms.add(classroom); }
    public void addEmployee(Employee employee) { employees.add(employee); }

    public List<Department> getDepartments() { return departments; }
    public List<Office> getOffices() { return offices; }
    public List<Classroom> getClassrooms() { return classrooms; }
    public List<Employee> getEmployees() { return employees; }
}