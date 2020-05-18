package services;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class DictionaryService {
    private static Map<String, String> dic = new HashMap<>();
    static {
        dic.put("Hello","Xin Chao");
        dic.put("Goodbye", "Tam biet");
    }
    public String search(String word){
        return dic.get(word);
    }
}
