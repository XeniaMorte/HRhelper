import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class EmployeeBook {
    Employer h1 = new Employer("Анна", "Орлова", "Степановна", 30000, " support");
    Employer h2 = new Employer("Павел", "Третьяков", "Владленович", 120000, " sales");

    Employer h3 = new Employer("Григорий", "Хрум", "Николаевич", 30000, " support");

    Employer h4 = new Employer("Роман", "Загойнон", "Яшин", 30000, " IT");

    Employer h5 = new Employer("Лолита", "Милота", "Дрокуманка", 300000, " IT");

    Employer h6 = new Employer("Кирилл", "Дрокук", "Владиславович", 189000, " IT");

    Employer h7 = new Employer("Дэн", "Жижин", "Алексеевич", 47000, " support");
    Employer h8 = new Employer("Саша", "Уссман", "Дмитриевич", 210000, " sales");

    Employer h9 = new Employer("Оптимус", "Праймин", "Машинян", 10000, " ML");

    Employer h10 = new Employer("Дмитрий", "Акрипин", "Линоновян", 231000, " IT");

    Employer h11 = new Employer("Александра", "Верская", "Андреевна", 60000, " support");


    Employer[] employers = new Employer[]{h1, h2, h3, h4, h5, h6, h7, h8, h9, h10, h11};

    public void addEmployer(String name, String surname, String fname, Integer sallary, String structure) {
        Employer employer = new Employer(name, surname, fname, sallary, structure);
        Employer[] employers1 = new Employer[employers.length + 1];
        for (int i = 0; i < employers.length; i++) {
            employers1[i] = employers[i];
        }
        employers1[employers1.length - 1] = employer;
        this.employers = employers1;
    }

    public void deleteEmployer(Integer id) {

        employers[id] = null;
    }

    public void deleteEmployer(String name, String surname, String fname) {
        for (int i = 0; i < employers.length; i++) {
            var emp = employers[i];
            if (emp.isEqualsByFIO(name, surname, fname)) {
                employers[i] = null;
            }
        }
    }

    public void editEmployerSallary(String name, String surname, String fname, Integer newSallary) {
        for (int i = 0; i < employers.length; i++) {
            var emp = employers[i];
            if (emp.isEqualsByFIO(name, surname, fname)&& employers[i]!=null) {
                emp.setSallary(newSallary);
            }

        }
    }

    public void editEmployerStructure(String name, String surname, String fname, String newStrucrure) {
        for (int i = 0; i < employers.length; i++) {
            var emp = employers[i];
            if (emp.isEqualsByFIO(name, surname, fname)&&employers[i]!=null) {
                emp.setStructure(newStrucrure);
            }
        }
    }

    // [{struc: string, employers: Employee[]}]
    // Map<String, List<Employer>>
    public void listByStructure() {
        var structureGroups = new HashMap<String, ArrayList<Employer>>();

        for (var employer: employers) {
            if (employer==null){
                continue;
            }
            var struct = employer.getStructure();
            var isContain = structureGroups.containsKey(struct);

            if (isContain) {
                var currentGroup = structureGroups.get(struct);
                currentGroup.add(employer);
            } else {
                structureGroups.put(struct, new ArrayList<>(List.of(employer)));
            }
        }

        for (var struct: structureGroups.entrySet()) {
            System.out.println(struct.getKey());
            System.out.println("\t " + struct.getValue());
        }
        System.out.println("_________________________________________");

    }
}
