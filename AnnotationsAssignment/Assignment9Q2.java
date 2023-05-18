package AnnotationsAssignment;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target({ElementType.METHOD, ElementType.TYPE, ElementType.FIELD})
@interface Info{
    int authorId() default 2509;
    String author();
    String supervisor();
    String date() default "18-May-2023";
    String time() default "11:00";
    int version() default 1;
    String description();
}

@Info(author = "Vasu", supervisor = "ABC", description = "Annotation Assignment")
public class Assignment9Q2 {
    public static void main(String[] args) {
    }
    @Info(author = "Vasu", supervisor = "DEF", description = "New Variable")
    void testMethod(){

    }
}
