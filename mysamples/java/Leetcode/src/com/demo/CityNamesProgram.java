
package com.demo;

import java.util.ArrayList;
import java.util.Iterator;

public class CityNamesProgram {
	public static void main(String[] args) {
       
        ArrayList<String> cityNames = new ArrayList<>();
        cityNames.add("New York");
        cityNames.add("London");
        cityNames.add("Paris");
        cityNames.add("Tokyo");

       
        Iterator<String> iterator = cityNames.iterator();

        
        System.out.println("City Names:");
        while (iterator.hasNext()) {
            String cityName = iterator.next();
            System.out.println(cityName);
        }
        //iterator.next();
        Iterator<String> iterator1 = cityNames.iterator();

        
        System.out.println("City Names:");
        while (iterator1.hasNext()) {
            String cityName = iterator1.next();
            System.out.println(cityName);
        }
    }

}
