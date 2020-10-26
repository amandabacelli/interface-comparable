package entities;

public class Elf implements Comparable<Elf> {

    private String name;
    private Integer age;

    public Elf(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }


    //ordenar por ordem crescente de idade
    /** @Override
    public int compareTo(Elf elf) {
        return age.compareTo(elf.getAge());
    } **/

    //ordenar por ordem decrescente de idade
    /** @Override
    public int compareTo(Elf elf) {
        return -age.compareTo(elf.getAge());
    } **/

    //ordenar por nome
    @Override
    public int compareTo(Elf elf) {
        return name.compareTo(elf.getName());
    }

    @Override
    public String toString() {
        return "Elf{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

}
