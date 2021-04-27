package _08_Arrays_e_Collections;

import java.util.HashSet;
import java.util.Set;

public class _04_Set01 {
    public static void main(String[] args) {
        HashSet conjunto = new HashSet();

        conjunto.add(1.2); //double -> Double
        conjunto.add(true); //boolean -> Boolean
        conjunto.add("Teste"); //String
        conjunto.add(1);
        conjunto.add('a');
        System.out.println(conjunto);
        System.out.println("Tamanho é " + conjunto.size());
        System.out.println();

        conjunto.add("Teste");
        conjunto.add('a');
        System.out.println(conjunto);
        System.out.println("Tamanho é " + conjunto.size());
        System.out.println();

        System.out.println(conjunto.remove("Teste"));
        System.out.println(conjunto.remove('a'));
        System.out.println(conjunto);
        System.out.println("Tamanho é " + conjunto.size());
        System.out.println();

        System.out.println(conjunto.contains('x'));
        System.out.println(conjunto.contains(true));
        System.out.println(conjunto.contains(876));

        Set nums = new HashSet();
        nums.add(1);
        nums.add(2);
        nums.add(3);

        System.out.println(nums);
        System.out.println(conjunto);

        //conjunto.addAll(nums);
        conjunto.retainAll(nums);
        System.out.println(conjunto);
        System.out.println();

        conjunto.clear();;
        System.out.println(conjunto);


    }

}
