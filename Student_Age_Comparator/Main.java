import java.util.*;

public class Main{

    public static void main(String[]args){


        ArrayList<Student> list = new ArrayList<>();


        System.out.println("\n    -----STUDENT AGE-----");

        list.add(new Student("Sujal",22));
        list.add(new Student("Tejas",19));
        list.add(new Student("Shreya",25));




        Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o2.age - o1.age; //Descending
            }
        });

        for (Student s : list){

            System.out.println("\nName :" + s.name + " \nAge : " + s.age);


        }

    }
}