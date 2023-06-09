package com.sda.she_likes_java.final_project.configuration;

import com.sda.she_likes_java.final_project.entity.PriceCategory;

import java.util.HashMap;
import java.util.Map;

public class CarRecordConfig {
    private final static Map<PriceCategory,Long> categoryPricePerDayInEuroCents =new HashMap<>();

    public static long getPricePerDayInEuroCents(PriceCategory category){
       return categoryPricePerDayInEuroCents.get(category);
    }
    //execute this block just once during class loading
    //STATIC BLOCK
    static {
        //populate our map
        categoryPricePerDayInEuroCents.put(PriceCategory.LIMOUSIN,100_000l);
        categoryPricePerDayInEuroCents.put(PriceCategory.LUXURY,10_000l);
        categoryPricePerDayInEuroCents.put(PriceCategory.ECONOMICAL,100l);
        categoryPricePerDayInEuroCents.put(PriceCategory.COMFORT,1000l);

    }

}
