package algorithm.programmers.hash;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;

public class BestAlbum {

    public static int[] solution(String[] genres, int[] plays) {
        int[] answer = {4, 1, 3, 0};
        // 장르별로 가장 많이 재생된 노래를 두 개씩 모아 베스트 앨범으로 만든다.
        // 노래는 고유 번호로 구분, 노래 수록 기준은 다음과 같다.
        // 1. 속한 노래가 많이 재생된 장르를 먼저
        // 2. 장르 내에서 많이 재생된 노래 먼저
        // 3. 장르 내에서 재생 횟수가 같은 노래 중에서는 고유 번호가 낮은 노래를 먼저 수록
        // genres 는 장르 배열, plays 는 노래 재생 횟수 배열
        // 베스트 앨범에 들어갈 노래의 고유 번호를 순서대로 return
        // genres[i] 는 고유 번호가 i 인 노래의 장르
        // plays[i] 는 고유 번호가 i 인 노래의 재생 횟수
        // 두 배열의 길이는 같다.

        HashMap<String, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < genres.length; i++) {
            hashMap.put(genres[i], hashMap.getOrDefault(genres[i], 0) + plays[i]);
        }
        System.out.println(hashMap);
        ArrayList<String> totalPlayList = new ArrayList<>(hashMap.keySet());
        // value 값으로 오름차순 람다식
        totalPlayList.sort(((o1, o2) -> hashMap.get(o2).compareTo(hashMap.get(o1))));

        for(String key : hashMap.keySet()) {

        }
        return answer;
    }

    public static void main(String[] args) {
        String[] genres = {"classic", "pop", "classic", "classic", "pop"};
        int[] plays = {500, 600, 150, 800, 2500};
        int[] answer = {4, 1, 3, 0};
        int[] result = solution(genres, plays);

        for (int i = 0; i < answer.length; i++) {
            System.out.println(answer[i] == result[i]);
        }
    }
}
