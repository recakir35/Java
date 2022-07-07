package lesson35_Exceptions.Ex02_OkulOgr_;

public class Ogrenci {
    String name;
    String surName;
    int age;


    public Ogrenci() {
    }

    public Ogrenci(String name, String surName, int age) {
        this.name = name;
        this.surName = surName;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Ogrenci{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", age=" + age +
                '}';
    }
}
