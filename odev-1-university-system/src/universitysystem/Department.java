package universitysystem;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private List<Office> offices = new ArrayList<>();

    public List<Office> getOffices() { return offices; }
    public void addOffice(Office office) { offices.add(office); }
}