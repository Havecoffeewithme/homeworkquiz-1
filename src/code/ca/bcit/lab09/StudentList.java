package ca.bcit.lab09;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StudentList
{

    public static void main(String[] args)
    {
        List<Student> classList ;
        classList = new ArrayList<>();

        classList.add(new Student("Percy","Ratheko", 989087));
        classList.add(new Student("Selina", "Kunene", 666187));
        classList.add(new Student("Xr", "Mohammed", 444487));
        classList.add(new Student("Azania", "Mhlaba", 119087));
        classList.add(new Student("Lusaka", "Zona", 100087));


        System.out.println("Sort by first Name : ");

        classList.stream().filter(p -> p.getFirstName() != null)
                .sorted(Comparator.comparing(Student::getFirstName))
                .map(Student::getFirstName)
                .forEach(System.out::println);


    }
}
