package com.walking.counterAggregation;

/*
Разработать программу в рамках компании com.walking, позволяющую следить за
счетчиками на газ, холодную воду, горячую воду и электричество.
Обозначение программы в рамках компании — counterAggregation.

Используя за основу задачу из темы про классы и объекты (ссылка на разбор),
реализовать класс счетчика, который хранит название счетчика и его значение, его
единицы измерения, а также обеспечивает доступ к значениям. Название счетчика
и его единицы измерения должны быть неизменны.
*/

import com.walking.counterAggregation.creator.CounterCreator;
import com.walking.counterAggregation.service.CounterService;

/**Также реализовать сервис CounterService, зона ответственности которого —
хранение массива доступных счетчиков, получение всех доступных счетчиков,
получение доступа к счетчику по названию, увеличение значения счетчика на
единицу или заданное значение, а также сброс счетчика до нулевого значения.

Ответственность класса, содержащего main() — создание счетчиков. Сам класс
также предлагаю назвать Main.

Также реализовать в классе Main приватный метод, который позволяет вывести
значения счетчиков в виде: <Название счетчика>: <Значение счетчика>. Например:
Газ: 2333
Горячая вода: 0
Холодная вода: 23
 */
public class Main {
    public static void main(String[] args) {


        CounterCreator gas = new CounterCreator("Gas", "m³");
        CounterCreator hotWater = new CounterCreator("Hot water", "m³");
        CounterCreator coldWater = new CounterCreator("Cold Water", "m³");
        CounterCreator electricity = new CounterCreator("Electricity", "kW/h");

        CounterService newArray = new CounterService(gas, hotWater, coldWater);

        newArray.setArray(electricity);

        System.out.println(newArray.getCounter("Gas"));
        System.out.println(gas.getInfo());


    }

    private static void printInfo(CounterCreator o) {
        System.out.println(o.getInfo());
    }
}