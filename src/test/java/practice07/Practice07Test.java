//package practice07;
//
//import org.junit.Before;
//import org.junit.Test;
//
//import static org.junit.Assert.assertEquals;
//
//
//public class Practice07Test {
//    private Klass klass;
//
//    @Before
//    public void setup() {
//        klass = new Klass(2);
//    }
//
//    @Test
//    public void should_person_have_name_and_age() {
//        Person person = new Person("Tom", 21);
//
//        assertEquals(person.getName(), "Tom");
//        assertEquals(person.getAge(), 21);
//    }
//
//    @Test
//    public void should_person_have_an_introduce_method_which_introduce_person_with_name_and_age() {
//        Person tom = new Person("Tom", 21);
//        String introduce = tom.introduce();
//
//        assertEquals(introduce, "My name is Tom. I am 21 years old.");
//    }
//
//    @Test
//    public void should_class_have_a_number() {
//
//        assertEquals(klass.getNumber(), 2);
//    }
//
//    @Test
//    public void should_class_get_display_name() {
//
//        assertEquals(klass.getDisplayName(), "Class 2");
//    }
//
//    @Test
//    public void should_student_have_name_age_and_class_number() {
//        Student tom = new Student("Tom", 21, klass);
//
//        assertEquals(tom.getName(), "Tom");
//        assertEquals(tom.getAge(), 21);
//        assertEquals(tom.getKlass(), klass);
//    }
//
//    @Test
//    public void should_student_introduce_with_class() {
//        Student tom = new Student("Tom", 21, klass);
//
//        assertEquals(tom.introduce(), "My name is Tom. I am 21 years old. I am a Student. I am at Class 2.");
//    }
//
//    @Test
//    public void should_teacher_have_name_and_age_and_class() {
//        Teacher tom = new Teacher("Tom", 21, klass);
//
//        assertEquals(tom.getName(), "Tom");
//        assertEquals(tom.getAge(), 21);
//        assertEquals(tom.getKlass(), klass);
//    }
//
//    @Test
//    public void should_teacher_introduce_itself_with_which_class_it_teaches() {
//        Teacher tom = new Teacher("Tom", 21, klass);
//
//        assertEquals(tom.introduce(), "My name is Tom. I am 21 years old. I am a Teacher. I teach Class 2.");
//    }
//
//    @Test
//    public void should_teacher_introduce_itself_with_no_class_teaching() {
//        Teacher tom = new Teacher("Tom", 21);
//
//        assertEquals(tom.introduce(), "My name is Tom. I am 21 years old. I am a Teacher. I teach No Class.");
//    }
//
//    @Test
//    public void should_teacher_introduce_a_student_it_teaches() {
//        Teacher tom = new Teacher("Tom", 21, klass);
//        Student jerry = new Student("Jerry", 8, klass);
//
//        assertEquals(tom.introduceWith(jerry), "My name is Tom. I am 21 years old. I am a Teacher. I teach Jerry.");
//    }
//
//    @Test
//    public void should_teacher_introduce_a_student_it_does_not_teach() {
//        Teacher tom = new Teacher("Tom", 21, new Klass(1));
//        Student jerry = new Student("Jerry", 8, new Klass(2));
//
//        assertEquals(tom.introduceWith(jerry), "My name is Tom. I am 21 years old. I am a Teacher. I don't teach Jerry.");
//    }
//}
