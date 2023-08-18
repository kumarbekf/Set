import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        Set<Integer> set2 = new HashSet<>();
        set2.add(0);
        set2.add(1);
        set2.add(2);
        Set<Integer> set3 = symmetricDifference(set1,set2);
        System.out.println(set3);
    }

    public static <Integer> Set<Integer> symmetricDifference(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> symmetricDiff = new HashSet<>(set1);
        symmetricDiff.addAll(set2);

        Set<Integer> temp = new HashSet<>(set1);
        temp.retainAll(set2);

        symmetricDiff.removeAll(temp);
        return symmetricDiff;
            }
        }


