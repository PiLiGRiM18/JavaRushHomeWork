package com.javarush.test.level08.lesson08.task05;

import java.util.HashMap;
import java.util.Map;

/* Удалить людей, имеющих одинаковые имена
Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя».
Удалить людей, имеющих одинаковые имена.
*/

public class Solution
{
    public static HashMap<String, String> createMap()
    {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("1Фамилия", "1Имя");
        map.put("2Фамилия", "2Имя");
        map.put("3Фамилия", "3Имя");
        map.put("4Фамилия", "3Имя");
        map.put("5Фамилия", "5Имя");
        map.put("6Фамилия", "6Имя");
        map.put("7Фамилия", "7Имя");
        map.put("8Фамилия", "8Имя");
        map.put("9Фамилия", "9Имя");
        map.put("10Фамилия", "10Имя");
        return map;
    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map)
    {

        HashMap<String, String> copy2 = new HashMap<String, String>(map);



            for (Map.Entry<String, String> pair : copy2.entrySet()) {
                String value = pair.getValue();
                removeItemFromMapByValue(map, value);
            }

    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value)
    {
        String key="";
        int e=0;
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair: copy.entrySet())
        {
            if ((pair.getValue().equals(value)&&(e==0))){
                e++;
                key=pair.getKey();
            }else
            if ((pair.getValue().equals(value))&&(e>0))
            {
                map.remove(key);
                map.remove(pair.getKey());
            }}
    }

    public static void main(String[] args){
        HashMap<String, String> tempMap = createMap();
        removeTheFirstNameDuplicates(tempMap);
        //removeItemFromMapByValue(tempMap, "5Имя");
        for (Map.Entry<String, String> pair : tempMap.entrySet()) {
            System.out.println(pair.getKey() + ":" + pair.getValue());
        }
    }
}
