import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

//        String a = "asdsaf";
//        StringBuilder sb = new StringBuilder(a);
//        String b =  sb.reverse().toString();
//        if (a.equals(b)){
//            System.out.println("This is palindrom !");
//        }else System.out.println("This is not palindrom!");
//
//        String st1 = "Мы готовимся     к интервью   на вакансию    Java разработчика";
//        String st2 = st1.replaceAll("\\s", "");
//
//        System.out.println(st2);


        // последовательность простых чисел
//        int a = 100;
//        boolean c = false;
//        List<Integer> simpleNumbers = new ArrayList<>();
//        for (int i = a - 1; i > 0; i--) {
//            c=false;
//            for (int j = i - 1; j > 1; j--) {
//                if (i % j == 0){
//                    c=true;
//                    break;
//                }
//            }
//            if (c){
//                continue;
//            }
//            simpleNumbers.add(i);
//        }
//        Collections.sort(simpleNumbers);
//        System.out.println(simpleNumbers);



        /*
        реализация LInkedList
         */
        MyLinkedList list = new MyLinkedList();
        list.add(34);
        list.add(23);
        list.add(0);
        list.add(-2);
        System.out.println(list);
        System.out.println(list.get(0));
        System.out.println(list.get(2));
        list.remove(3);
        System.out.println(list);




    }
}
