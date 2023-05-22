package AnnotationsAssignment;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target({ElementType.METHOD, ElementType.TYPE, ElementType.FIELD})
@interface Info{
    int authorId();
    String author() default "Vasu";
    String supervisor() default "ABC";
    String date();
    String time();
    int version();
    String description() default "Annotation assignment";
}

@Info(authorId = 2509, date = "18-May-2023", time = "11:00", version = 1)
public class Assignment9Q2 {
    public static void main(String[] args) {
    }
    @Info(authorId = 25, date = "22-May-2023", time = "05:00", version = 2)
    void testMethod(){

    }
}
