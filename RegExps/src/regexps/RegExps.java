/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package regexps;

import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author SharpSchnitzel
 */
public class RegExps {

    /**
     * @param args the command line arguments
     */
    
    public static int getRandomInt(int precision) {
        return (int)(Math.random() * precision);
    }
    
    public static String getAsciiByInt(int value) {
        return Character.toString((char) value);
    }
    
    public static String generateString(String format) {
        String result = "";
        for (int i = 0; i < format.length(); i++) {
            switch (format.charAt(i)) {
                case 'w':
                    String lowerCase = getAsciiByInt(97 + getRandomInt(25));
                    String upperCase = getAsciiByInt(65 + getRandomInt(25));
                    result += new Random().nextBoolean() ? lowerCase : upperCase;
                    break;
                case 'd':
                    result += getRandomInt(9);
                    break;
                default:
                    result += format.charAt(i);
                    break;
            }
        }
        
        return result;
    }
    
    public static void processString(String input) {
        
        try {
            if (input.matches("^1{4}.*")) {
                throw new IllegalExpressionException("Строка не может начинаться с четырёх единиц. (получено: " + input + ")");
            }
            if (!input.matches("(\\d{4}-[a-zA-Z]{3}-){2}(\\d[a-zA-Z]){2}")) {
                throw new InvalidFormatException("Неверный формат строки. (получено: " + input + ")");
            }
        } catch (IllegalExpressionException ex) {
            System.out.println("Обработка неверного начала строки " + input);
            /*if (!input.matches("(\\d{4}-[a-zA-Z]{3}-){2}(\\d[a-zA-Z]){2}")) {
                throw new InvalidFormatException("Неверный формат строки", ex); //типа chain
            }*/
        } catch (InvalidFormatException ex) {
            System.out.println("Обработка неверного формата строки. " + input);
        } finally {
            System.out.println("\n######################################################################\n");
        }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        // 97 - 122 # 65 - 90
        /*String format = "(\\d{4}-[a-zA-Z]{3}-){2}(\\d[a-zA-Z]){2}";
        String incorrect = generateString("www-ddd# dd- 22 ww");
        String correct = generateString("dddd-www-dddd-www-dwdw");
        
        System.out.println("###########################################################");
        System.out.println("# Формат строки: '2222-aaa-3333-bbb-4c5d'");
        System.out.println("# Строка " + incorrect + (incorrect.matches(format) ? "" : " не") + " соответствует формату");
        System.out.println("# Строка '" + correct + (correct.matches(format) ? "'" : "' не") + " соответствует формату");
        
        Pattern p = Pattern.compile("\\d{4}");
        Matcher m = p.matcher(correct);
        
        System.out.print("# Вывод первых двух блоков цифр: ");
        while (m.find()){
            System.out.print(m.group());
        }
        
        System.out.println("\n# Вывод с заменой букв на звездочки: " + correct.replaceAll("[a-zA-Z]{3}", "***"));
        System.out.println("# Вывод буквенных символов в формате yyy/yyy/y/y: " + correct.replaceAll("-?\\d{4}-?|-\\d|\\d", "/").substring(1));
        */
        
        String case1 = generateString("1111-www-dddd-www-dwdw");
        String case2 = generateString("21dwf3###-www-S_2fDDz3W");
        processString(case1);
        processString(case2);
        
        
    }
    
}
