/**
 * Created by sdeshpande on 29/09/2015.
 */

import generics.Box;

import java.util.ArrayList;
import java.util.List;
import java.net.URLDecoder;
public class characterEncoding {


    public static void main(String[] args){
//
//        Box box = new Box();
//        box.set("a string");
//        String item = box.get(); // String item = (String) box.get();
//        System.out.print(item);
//
//        List list = new ArrayList();
//        list.add("hello");
//        String s = list.get(0);


        String coded = "%e0%a4%b9%e0%a5%87 %e0%a4%a4%e0%a5%8d%e0%a4%af%e0%a4%be %e0%a4%9c%e0%a4%a8%e0%a4%b9%e0%a4%bf%e0%a4%a4%e0%a4%b5%e0%a4%be%e0%a4%a6%e0%a5%80 %e0%a4%a7%e0%a5%8b%e0%a4%b0%e0%a4%a3%e0%a4%be%e0%a4%9a%e0%a5%87 %e0%a4%a8%e0%a4%bf%e0%a4%a6%e0%a4%b0%e0%a5%8d%e0%a4%b6%e0%a4%95 %e0%a4%ae%e0%a4%be%e0%a4%a8%e0%a4%be%e0%a4%b5%e0%a4%af%e0%a4%be%e0%a4%9a%e0%a5%87 %e0%a4%95%e0%a4%be%e0%a4%af%3f %e0%a4%96%e0%a5%87%e0%a4%b0%e0%a5%80%e0%a4%9c%2c %e0%a4%85%e0%a4%9a%e0%a5%8d%e0%a4%9b%e0%a5%87 %e0%a4%a6%e0%a4%bf%e0%a4%a8%e0%a4%be%e0%a4%9a%e0%a5%8d%e0%a4%af%e0%a4%be %e0%a4%86%e0%a4%b6%e0%a5%8d%e0%a4%b5%e0%a4%be%e0%a4%b8%e0%a4%a8%e0%a4%be%e0%a4%9a%e0%a5%87 %e0%a4%95%e0%a4%be%e0%a4%af %e0%a4%9d%e0%a4%be%e0%a4%b2%e0%a5%87 %e0%a4%b9%e0%a4%be %e0%a4%aa%e0%a5%8d%e0%a4%b0%e0%a4%b6%e0%a5%8d%e0%a4%a8 %e0%a4%89%e0%a4%b0%e0%a4%a4%e0%a5%8b%e0%a4%9a. %e0%a4%a4%e0%a5%8d%e0%a4%af%e0%a4%be%e0%a4%9a%e0%a5%8d%e0%a4%af%e0%a4%be %e0%a4%89%e0%a4%a4%e0%a5%8d%e0%a4%a4%e0%a4%b0%e0%a4%be%e0%a4%9a%e0%a4%be %e0%a4%b5%e0%a4%bf%e0%a4%9a%e0%a4%be%e0%a4%b0 %e0%a4%ad%e0%a4%be%e0%a4%9c%e0%a4%aa%e0%a4%a8%e0%a5%87 %e0%a4%86%e0%a4%a4%e0%a4%be%e0%a4%aa%e0%a4%be%e0%a4%b8%e0%a5%82%e0%a4%a8%e0%a4%9a %e0%a4%95%e0%a4%b0%e0%a4%be%e0%a4%b5%e0%a4%be. %e0%a4%85%e0%a4%a8%e0%a5%8d%e0%a4%af%e0%a4%a5%e0%a4%be%2c %e0%a4%96%e0%a4%a8%e0%a4%bf%e0%a4%9c %e0%a4%a4%e0%a5%87%e0%a4%b2 %e0%a4%86%e0%a4%b2%e0%a5%87 %e0%a4%86%e0%a4%a3%e0%a4%bf %e0%a4%a1%e0%a4%be%e0%a4%b3%e0%a5%80 %e0%a4%97%e0%a5%87%e0%a4%b2%e0%a5%8d%e0%a4%af%e0%a4%be %e0%a4%85%e0%a4%b8%e0%a5%87 %e0%a4%b5%e0%a5%8d%e0%a4%b9%e0%a4%be%e0%a4%af%e0%a4%9a%e0%a5%87";

        try {
            String decoded = URLDecoder.decode(coded, "UTF-8");
            System.out.print(decoded);

        }
        catch (Exception err) {
            System.out.print("error");
        }


    }

}
