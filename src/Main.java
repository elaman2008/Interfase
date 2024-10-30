import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        EducationCenter School = new School("Bahmal", "Osh", LocalDate.of(2010, 10, 2));
        EducationCenter University = new University("Peaksoft", "Bishkek", LocalDate.of(2020, 10, 3));
        EducationCenter College = new College("Mark", "Talas", LocalDate.of(2018, 2, 5));

        Student[] student = {new Student("Elaman", "Abjalov", "man", LocalDate.of(2020, 5, 4), University),
                new Student("Daniel", "Abazov", "man", LocalDate.of(2008, 4, 3), College),
                new Student("Adilet", "Abiev", "man", LocalDate.of(2002, 3, 8), School),
                new Student("Sanjar", "Abyrazakov", "man", LocalDate.of(2003, 4, 6), College),
                new Student("Daniel", "Abdykerimov", "man", LocalDate.of(2005, 6, 10), University),
                new Student("Nursultan", "Mamatov", "man", LocalDate.of(2007, 2, 7), College),
                new Student("Bektur", "Elamanov", "man", LocalDate.of(2009, 1, 9), School),
                new Student("Mirlan", "Adiletov", "man", LocalDate.of(2004, 9, 11), University),
                new Student("Asylbek", "Kalnazarov", "man", LocalDate.of(1997, 8, 13), College),
                new Student("Gulnur", "Kalbaeva", "woman", LocalDate.of(1999, 7, 16), School),
        };
        getMethod(student);
    }

    public static void getMethod(Student[] students) {
        for (Student student : students) {
            System.out.println("Education center: " + student.getEducationCenter() + "Data of start: " + student.getEducationCenter());
            System.out.println(student.getDateOfStart());
        }
    }
}
//EducationCenter деген абстракт класс тузунуз. Полелери: name, locatedCountry, LocalDate foundationYear;
//Абстракт класска School , University, College деген саб класстарды тузунуз.
//Study деген интерфейс тузуп, ичине void getStudentsEducationCenter(), void getStudentsStudyingYear()  деген 2 метод тузунуз.
//Student деген класс тузунуз. Полелери: name, surname, Gender gender,  LocalDate dateOfStart()(студент кайсыл жылы окуп баштаганы), EducationCenter educationCenter;
//Main класста студенттердин массивин тузуп ичине 10 студент салыныз. Студенттер ар кандай окуу жайда окусун.
//Main класста 1 метод тузунуз.
//        1 - метод бардык студенттер жонундо маалыматты, кайсыл студент кайсы окуу жайда окуганы тууралу маалыматты жана окуганыны канча жыл болгону тууралу маалыматты чыгарып берсин.
//




