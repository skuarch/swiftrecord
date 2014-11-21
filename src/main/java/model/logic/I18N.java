package model.logic;

import java.util.ArrayList;

/**
 *
 * @author skuarch
 */
public class I18N {
    
    private static final ArrayList<String> arrayList = new ArrayList<>();
    
    static{
        System.out.println("creating arrayList i18n");
        arrayList.clear();        
        arrayList.add("text12");
        arrayList.add("text13");
        arrayList.add("text14");
        arrayList.add("text15");
        arrayList.add("text20");
        arrayList.add("text21");
    }
    
    private I18N(){
    }

    public static ArrayList<String> getArrayList() {
        return arrayList;
    }
    
}
