package org.lbg.unreachable;

public class UnreachableMain
{
    public static void main(String[] args)
    {
        System.out.println("This is the Main from UnreachableMain.");
    }

    public void fooBar()
    {
        ClassB cb = new ClassB();
        cb.age = 27;
    }
}
