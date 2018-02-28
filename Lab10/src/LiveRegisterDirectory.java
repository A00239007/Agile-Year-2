import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class LiveRegisterDirectory {

    public LinkedList<String[]> List() throws FileNotFoundException{
        MergeSorter merge = new MergeSorter();
        ArrayList<String[]> array = ArrayList();
        LinkedList<String[]> list = new LinkedList<>();
        array.remove(0);
        for(int i = 0; i<array.size();i++)
        {
            list.addLast(array.get(i));
        }
        return list;
    }

    public ArrayList<String[]> ArrayList() throws FileNotFoundException {
        File csvFile = new File("C:\\Users\\Simon Harper\\Downloads\\all_persons_under_25.csv");
        int count = 0;
        String line;
        String[] row;
        ArrayList<String[]> newRow = new ArrayList<>();
        Scanner sc = new Scanner(csvFile);
        while (sc.hasNextLine()) {
            line = sc.nextLine();
            row = line.split(",");
            ArrayList<String> updatedRow = new ArrayList<>(Arrays.asList(row));
            for (int x = updatedRow.size() - 1; x > 1; x--) {
                updatedRow.remove(x);
            }
            String[] twoColumnRow = updatedRow.toArray(new String[0]);
            newRow.add(updatedRow.toArray(twoColumnRow));
        }
        return newRow;
    }

}
