package edu.javaRushCourse.JavaSyntax.level14.lesson4.Task314;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Требуется перепрограммировать корпоративную пирамиду, чтобы награды и заслуги получали те, кто больше вкладывает в успех корпорaкратии.
 *
 * Корпорaтивная пирамида предоставлена в виде мапы corporatePyramid, которая в качестве ключей принимает объекты типа Voter,
 * а в качестве значения — другую мапу.
 *
 * В классе Voter создаётся список из 100 голосующих, каждому из которых назначается персональное качество в случайном порядке.
 *
 * При создании объекта типа Rewards инициализируются две мапы с наградами.
 *
 * Для заполнения мапы corporatePyramid нам поможет метод setRewards, в котором нужно пройтись по списку голосующих и:
 *
 * Если персональное качество голосующего равно "Good", то добавить его объект в мапу corporatePyramid в качестве ключа,
 * а в качестве значения добавить мапу goodRewardsMap класса Rewards.
 * Если персональное качество голосующего равно "Holy", добавить его объект в мапу corporatePyramid в качестве ключа,
 * а в качестве значения добавить мапу holyRewardsMap класса Rewards.
 * Требования:
 * •	Не изменяй классы Voter и Rewards.
 * •	Метод setRewards должен работать согласно условию.
 */
public class Solution {
    static Map<Voter, Map<String, String>> corporatePyramid = new HashMap<>();

    public static void main(String[] args) {
        setRewards();
        printMap(corporatePyramid);
    }

    public static void setRewards() {
        List<Voter> voterList = Voter.generateVoters();
        Rewards vMap = new Rewards();
        Voter votKey;
        Map votValue;
        for (int i = 0; i < voterList.size(); i++) {
            if (voterList.get(i).getPersonalQuality().equals("Good")) {
                votKey=voterList.get(i);
                votValue = vMap.getGoodRewardsMap();
                corporatePyramid.put(votKey,votValue);
            } else if (voterList.get(i).getPersonalQuality().equals("Holy")) {
                votKey= voterList.get(i);
                votValue = vMap.getHolyRewardsMap();
                corporatePyramid.put(votKey,votValue);
            }
        }
    }

    public static void printMap(Map<?, ?> map) {
        map.forEach((key, value) -> System.out.println(key + " : " + value));
    }
}
