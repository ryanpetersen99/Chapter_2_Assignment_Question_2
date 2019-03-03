package za.ac.cput.projectone;

import java.util.*;

/**
 * Ryan Petersen
 * 217027806
 * 3G
 * Chapter 2 Question 2
 */
    interface MyInterface{

        void Run();
        List list();
    }

    class SortedArray implements MyInterface{

        private List sortedArray;

        @Override
        public List list() {
            sortedArray = new ArrayList<>();
            sortedArray.add(100);
            sortedArray.add(55);
            sortedArray.add(67);
            sortedArray.add(1);
            sortedArray.add(34);
            sortedArray.add(57);
            sortedArray.add(28);
            sortedArray.add(79);
            Collections.sort(sortedArray);
            return sortedArray;
        }
        public void Run() {
            System.out.println("A sorted list of numbers: " + list());
        }


    public static void main( String[] args )
    {
        MyInterface mi = new SortedArray();
        mi.Run();
    }

    }