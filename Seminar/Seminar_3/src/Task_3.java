// Задание № 2.1
// 📌 Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями.
//📌 Вывести название каждой планеты и количество его повторений в списке.

//Задание № 2.2 (если выполнено первое задание)
//📌Пройти по списку из предыдущего задания и удалить повторяющиеся элементы

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task_3 {
    public static void main(String[] args) {
        List<String> planets = planetsList();
        uniquePlanetsCount(planets);
        deleteRepeatPlanet(planets);
        System.out.println(planets);
    }

    private static List<String> planetsList() {
        List<String> planets = new ArrayList<>();
        planets.add("Jupiter");
        planets.add("Earth");
        planets.add("Mars");
        planets.add("Jupiter");
        planets.add("Earth");
        planets.add("Jupiter");
        planets.add("Earth");
        planets.add("Venus");
        planets.add("Neptune");
        planets.add("Saturn");
        planets.add("Earth");
        planets.add("Uranus");
        planets.add("Mercury");
        planets.add("Mars");
        planets.add("Uranus");
        planets.add("Mars");
        return planets;
    }

    private static void uniquePlanetsCount(List<String> planets) {
        List<String> sortedPlanets = new ArrayList<>(planets);
        Collections.sort(sortedPlanets);
        int count = 1;
        String currentPlanet = sortedPlanets.get(0);
        for (int i = 1; i < sortedPlanets.size(); i++) {
            if (sortedPlanets.get(i).equals(currentPlanet)) {
                count++;
            } else {
                System.out.println(currentPlanet + ": " + count);
                count = 1;
                currentPlanet = sortedPlanets.get(i);
            }

        }
        System.out.println(currentPlanet + ": " + count);
    }

    private static void deleteRepeatPlanet(List<String> planets) {
        for (int i = 0; i < planets.size(); i++) {
            String currentPlanet = planets.get(i);
            for (int j = planets.size() - 1; j > i ; j--) {
                if(planets.get(j).equals(currentPlanet)) {
                    planets.remove(j);
                }
            }
        }
    }

}