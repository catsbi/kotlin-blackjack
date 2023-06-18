# kotlin-blackjack

# 2단계 - 블랙잭
## 기능 요구사항
> 블랙잭 게임을 변형한 프로그램을 구현한다. 블랙잭 게임은 딜러와 플레이어 중 카드의 합이 21 또는 21에 가장 가까운 숫자를 가지는 쪽이 이기는 게임이다.

- 게임을 시작하면 플레이어는 두 장의 카드를 지급 받으며, 두 장의 카드 숫자를 합쳐 21을 초과하지 않으면서 21에 가깝게 만들면 이긴다.   
  21을 넘지 않을 경우 원한다면 얼마든지 카드를 계속 뽑을 수 있다.
- 카드의 숫자 계산은 카드 숫자를 기본으로 하며, 예외로 Ace는 1 또는 11로 계산할 수 있으며, King, Queen, Jack은 각각 10으로 계산한다.

- [ ] 플레이어 인터페이스를 가진다.
  - [ ] 이름과 덱, 점수 프로퍼티를 가진다.
    - [ ] 카드 추가 기능을 정의한다.
    - [ ] 카드 점수 계산 기능을 정의한다.
    - [ ] 카드 추가 가능여부 조회 기능을 정의한다. 
- [ ] 플레이어를 구현하는 게이머 객체를 가진다. 
  - [ ] 현재 점수가 21점 이상인 경우 카드 추가시도시 예외를 던진다. 
  - [ ] 현재 점수가 21점 미만인 경우 카드를 추가할 수 있다.
- [ ] 플레이어를 구현하는 딜러 객체를 가진다.
  - [ ] 현재 점수가 21점 이상인 경우 카드 추가시도시 예외를 던진다.
  - [ ] 현재 점수가 21점 미만인 경우 카드를 추가할 수 있다.
- [ ] 플레이어 일급 컬렉션 객체를 가진다.
- [ ] 카드 인터페이스를 가진다.
  - [ ] 심볼, 이름, 점수 프로퍼티를 가진다.  
  - [ ] 점수 조회 기능을 정의한다. 
- [ ] 카드를 구현하는 인물카드 객체를 가진다.
  - [ ] 인물 카드는 모두 10점을 반환한다.
  - [ ] 이름은 심볼 타입의 첫 글자를 소문자로 반환한다.
- [ ] 카드를 구현하는 에이스 카드 객체를 가진다.
  - [ ] 이름은 A를 반환한다.
  - [ ] 포인트는 1점과 11점중 현재점수와 합산해 21점에 가까운 점수를 반환한다.
- [ ] 카드를 구현하는 숫자 카드 객체를 가진다.
  - [ ] 2 ~ 9 사이의 값을 전달하면 정상적으로 생성된다.
  - [ ] 2 ~ 9 이외의 값을 전달하면 예외를 던진다.
  - [ ] 숫자가 이름이 된다.
  - [ ] 포인트는 오직 자기 숫자 정보를 반환한다.
- [ ] 카드 일급 컬렉션 덱 객체를 가진다. 
  - [ ] 카드 추가를 할 수 있다.
  - [ ] 카드 제거를 할 수 있다.
  - [ ] 점수 계산을 할 수 있다.
- [ ] 게임 진행 컨트롤러를 가진다. 
  - [ ] 최초 플레이어들에게 2장씩 배분해줄 수 있다. 
  - [ ] 플레이어를 순회하며 가능한 경우 카드를 뽑을지 물어본다.
    - [ ] 플레이어의 현재 점수가 21점 미만인 경우 가능하다고 판단한다.
    - [ ] 플레이어의 현재 점수가 21점 미만이지만, 원하지 않을 경우 다음 플레이어로 넘어간다.
    - [ ] 플레이어의 현재 점수가 21점 이상인 경우 다음 플레이어로 넘어간다.
    - [ ] Y, N외의 답변을 하면 다시 물어본다.
  - [ ] 순회가 끝나면 결과를 출력한다.


## 프로그래밍 요구 사항
- 모든 기능을 TDD로 구현해 단위 테스트가 존재해야 한다. 단, UI(System.out, System.in) 로직은 제외
- indent(인덴트, 들여쓰기) depth를 2를 넘지 않도록 구현한다. 1까지만 허용한다.
- 모든 엔티티를 작게 유지한다.
- 함수(또는 메서드)의 길이가 15라인을 넘어가지 않도록 구현한다.
- 기능을 구현하기 전에 README.md 파일에 구현할 기능 목록을 정리해 추가한다.
- git의 commit 단위는 앞 단계에서 README.md 파일에 정리한 기능 목록 단위로 추가한다.

## 실행 결과
```text
게임에 참여할 사람의 이름을 입력하세요.(쉼표 기준으로 분리)
pobi,jason

pobi, jason에게 2장의 나누었습니다.
pobi카드: 2하트, 8스페이드
jason카드: 7클로버, K스페이드

pobi는 한장의 카드를 더 받겠습니까?(예는 y, 아니오는 n)
y
pobi카드: 2하트, 8스페이드, A클로버
pobi는 한장의 카드를 더 받겠습니까?(예는 y, 아니오는 n)
n
jason은 한장의 카드를 더 받겠습니까?(예는 y, 아니오는 n)
n
jason카드: 7클로버, K스페이드

pobi카드: 2하트, 8스페이드, A클로버 - 결과: 21
jason카드: 7클로버, K스페이드 - 결과: 17

```

# 1단계 - 코틀린 DSL
## 요구사항
```kotlin
introduce {
  name("박재성")
  company("우아한형제들")
  skills {
    soft("A passion for problem solving")
    soft("Good communication skills")
    hard("Kotlin")
  }
  languages {
    "Korean" level 5
    "English" level 3
  }
}
```
