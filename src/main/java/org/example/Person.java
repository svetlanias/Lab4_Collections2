package org.example;

/**
 * класс, представляющий сущность "человек"
 */
public class Person {

    /**
     * поле ID человека
     */
    private final Integer id;

    /**
     * поле с именем человека
     */
    private final String name;

    /**
     * поле с полом человека
     */
    private final String gender;

    /**
     * поле с датой дня рождения человека
     */
    private final String birtDay;

    /**
     * поле с экземпляром класса подразделения
     */
    private final Division division;

    /**
     * поле с зарплатой человека
     */
    private final Integer salary;

    /**
     * конструктор класса Person
     * @param personID ID
     * @param personNmae имя
     * @param personGender пол
     * @param personBirtDay дата дня рождения
     * @param divName название подрахделения
     * @param divID ID подразделения
     * @param personSalary зарплата
     */
    Person(Integer personID, String personNmae,String personGender,String personBirtDay,String divName,Integer divID,Integer personSalary)
    {
        id=personID;
        name=personNmae;
        gender=personGender;
        birtDay=personBirtDay;
        division=new Division(divID,divName);
        salary=personSalary;
    }

    /**
     * метод, переопределяющий метод toString() для вывода информации о человеке
     * @return строку с неоходимой информацией
     */
    @Override
    public String toString() {
        return "Person{" + "id=" + id + ", name=" + name + ", gender=" + gender +
                ", birtDay=" + birtDay + division + ", salary=" + salary +'}';
    }
}

