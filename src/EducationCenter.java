import java.time.LocalDate;

public  abstract  class  EducationCenter {
    private String name;
    private String locatedCountry;
    private LocalDate foundationYear;

    public EducationCenter() {
    }

    public EducationCenter(String name, String locatedCountry, LocalDate foundationYear) {
        this.name = name;
        this.locatedCountry = locatedCountry;
        this.foundationYear = foundationYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocatedCountry() {
        return locatedCountry;
    }

    public void setLocatedCountry(String locatedCountry) {
        this.locatedCountry = locatedCountry;
    }

    public LocalDate getFoundationYear() {
        return foundationYear;
    }

    public void setFoundationYear(LocalDate foundationYear) {
        this.foundationYear = foundationYear;
    }

    @Override
    public String toString() {
        return "EducationCenter{" +
                "name='" + name + '\'' +
                ", locatedCountry='" + locatedCountry + '\'' +
                ", foundationYear=" + foundationYear +
                '}';
    }
}




//EducationCenter деген абстракт класс тузунуз. Полелери: name, locatedCountry, LocalDate foundationYear;
//Абстракт класска School , University, College деген саб класстарды тузунуз.
//Study деген интерфейс тузуп, ичине void getStudentsEducationCenter(), void getStudentsStudyingYear()  деген 2 метод тузунуз.
//Student деген класс тузунуз. Полелери: name, surname, Gender gender,  LocalDate dateOfStart()(студент кайсыл жылы окуп баштаганы), EducationCenter educationCenter;
//Main класста студенттердин массивин тузуп ичине 10 студент салыныз. Студенттер ар кандай окуу жайда окусун.
//Main класста 1 метод тузунуз.
//        1 - метод бардык студенттер жонундо маалыматты, кайсыл студент кайсы окуу жайда окуганы тууралу маалыматты жана окуганыны канча жыл болгону тууралу маалыматты чыгарып берсин.