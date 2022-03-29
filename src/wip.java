import java.util.*;

public class wip {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("test_user_1", "test_user_2", "test_user_3", "test_user_4", "test_user_5", "test_user_6"));

        List<List<String>> listOfList = new ArrayList<>();


        for (int i = 0; i < list.size(); i += 2) {

            List<String> tempList = new ArrayList<>();
            for (int j = 0; j < 1; j++) {

                tempList.add(list.get(i));
                tempList.add(list.get(i + 1));

            }
            listOfList.add(tempList);
        }
        System.out.println("listOfList = " + listOfList);

        String participantadd = "";
        for (int i = 0; i < listOfList.size() ; i++) {

            for(int j = 0; j<1; j++) {
                participantadd = participantadd + "," + "{team1Id:" + listOfList.get(i).get(j) + "," +
                        "team2Id:" + listOfList.get(i).get(j+1) + "}";

            }

        }System.out.println("participantadd = " + participantadd.substring(1));
    }

}