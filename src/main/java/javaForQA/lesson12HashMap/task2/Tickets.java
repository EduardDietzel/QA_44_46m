package javaForQA.lesson12HashMap.task2;

import java.util.HashMap;
import java.util.Map;

public class Tickets {

    public static void main(String[] args) {

//        Найти маршрут из заданного списка билетов
//        Учитывая список билетов, найти маршрут по порядку, используя данный список.
//        Вход:
//        «Berlin» -> «London»
//        «Tokyo» -> «Seoul»
//        «Mumbai» -> «Berlin»
//        «Seoul» -> «Mumbai»
//
//        Выход:
//        Tokyo->Seoul, Seoul->Mumbai, Mumbai->Berlin, Berlin->London

        Map<String, String> flights = new HashMap<>();

        flights.put("Berlin", "London");
        flights.put("Tokyo", "Seoul");
        flights.put("Mumbai", "Berlin");
        flights.put("Seoul", "Mumbai");

        String startCity = getStartCity(flights);
        System.out.println(startCity);
        System.out.println(getRoute(flights, startCity));
    }

    // метод для нахождения города, с которого стартует маршрут
    public static String getStartCity(Map<String, String> flightMap){
        for (String city : flightMap.keySet()) {
            if (!flightMap.values().contains(city)){
                return city;
            }
        }
        return null;
    }

    public static String getRoute(Map<String, String> flightMap, String startCity){
        // Tokyo -> Seoul, Seoul -> Mumbai, Mumbai -> Berlin, Berlin -> London
        StringBuilder builder = new StringBuilder();
        while (flightMap.get(startCity) != null){
            builder.append(startCity).append(" -> ");
            String city = flightMap.get(startCity);
            builder.append(city).append(", ");
            startCity = city;
        }
        builder.setLength(builder.length() - 2);
        return builder.toString();
    }
}
