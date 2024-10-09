package LatihanSubClass;

import java.util.Scanner;

    public class Tester {
        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);

            System.out.println("Pilih kategori\n 1. Student\n 2. Teacher");
            String pilihan = s.nextLine();

            if(pilihan.equalsIgnoreCase("1")){
                System.out.println("---Student---");
                System.out.println("Name: ");
                String name = s.nextLine();
                System.out.println("Mjor: ");
                String major = s.nextLine();
                System.out.println("Age: ");
                int age = s.nextInt();
                System.out.println("Student number: ");
                int studentNumber = s.nextInt();
                System.out.println("Score: ");
                int score = s.nextInt();
                Student a = new Student(name, age, studentNumber, score, major);
                a.print();

            }else if(pilihan.equalsIgnoreCase("2")){
                System.out.println("Pilih kategori\n 1. Full Time\n 2. Part Time");
                String guru = s.nextLine();
                if(guru.equalsIgnoreCase("1")){
                    System.out.println("---Full Time Teacher---");
                    System.out.println("Name: ");
                    String name = s.nextLine();
                    System.out.println("Subject: ");
                    String subject = s.nextLine();
                    System.out.println("Unit: ");
                    String unit = s.nextLine();
                    System.out.println("Age: ");
                    int age = s.nextInt();
                    System.out.println("Salary: ");
                    int anualSalary = s.nextInt();
                    FullTime c = new FullTime(name, age, subject, anualSalary, unit);
                    c.print();
                }else if(guru.equalsIgnoreCase("2")){
                    System.out.println("---Part Time Teacher---");
                    System.out.println("Name: ");
                    String name = s.nextLine();
                    System.out.println("Subject: ");
                    String subject = s.nextLine();
                    System.out.println("Age: ");
                    int age = s.nextInt();
                    System.out.println("Hours Worked: ");
                    int hoursworked = s.nextInt();
                    PartTime d = new PartTime(name, age, subject, hoursworked);
                    d.print();
                }
            }
        }
    }