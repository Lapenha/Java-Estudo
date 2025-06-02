package Annotation;

public @interface Values {
    String value() default "";
    String name();
    int age();
    String[] newNames();
}
