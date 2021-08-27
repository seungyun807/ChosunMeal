package chatbot.chosunmeal.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

interface JsonText {
    HashMap<String, Object> jsonText(String input);
}