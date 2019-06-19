import java.util.*;
class main {
    public static void main(String[] args) {

        Set<Integer> num1 = new HashSet<>();
        num1.add(1);
        num1.add(2);
        num1.add(3);

        HashSet<Integer> num2 = new HashSet<>();
        num2.add(0);
        num2.add(1);
        num2.add(2);

        Set<Integer> result = symmetricDifference(num1,num2);
        System.out.println(result);

    }

    public static <T> Set<T> symmetricDifference(Set<? extends T> set1, Set<? extends T> set2) {
        Set<T> symmetricDiff = new HashSet<T>(set1);
        symmetricDiff.addAll(set2);

       Set<T> tmp = new HashSet<T>(set2);
       tmp.addAll(set1);
       tmp.removeAll(set1);

symmetricDiff.removeAll(set2);
tmp.addAll(symmetricDiff);

        return tmp;
    }
}