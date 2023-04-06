import java.util.ArrayList;
import java.util.Scanner;


public class Main
{

    public static ArrayList<Integer> union(ArrayList<Integer> list1, ArrayList<Integer> list2)
    {
        ArrayList<Integer> totalList = new ArrayList<Integer>();
        for(int i=0; i< list1.size(); i++)
        {
            totalList.add(list1.get(i));
        }
        for(int i=0; i< list2.size(); i++)
        {
            totalList.add(list2.get(i));
        }
        return totalList;

    }


    public static void main(String[] args)
    {
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();


        Scanner scan = new Scanner(System.in);
        System.out.print("Enter five integers for List 1: ");
        for(int i=0; i<5; i++)

        {
            list1.add(scan.nextInt());
        }
        System.out.print("Enter five integers for List 2: ");
        for(int i=0; i<5; i++){
            list2.add(scan.nextInt());
        }

        ArrayList<Integer> totalList = union(list1, list2);
        System.out.print("The combined list is: ");
        for(int i=0; i<totalList.size(); i++){
            System.out.print(totalList.get(i)+" ");
        }
        System.out.println();
    }




}