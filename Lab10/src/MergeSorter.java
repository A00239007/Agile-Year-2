import java.awt.print.Printable;
import java.util.ArrayList;
import java.util.Collections;

/**
 * The sort method of this class sorts an array, using the merge sort algorithm.
 */
public class MergeSorter {
    /**
     * Sorts an array, using merge sort.
     * 
     * @param a
     *            the array to sort
     */
    public ArrayList<String[]> sort(ArrayList<String[]> list) {
            list = sortByName(list);
            return list;
    }

    private ArrayList<String[]> sortByName(ArrayList<String[]> list) {
        // TODO Auto-generated method stub
        if (list.size() <= 1) {
            return null;
        }
        ArrayList<String[]> first = new ArrayList<>();
        ArrayList<String[]> second = new ArrayList<>();
        // Copy the first half of a into first, the second half into second
        for(int i = 0; i < (list.size() / 2); i++)
        {
            first.add(list.get(i));
        }
        for(int i = 0; i<(list.size() - first.size());i++)
        {
            second.add(list.get(first.size()+i));
        }
        sortByName(first);
        sortByName(second);
        return mergeNames(first, second, list);
    }

    

    /**
     * Merges two sorted arrays into an array
     * 
     * @param first
     *            the first sorted array
     * @param second
     *            the second sorted array
     * @param list
     *            the array into which to merge first and second
     */
    

    private ArrayList<String[]> mergeNames(ArrayList<String[]> first, ArrayList<String[]> second, ArrayList<String[]> list) {
        int iFirst = 0; // Next element to consider in the first array
        int iSecond = 0; // Next element to consider in the second array
        int j = 0; // Next open position in a

        // As long as neither iFirst nor iSecond is past the end, move
        // the smaller element into a
        while (iFirst < first.size() && iSecond < second.size()) {
            if (first.get(iFirst)[1].compareTo(second.get(iSecond)[1]) < 0) {
                list.set(j, first.get(iFirst));
                iFirst++;
            } else {
                list.set(j, second.get(iSecond));
                iSecond++;
            }
            j++;
        }

        // Note that only one of the two loops below copies entries
        // Copy any remaining entries of the first array
        while (iFirst < first.size()) {
            list.set(j, first.get(iFirst));
            iFirst++;
            j++;
        }
        // Copy any remaining entries of the second half
        while (iSecond < second.size()) {
            list.set(j, second.get(iSecond));
            iSecond++;
            j++;
        }

        return list;
    }
}
