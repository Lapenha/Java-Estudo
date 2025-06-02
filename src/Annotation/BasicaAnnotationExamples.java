package Annotation;
@MyAnnotation
public class BasicaAnnotationExamples {
    @MyAnnotation
    private String name = "null";

    @MyAnnotation
    public String getName() {return name;}

    public String nameUpperCase(@MyAnnotation String name) {
        return name.toUpperCase();
    }

    @MyAnnotation
    public static void main(String[] args) {
        BasicaAnnotationExamples obj = new BasicaAnnotationExamples();
        System.out.println(obj.getName());
        System.out.println(obj.nameUpperCase(obj.getName()));
    }
}
