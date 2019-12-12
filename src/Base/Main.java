package Base;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Person mehdi = new Person();
        Scanner input=new Scanner(System.in);
        mehdi.salary=input.nextFloat();
        mehdi.makhareg=input.nextFloat();
        mehdi.compute();
        System.out.println(mehdi.khales);

    }
}
