public class Main {


    public static void main(String[] args) {
        var book = new EmployeeBook();
        book.listByStructure();

        book.addEmployer("vgh", "bh,", "ghj", 76543, "TEST");
        book.listByStructure();
        book.deleteEmployer("vgh", "bh,", "ghj");
        book.listByStructure();
        book.editEmployerSallary("vgh", "bh,", "ghj", 543);
        book.editEmployerStructure("vgh", "bh,", "ghj", "TEST000"););
    }
}