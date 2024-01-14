package employeeApp;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Uygulamanın amacı Java'da nesne tabanlı programlamanın temellerinin oluşturulmasıdır.
 *
 */
public class Main
{

    /**
     * Uygulamadaki tüm işlemler bu metotda yapılmalı
     */
    private static void workWithData ()
    {

       Healthplan h1=new Healthplan(1,"A sigorta",Plan.BASIC);
        Healthplan h2=new Healthplan(1,"B sigorta",Plan.MEDIUM);

        System.out.println(h1);
        System.out.println(h2);

        String[] healthPlan=new String[3];
        healthPlan[0]= h1.getName();
        healthPlan[1]= h2.getName();

        Employee employee=new Employee(1,"tuna","tuna.com","1235",healthPlan);
        employee.addHealthplan(1,"C sigorta");
        employee.addHealthplan(2,"C sigorta");
        employee.addHealthplan(3,"C sigorta");
        System.out.println(Arrays.toString(employee.getHealthplans()));

    }

    /**
     * Bu projenin ana(main) metodu. Java uygulamalarında main metot küçük bir metot olur.
     * Bir Java programınd ilgili işlemlerin çoğunluğu başka metodlarda yapılır.
     * Daha sonra ana metod diğer metodları çağırır. Böylece ana metodun içi kalabalık bir hale gelmemiş olur.

     *
     * @param args bu uygulamada kullanılmamaktadır. Command Line üzerinden argüman alan
     *             bir uygulamamız olsaydı kullanılacaktı.
     */
    public static void main(String[] args)
    {

        workWithData();
    }
}
