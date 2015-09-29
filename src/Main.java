/**
 * Created by sdeshpande on 29/09/2015.
 */

import generics.Box;

import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args){

        Box box = new Box();
        box.set("a string");
        String item = box.get(); // String item = (String) box.get();
        System.out.print(item);

        List list = new ArrayList();
        list.add("hello");
        String s = list.get(0);

    }

}
