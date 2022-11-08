public class Employer {
    private String name;
    private String surname;
    private String fname;
    private Integer sallary;
    private String structure;

    public Employer(String name, String surname, String fname, Integer sallary, String structure) {
        this.name = name;
        this.surname = surname;
        this.fname = fname;
        this.sallary = sallary;
        this.structure = structure;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSurname() {
        return surname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getFname() {
        return fname;
    }

    public void setSallary(Integer sallary) {
        this.sallary = sallary;
    }

    public Integer getSallary() {
        return sallary;
    }

    public String getStructure() {
        return structure;
    }

    public void setStructure(String structure) {
        this.structure = structure;
    }

    @Override
    public String toString() {
        return "Employer{ " +
                "name:'" + name + " " + surname + " " + fname + "', structure: " + structure + ", sallary:" + sallary + '}';

    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public boolean isEqualsByFIO(String name, String surname, String fname) {
        return (getName().equals(name) && getSurname().equals(surname) && getFname().equals(fname));
    }
}

