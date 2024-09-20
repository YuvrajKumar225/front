package LinkedList;

import java.util.LinkedList;
import java.util.List;

public class CheckPalindromeUsingLinkedList {

    public static boolean checkPalindromeUsingLinkedList(LinkedList<Character> list) {
        int i = 0;
        int j = list.size() - 1;

        while (i < j) {  // Changed from i > j to i < j
            if (!list.get(i).equals(list.get(j))) {  // Changed != to !equals()
                return false;
            }
            i++;
            j--;
        }

        return true;
    }

    public static void main(String[] args) {
        LinkedList<Character> list = new LinkedList<>(List.of('r', 'a', 'd', 'a', 'r'));
        boolean result = checkPalindromeUsingLinkedList(list);
        System.out.println(result);
    }
}
