import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* DOĞANAY BALABAN 1220505057 */
public class LibraryManagement {
    /* Fieldları tutabilmek için gerekli listeler */
    private static ArrayList<Book> books = new ArrayList<>();
    private static ArrayList<Member> members = new ArrayList<>();
    private static ArrayList<Employee> employees = new ArrayList<>();
    private static Map<Member, Book> odunc = new HashMap<>();

    /* Kitap ekleme işlemi */
    public static void addBook(Integer bookID, String bookName, String bookAuthor) {
        Book newBook = new Book(bookID, bookName, bookAuthor);
        books.add(newBook);
    }

    /* Kitap çıkarma işlemi */
    public static void deleteBook(String bookName) {
        for (Book book : books) {
            if (book.getBookName().equals(bookName)) {
                books.remove(book);
                break;
            }
        }
    }

    /* Kitap sıralama işlemi */
    public static void allBook() {
        System.out.println("\nEklenmiş Kitaplar:");
        for (Book book : books) {
            System.out.println(book.getBookName() + " - " + book.getBookAuthor());
        }
    }

    /* Üye ekleme işlemi */
    public static void addMember(Integer memberID, String memberName, Integer memberAge) {
        Member newMember = new Member(memberID, memberName, memberAge);
        members.add(newMember);
    }

    /* Üye çıkarma işlemi */
    public static void removeMember(Integer memberID) {
        for (Member member : members) {
            if (Objects.equals(member.getMemberID(), memberID)) {
                members.remove(member);
                break;
            }
        }
    }

    /* Üye sıralama işlemi */
    public static void allmember() {
        System.out.println("\nÜyeler :");
        for (Member member : members) {
            System.out.println(member.getMemberName() + " - " + member.getMemberAge());
        }
    }

    /* Çalışan ekleme işlemi */
    public static void addEmployee(Integer employeeID, String employeeName, Integer employeeAge, Double employeeSalary, String employeeTask) {
        Employee newEmployee = new Employee(employeeID, employeeName, employeeAge, employeeSalary, employeeTask);
        employees.add(newEmployee);
    }

    /* Çalışan çıkarma işlemi */
    public static void deleteEmployee(String employeeName, String employeeTask) {
        for (Employee employee : employees) {
            if (employee.getEmployeeName().equals(employeeName) && employee.getEmployeeTask().equals(employeeTask)) {
                employees.remove(employee);
                break;
            }
        }
    }

    /* Çalışan listeleme işlemi */
    public static void allEmployee() {
        System.out.println("\nÇalışanlar : ");
        for (Employee employee : employees) {
            System.out.println(employee.getEmployeeName() + " - " + employee.getEmployeeTask() + " - " + employee.getEmployeeSalary() + " TL");
        }
    }

    /* Kitap ödünç verme işlemi */
    public static void giveBook(Integer memberID, String bookName) {
        Member member = null;
        Book book = null;

        for (Member mem : members) {
            if (Objects.equals(mem.getMemberID(), memberID)) {
                member = mem;
                break;
            }
        }
        for (Book bk : books) {
            if (bk.getBookName().equals(bookName) && !bk.isOdunc()) {
                book = bk;
                break;
            }
        }
        if (member != null && book != null) {
            book.setIsOdunc(true);
            odunc.put(member, book);
        }

    }

    /* Ödünç verilen kitabı geri alma işlemi */
    public static void receiveBook(Integer memberID) {
        Member member = null;
        for (Member mem : members) {
            if (Objects.equals(mem.getMemberID(), memberID)) {
                member = mem;
                break;
            }
        }
        if (odunc.containsKey(member)) {
            Book receivedBook = odunc.get(member);
            receivedBook.setIsOdunc(false);
            odunc.remove(member);
        }
    }

    /* Ödünç kitapları takip etme işlemi */
    public static void followOduncBook() {
        for (Map.Entry<Member, Book> entry : odunc.entrySet()) {
            Member member = entry.getKey();
            Book book = entry.getValue();
            System.out.println("Üye " + member.getMemberName() + " , " + "Kitap" + book.getBookName() + " - " + book.getBookAuthor());
        }
    }

}
