## 자동차 경주 게임
### 기능 구현 목록

##### 자동차 이름 입력
- `,`를 기준으로 구분
- 자동차 이름은 5자리 이하만 허용

##### 횟수 입력
- 숫자만 입력 가능 
- 0은 입력 불가능

##### 게임 진행
- 각 횟수마다 `0~9` 사이에서 random을 받음
- `전진`: `4`이상일 경우
- `정지`: `3`이하인 경우

##### 우승 안내
- 최종 우승자표출
- 우승자가 한 명 이상일 경우 `,` 구분하여 출력

##### 예외 사항
- 사용자가 잘못된 값을 입력한 경우 `IllegalArgumentException` 발생 및 `[ERROR]`로 시작하는 에러 메시지 출력
