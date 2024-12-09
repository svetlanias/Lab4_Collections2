package org.example;

/**
 * класс, представляющий сущность "подразделение"
 */
public class Division {

    /**
     * поле с ID подразделения
     */
    private final int id;

    /**
     * поле с названием подразделения
     */
    private final String name;

    /**
     * конструктор
     * @param divID ID подразделения
     * @param divName название подразделения
     */
    Division(int divID, String divName)
    {
        id=divID;
        name=divName;
    }

    /**
     * метод, переопределяющий метод toString()
     * @return строку с информацией о подразделении
     */
    @Override
    public String toString() {
        return ", Division id=" + id + ", Division name=" + name;
    }
}
