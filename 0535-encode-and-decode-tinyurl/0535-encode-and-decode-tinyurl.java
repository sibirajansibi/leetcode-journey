import java.util.*;

class Codec {

    private static final String BASE = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    private Map<String, String> map = new HashMap<>();
    private Random rand = new Random();

    private String getKey() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 6; i++) {
            sb.append(BASE.charAt(rand.nextInt(62)));
        }
        return sb.toString();
    }

    public String encode(String longUrl) {
        String key = getKey();
        
       
        while (map.containsKey(key)) {
            key = getKey();
        }
        
        map.put(key, longUrl);
        return "http://tinyurl.com/" + key;
    }

   
    public String decode(String shortUrl) {
        String key = shortUrl.replace("http://tinyurl.com/", "");
        return map.get(key);
    }
}
