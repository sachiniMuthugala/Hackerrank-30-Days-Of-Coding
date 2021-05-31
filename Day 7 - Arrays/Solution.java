import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        StringBuilder s = new StringBuilder();

        for(int i = (arr.size()-1); i>=0; i--){
            //s = s +  arr.get(i) + " ";
            s.append(arr.get(i)).append(" ");
        }
        System.out.println(s);

        bufferedReader.close();
    }
}
