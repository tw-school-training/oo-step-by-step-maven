//package com.thoughtworks.practice05;
//
//import org.junit.Test;
//
//import static org.junit.Assert.assertEquals;
//
//public class Practice05Test {
//    @Test
//    public void should_person_have_name_and_age() {
//        Person person = new Person("Tom", 21);
//        assertEquals(person.getName(), "Tom");
//        assertEquals(person.getAge(), 21);
//    }
//
//    @Test
//    public void should_person_have_an_introduce_method_which_introduce_person_with_name_and_age() {
//        Person tom = new Person("Tom", 21);
//        String introduce = tom.introduce();
//        assertEquals(introduce, "My name is Tom. I am 21 years old.");
//    }
//
//    @Test
//    public void should_student_have_name_age_and_class_number() {
//        Student tom = new Student("Tom", 21, 2);
//        assertEquals(tom.getName(), "Tom");
//        assertEquals(tom.getAge(), 21);
//        assertEquals(tom.getKlass(), 2);
//    }
//
//    @Test
//    public void should_student_introduce_with_class() {
//        Student tom = new Student("Tom", 21, 2);
//        assertEquals(tom.introduce(), "My name is Tom. I am 21 years old. I am a Student. I am at Class 2.");
//    }
//
//    @Test
//    public void should_worker_have_name_and_age() {
//        Worker tom = new Worker("Tom", 21);
//        assertEquals(tom.getName(), "Tom");
//        assertEquals(tom.getAge(), 21);
//    }
//
//    @Test
//    public void should_worker_introduce_itself_with_no_field() {
//        Worker tom = new Worker("Tom", 21);
//        assertEquals(tom.introduce(), "My name is Tom. I am 21 years old. I am a Worker. I have a job.");
//    }
//}
