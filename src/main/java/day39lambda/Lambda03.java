package day39lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda03 {
    public static void main(String[] args) {
        Course courseTurkishDay = new Course("Summer", "Turkish Day", 97, 128);
        Course courseTurkishNight = new Course("Winter", "Turkish Night", 98, 154);
        Course courseEnglishDay = new Course("Spring", "English Day", 95, 132);
        Course courseEnglishNight = new Course("Winter", "English Night", 93, 144);

        List<Course> coursesList = new ArrayList<>();
        coursesList.add(courseTurkishDay);
        coursesList.add(courseTurkishNight);
        coursesList.add(courseEnglishDay);
        coursesList.add(courseEnglishNight);


        //1)Tum "averageScore" larin 91 den buyuk olup olmadigini kontrol kodu yaziniz


        boolean result1 = coursesList.
                stream().
                allMatch(t->t.getAverageScore()>91);
        System.out.println("result1 = " + result1);

        //2)Kurs isimlerinden en az birinin "Turkis" kelimesini icerip icermedigini kontrol eden koudu yaz

       boolean result2 = coursesList.
               stream().
               anyMatch(t->t.getCourseName().contains("Turkish"));
        System.out.println("result2 = " + result2);

        //3)Avarage scoru en yuksek olan kursun ismini console yazdiran kadu yazi

       String name1= coursesList.
               stream().
               sorted(Comparator.comparing(Course::getAverageScore).reversed()).
               findFirst().
               get().
               getCourseName();
        System.out.println("name1 = " + name1);


        //4) Tum course objectlerini avarage score a gore kucukten buyuge diziniz ve ilk ikisi haric liste halinda console yazdirin

        List<Course> myList = coursesList.
                stream().
                sorted(Comparator.comparing(Course::getAverageScore)).
                skip(2).
                collect(Collectors.toList());

        System.out.println("myList = " + myList);

        //5) Tum course objectlerini avarage score a gore kucukten buyuge diziniz ve ilk ucunu  liste halinda consoe yazdirin

            List<Course> yourList=coursesList.
                    stream().
                    sorted(Comparator.comparing(Course::getAverageScore)).
                    limit(3).
                    collect(Collectors.toList());

        System.out.println("yourList = " + yourList);

        //6) Tum course objectlerini avarage score a gore kucukten buyuge diziniz ve  ucuncuyu console yazdirin
        Course ourList=coursesList.
                stream().
                sorted(Comparator.comparing(Course::getAverageScore)).
                skip(2).
                limit(1).
                findFirst().
                get();
        System.out.println("ourList = " + ourList);
    }







}
