package model.logic;

import java.util.HashMap;

/**
 *
 * @author skuarch
 */
public class Approved {

    private static final HashMap<String,String> urls = new HashMap<>();
    
    static{    
        urls.put("login", "login");
        urls.put("authentication", "authentication");
        urls.put("scriptI18N", "scriptI18N");
        urls.put("logout", "logout");        
        urls.put("oldBrowser", "oldBrowser");        
        urls.put("noscript", "noscript");        
        urls.put("noscript", "noscript");        
        urls.put("notification", "notification");        
        urls.put("srinstaller", "srinstaller");        
        //urls.put("testNotifications", "testNotifications");                
        //urls.put("testNotificationsForm", "testNotificationsForm");                
    }

    public static HashMap<String, String> getUrls() {
        return urls;
    }
    
}
