# 자동차 경주 게임
## 진행 방법
* 자동차 경주 게임 요구사항을 파악한다.
* 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 과제를 제출한다.

## 과제 제출 과정
* [과제 제출 방법](https://github.com/next-step/nextstep-docs/tree/master/precourse)

---

# 자동차 경주 게임
## 기능 요구사항
1. 각 자동차에 이름을 부여할 수 있다. 자동차 이름은 5자를 초과할 수 없다.
2. 전진하는 자동차를 출력할 때 자동차 이름을 같이 출력한다.
3. 자동차 이름은 쉼표(,)를 기준으로 구분한다.
4. 전진하는 조건은 0에서 9 사이에서 random 값을 구한 후 random 값이 4이상일 경우이다.
5. 자동차 경주 게임을 완료한 후 누가 우승했는지를 알려준다. 우승자는 한명 이상일 수 있다.
---

- [x] 랜덤 넘버 제너레이터 구현
- [x] Car 클래스 만들고 기능 구현 (move 등..)
- [x] Name 클래스 만들고 기능 구현 (1자 이상, 5자 이하 등..)
- [x] Position 클래스 만들고 기능 구현
- [x] 일급 컬렉션 만들기 List<Car>
- [x] 일급 컬렉션에서 자체적으로 MaxPosition, winner 구하는 기능 등 구현
- [x] View 구현 (input, 실행결과)
- [x] InputController에서 carList와 count 만들고 validation하는 기능 구현
- [x] Validator 구현
- [x] GameController에서 model과 view 구현
- [x] Application 구현한 뒤 잘 동작하는지 확인