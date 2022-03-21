package hello.core;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class HelloLombok {
    private String name;
    private int age;

    public static void main(String[] args) {
        HelloLombok helloLombok = new HelloLombok();
        helloLombok.setName("hello");
        helloLombok.setAge(13);

        System.out.println(helloLombok.getName() + helloLombok.getAge());
        System.out.println(helloLombok.toString());
    }

}
