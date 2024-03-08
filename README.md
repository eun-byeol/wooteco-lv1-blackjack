# java-blackjack

블랙잭 미션 저장소

## 우아한테크코스 코드리뷰

- [온라인 코드 리뷰 과정](https://github.com/woowacourse/woowacourse-docs/blob/master/maincourse/README.md)

## 용어 정리

- CardDispenser : 카드 지급기
- Hit : 카드를 더 뽑는 것
- Stay : 카드를 더 뽑지 않고 차례를 마치는 것
- Blackjack : 처음 두 장의 카드 합 21이 되는 것
- Burst : 21점 초과로 게임 오버 되는 것
- Push : 무승부. 딜러와 플레이어의 점수가 동일

## 기능 목록

### 딜러

- [x] 처음에 받은 2장의 합계가 16점 이하이면 카드를 1장 획득

### 플레이어

- [x] 플레이어 등록
    - [x] 플레이어는 1명 이상
    - [x] 플레이어 이름 중복 불가
- [x] 21을 넘지 않을 때까지 Hit 가능

### 블랙잭 게임

- 게임 준비
    - [x] 게임 시작 시 딜러와 플레이어에게 카드 2장 지급

- 게임 진행
    - [x] 각 플레이어에게 추가 카드 지급
    - [x] 최초 딜러의 카드 합이 16점 이하이면 카드를 1장 지급

- 게임 종료
    - [x] 카드 합이 21 또는 21에 가깝게 스코어 계산
        - Ace는 11로 계산 가능

- 승무패 결정
  - 카드 합이 21 또는 21에 가까운 사람이 승리
  - 딜러와 플레이어 모두 burst 되거나 점수가 동일하면 무승부
  - 딜러가 burst 되면 플레이어 승리
  - 플레이어가 burst 되면 딜러 승리

### 카드 디스펜서

- [x] 랜덤으로 숫자와 모양을 뽑아 카드 1장 지급
- [x] 랜덤으로 숫자와 모양을 뽑아 카드 여러장 지급

### 카드

- [x] 카드 생성
    - [x] 숫자와 모양을 가짐
    - [x] 숫자는 2~10와 A,J,K,Q 중 하나
    - [x] 모양은 하트,클로버,다이아,스페이드 중 하나

### 카드 뭉치

- [x] 카드 숫자 합 계산
    - King, Queen, Jack은 각 10으로 계산
    - Ace는 1로 계산

### 입력

- [x] 게임에 참여할 사람 이름 입력
    - [x] 이름은 쉼표를 기준으로 분리
    - [x] 이름 앞 뒤 공백 제거

- [x] Hit 여부 입력
    - [x] y 와 n 이외의 문자 입력

- [x] 올바른 입력이 들어올 때까지 재입력

### 출력

- [x] 처음 받은 카드 2장 출력
- [x] Hit 후 보유한 카드 출력
- [x] 딜러의 카드 획득 여부 출력
- [x] 최종 카드 현황 및 결과 출력
- [x] 최종 승패 출력
