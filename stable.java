import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class stable {

    public static void main(String[] args) {
        ArrayList<Integer> arrayList=new ArrayList<>();
        System.out.println("Enter 8 number in ArrayList");
        input(arrayList);
        System.out.println(arrayList);
        System.out.println(result(arrayList));


    }

    public  static boolean isStable(int a)
    {
        boolean decision=true;
        String s = String.valueOf(a);
        ArrayList<Character> arrayList=new ArrayList<>();
        ArrayList<Integer> count=new ArrayList<>();
        for(int i=0;i<s.length();i++)
        {
            arrayList.add(s.charAt(i));
        }
        count.add(Collections.frequency(arrayList,arrayList.get(0)));
        for(int j=1;j<arrayList.size();j++)
        {
            count.add(Collections.frequency(arrayList,arrayList.get(j)));
            if (count.get(j-1) != count.get(j))
            {
                decision = false;
            }

        }


        return decision;
    }
    public static void input(ArrayList<Integer> a)
    {
        int number;
        Scanner scanner =new Scanner(System.in);
        for (int i=0;i<8;i++)
        {
            number=scanner.nextInt();
            a.add(number);
        }

    }
    public  static int result(ArrayList<Integer> arrayList){
        int result=0,stable=0,unstable=0;
        for (int i=0;i<arrayList.size();i++)
        {
            if (isStable(arrayList.get(i)))
            {
                stable+=arrayList.get(i);
            }
            else
            {
                unstable+=arrayList.get(i);
            }
        }
        result=stable-unstable;
        return result;
    }

}
