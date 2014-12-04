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
        arrayList.add("text44");
        arrayList.add("text45");
        arrayList.add("text46");
        arrayList.add("text47");
        arrayList.add("text48");
        arrayList.add("text49");
        arrayList.add("text50");
        arrayList.add("text51");
        arrayList.add("text52");
        arrayList.add("text53");
        arrayList.add("text54");
        arrayList.add("text55");
    }
    
    private I18N(){
    }

    public static ArrayList<String> getArrayList() {
        return arrayList;
    }
    
}
