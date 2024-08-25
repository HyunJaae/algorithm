# 새로운 지식 모음
LeetCode 의 문제를 풀면서 새롭게 알게된 지식들을 정리하기 위한 공간입니다.

## ComputeIfAbsent()
- 문제 번호 : 0049
- 문제 이름 : Anagrams
- 난이도 : medium

java.util 패키지에 포함된 `Map` 인터페이스의 `default` 메소드입니다.
아래와 같이 구현되어 있습니다.
```java
default V computeIfAbsent(K key,
            Function<? super K, ? extends V> mappingFunction) {
        Objects.requireNonNull(mappingFunction);
        V v;
        if ((v = get(key)) == null) {
            V newValue;
            if ((newValue = mappingFunction.apply(key)) != null) {
                put(key, newValue);
                return newValue;
            }
        }

        return v;
    }
```
`key` 로 가져온 값이 `null` 인 경우, 파라미터로 전달된 `mappingFunction` 을 실행하고 그 결과 값을 `value` 로 `key` 와 함께 저장합니다.
`null` 이 아닌 경우엔 `key` 로 가져온 값을 그대로 반환합니다.

따라서 아래와 같이 호출하는 경우, `key` 에 해당하는 값이 있으면 `s` 값을 `value` 로 저장하고 없다면 새로운 리스트를 생성하여 저장합니다.
```java
results.computeIfAbsent(key, k -> new ArrayList<>()).add(s);
```