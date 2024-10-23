package org.lbg.c4;
import org.lbg.unreachable.ClassB;
/**
 * Hello world!
 */
public class App
{
    public static void main(String[] args)
    {
        System.out.println("Hello World!");
        ClassA ca = new ClassA();
        ClassB cb = new ClassB();
        int x = 33;
        System.out.println(x);

        while((x++) < 35)
            System.out.println("result");

        for(int y = 0;x < 10;x++)
            System.out.println(y);

    }
}
