package algorithm.programmers.hash;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class BestAlbum {

    public static int[] solution(String[] genres, int[] plays) {

        HashMap<String, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < genres.length; i++) {
            hashMap.put(genres[i], hashMap.getOrDefault(genres[i], 0) + plays[i]);
        }
        int[] answer = new int[hashMap.size() * 2];
        // value 값으로 내림차순 람다식
        ArrayList<String> totalPlayList = new ArrayList<>(hashMap.keySet());
        totalPlayList.sort((o1, o2) -> hashMap.get(o2).compareTo(hashMap.get(o1)));

        ArrayList<Integer> answerList = new ArrayList<>();
        for(String key : hashMap.keySet()) {
            HashMap<Integer, Integer> playMap = new HashMap<>();
            for (int i = 0; i < genres.length; i++) {
                if(genres[i].equals(key)) {
                    playMap.put(i, plays[i]);
                }
            }
            ArrayList<Integer> mapVal = new ArrayList<>(playMap.keySet());
            mapVal.sort((o1, o2) -> playMap.get(o2).compareTo(playMap.get(o1)));

            for (int j = 0; j < 2; j++) {
                answerList.add(mapVal.get(j));
                System.out.println(mapVal.get(j));
            }
        }

        for (int y = 0; y < answer.length; y++) {
            answer[y] = answerList.get(y);
        }
        return answer;
    }

    public static int[] solution00(String[] genres, int[] plays) {

        HashMap<String, Integer> map = new HashMap<>();
        for(int i = 0; i < genres.length; i++) {
            map.put(genres[i], map.getOrDefault(genres[i], 0) + plays[i]);
        }

        //key 값만 가져와서 genre 에 넣어준다
        ArrayList<String> genre = new ArrayList<>(map.keySet());

        genre.sort((o1, o2) -> map.get(o2) - map.get(o1)); //key 값에 해당하는 value 를 내림차순으로 정렬한다.

        ArrayList<Integer> list = new ArrayList<>();
        for (String g : genre) {
            //해당 장르의 음악 중에서 play 횟수가 가장 큰 인덱스를 찾는다
            int max = 0;
            int firstIdx = -1;
            for (int j = 0; j < genres.length; j++) {
                if (g.equals(genres[j]) && max < plays[j]) {
                    max = plays[j];
                    firstIdx = j;
                }
            }

            //해당 장르의 음악 중에서 play 횟수가 두번째로 큰 인덱스를 찾는다.
            max = 0;
            int secondIdx = -1;
            for (int j = 0; j < genres.length; j++) {
                if (g.equals(genres[j]) && max < plays[j] && j != firstIdx) {
                    max = plays[j];
                    secondIdx = j;
                }
            }

            list.add(firstIdx);
            if (secondIdx >= 0) list.add(secondIdx); // secondIdx 는 존재 할수도, 안할수도 있다.
        }

        int[] result = new int[list.size()];
        for(int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }

    public static void main(String[] args) {
        String[] genres = {"classic", "pop", "classic", "classic", "pop"};
        int[] plays = {500, 600, 150, 800, 2500};
        int[] answer = {4, 1, 3, 0};
        int[] result = solution(genres, plays);
        int[] result00 = solution00(genres, plays);

        int a = 0;

        for (int i = 0; i < answer.length; i++) {
            if(answer[i] != result[i]) {
                a++;
            } else if(answer[i] != result00[i]) a++;
        }

        System.out.println(a == 0);
    }
}
