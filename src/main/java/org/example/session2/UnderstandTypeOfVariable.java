package org.example.session2;

public class UnderstandTypeOfVariable {

    int instanceVariable = 50;
    static int staticVariable = 100;

    public static void main(String[] args) {
        // method static
        System.out.println(staticVariable);
        UnderstandTypeOfVariable understandTypeOfVariable = new UnderstandTypeOfVariable();
        understandTypeOfVariable.instanceVariable =150;
        System.out.println(understandTypeOfVariable.instanceVariable);
        understandTypeOfVariable.usingLocalVariableMethod();
    }

    private void usingLocalVariableMethod(){
        int localVariable = 10;
        System.out.println(localVariable);
        System.out.println(instanceVariable);
    }
}
