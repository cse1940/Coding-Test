# Java 정리

### 1. 변수

1) 변수는 값을 저장하는 메모리 공간
   - 값을 할당
   - 값을 변경
2) 변수 선언
   - [데이터 타입] [변수 이름]
     - int : 정수
     - String : 문자열
     - double : 부동소수점
3) 변수 정의
   - 초기값을 할당
   - 할당 : 메모리에 변수를 생성

4. 변수 선언과 정의를 한 번에
   - [데이터 타입] [변수 이름] = 초기값
   - ex) int studentNum = 500; 
5. 변수를 사용한 계산
   - 계산된 결과 값이 변수에 할당됨
   - [변수] = [계산식]
   - ex) avg = (gradeJava + gradeC) / 2;



### 2. 상수

1. 상수는 변하지 않는 수
   - static final [데이터 타입] [변수 이름] = [상수값]
   - ex) static final double PI = 3.1415;
2. 함수 내 상수 정의
   - 문법은 동일하나 추천하지 않음
   - ex) final int MAX_INTEGER = Integer.MAX_VAULE;



### 3. 데이터 타입

- 정수형 데이터 타입
  - int
  - long
  - short
  - Byte
- 실수형 데이터 타입
  - double
  - float
- 문자형 데이터 타입
  - char(유니코드 문자)
  - String(문자열)
- 불린형 데이터 타입
  - boolean(true / false)



### 4. 연산자

- 산술 연산자
  - 덧셈(+)
  - 뺄셈(-)
  - 곱셈(*)
  - 나눗셈(/)
  - 나머지(%)
  - 1증가(++)
  - 1감소(--)
- 정수형(int) 변수에 결과를 저장하면 소수점은 생략됨
  - 몫을 구할 수 있음
  - 나머지는 % 연산자를 활용
- 대입(=) 연산자
  - +=, -=, *=, /=, %= 모두 가능
  - 우측의 계산 결과를 좌측에 대입
    - 정수형
    - 문자형
    - 실수형 데이터 타입 모두 가능
  - System.out.println()으로 출력할 때 각 변수는 + 기호로 구분함
  - 각 문장은 세미콜론(;)으로 구별
    - v += 3;
    - System.out.println(...)은 각각 실행됨
- 비교 연산자
  - 두 숫자의 값을 비교
  - 같다(==)
  - 다르다(!=)
  - 크다(>)
  - 작다(<)
  - 같거나 크다(>=)
  - 같거나 작다(<=)
- 논리 연산자
  - AND(&&)
  - OR(||)
  - NOT(!)
- 비트 연산자
  - 비트 AND(&)
    - 1010 & 0001 = 0000(십진수 0)
    - 1010 & 0010 = 0010(십진수 2)
  - 비트 OR(|)
    - 111 | 1000 = 1111(십진수 23)
    - 100 | 111 = 111(십진수 15)



### 5. 데이터의 입력과 출력

- int 데이터 입력 받기

  - java.util.Scanner 클래스

  - import java.util.Scanner 문 필요

    

  - Scanner s = new Scanner(System.in)

  - System.in 은 표준 입력을 의미

    

  - s.nextInt() 메서드를 호출하면 사용자가 입력한 int 값을 받을 수 있음

- double 데이터 입력 받기

  -  s.nextDouble() 메서드를 호출하면 사용자가 입력한 double 값을 받을 수 있음

- String 데이터 입력 받기

  - s.nextLine() 메서드를 호출하면 사용자가 입력한 String 값을 받을 수 있음



### 6. 배열

- 배열은 동일한 데이터 타입의 여러 값을 보관

  - ex) int[] grades = {1, 2, 3, 4}

  - 배열 변수에는 대괄호[] 가 붙음
  - 초기값은 중괄호{} 로 정의함
  - 배열에는 길이가 있음
    - grades 배열의 길이는 4

- grade 변수는 int[] 타입

  - int[]는 int 형 배열

- 배열의 첫 번째 값

  - grades[0]

- 배열의 N 번째 값

  - grades[N-1]

- int 값을 나누면 int 값이 되기 때문에 (double)로 강제 형 변환함



- double 형 배열
  - double 형 배열에는 double 값만 들어갈 수 있음
- 배열 선언
  - double[] sensorData
- 배열 정의
  - sensorData = new double[] {1,0, 2,2, 3.1}
- 배열의 길이
  - sensorData.length
- 마지막 배열의 인덱스
  - sensorData.length -1



- String 형 배열
  - String 형 배열에는 String 값만 들어갈 수 있음
- 배열 선언
  - String[] cities = new String[10]
  - 이 배열에는 10개의 데이터만 넣을 수 있음
  - index 범위: 0~9
- 배열의 값 할당
  - int idx = 0
  - Cities[idx++]
    - 배열의 인덱스를 자동으로 증가
- Scanner 객체 사용 후 닫기
  - s.close() 반드시 호출 해줘야 함



### 7. for문

- for문은 반복문
  - 다수의 데이터(배열 등)를 손쉽게 처리할 수 있음
- for 문법
  - for(초기화식; 조건식; 증감식)
  - ex) for(int idx=0; i<count; ++i) 
    - count 만큼 반복
- count 만큼 도시명 입력을 반복
  - cities[] 배열 변수에 입력 값을 저장
- 결과 출력
  - 입력한 도시의 개수 : count
  - 첫 번째 도시명 : cities[0]
  - 마지막 도시명 : cities[count -1]
- 피보나치 수열
  - 1, 1, 2, 3, 5, 8 ...
  - A(n) = A(n-1) + A(n-2)
  - 처음 두개의 수는 1로 시작
  - 그 다음 앞의 두 수를 더하여 다음 수를 결정
- 생성하는 수열 개수를 입력 받음
  - count 변수에 저장
- 피보나치 수열 생성
  - 반복 횟수 : count -2
  - fibonacci[i+2] = a + b
  - 다음 계산을 위해 변수 a, b의 값을 할당
- 생성된 수열 출력
  - 반복 횟수 : num
- for each 문
  - 간결한 문법의 for 문
  - for([원소 데이터 타입] [변수 이름] : [배열])
  - for(int num : fibonacci)
- 가독성이 좋은 for each 문을 권장
  - (주의) for each 문안에서는 배열 데이터를 변경하면 안됨



### 8. if문

- if 조건문

  - 특정 조건이 맞을 때만 실행됨

  - if(조건) {

    ​	조건이 맞을 때 실행됨

    }

  - 실행문이 1개인 경우 중괄호{} 생략 가능

- if else 조건문

  - if(조건) {

    ​	조건이 맞을 때 실행됨

    } else if(조건2) {

    ​	조건2가 맞을 때 실행됨

    } else {

    ​	모든 조건이 맞지 않을 때 실행됨

    }



### 9. while문

- for와 유사한 반복문

  - for문보다 단순함

  - while(조건) {

    ​	조건이 맞는 동안 실행됨

    }

  - 무한 반복을 주의해야 함
    - while 문에 있는 변수(i)를 반드시 갱신해줘야 함
    - i 변수 초기값 : 1
    - i 가 9보다 같거나 작은지 확인
    - i 를 1증가
  - while 문으로 배열 접근하기
  - ```반복 횟수```는 number.length 만큼
  - while 문이 반복될 때
    - i 변수는 1증가

### 9-1. while문 - continue

- (주의) 무한 반복하는 예제!
  - 무한 반복시 프로그램이 멈추는 문제 발생
  - 강제로 프로세스를 종료해주어야 함
- continue 문
  - 다음 반복으로 넘어감
  - continue 아래의 문장 실행을 생략함
  - continue 실행을 하기 전에 i 변수를 적절하게 처리해야 함

- continue 문은 for 문에서도 사용할 수 있음
- for 문에서 continue를 사용할 때는 무한 반복을 걱정하지 않아도 됨

### 9-2. while문 - break

- break 문
  - 반복문에서 break를 만나면 반복이 즉시 중단됨
  - 반복문 그 다음 내용이 실행됨
- break 문은 for, while 문 모두에서 사용 가능

### 9-3. while문 - do while

- do while 문은 while 문의 변형

  - do {

    ​	실행문

    } while(조건)

- while 문은 조건을 만족해야 실행되지만 do while 문은 조건이 만족하지 않아도 최초 1회는 실행됨을 보장

- 실행되고 조건을 검사하는 것이 다름

- System.out.println()이 무조건 1번은 실행됨



### 10. switch문

- switch 문은 if 문의 특수화

- switch(변수) {

  case 조건1:

  ​	조건1이 맞으면 실행

  ​	break;

  case 조건N:

  ​	조건N이 맞으면 실행

  ​	break;

  default:

  ​	조건이 맞지 않으면 실행

  }

- 변수는 기본 데이터형과 String 가능
  - int, long, short 등
  - double, float 등
  - String
- for 문과 switch 문을 조합하면
  - 배열에서 값을 읽어
  - 그 값을 기준으로 조건 처리 가능
  - ```if 문보다 간결한 표현 가능```

- switch의 case 조건에서 break를 생략하면?
  - fall-through
- 일반적으로는 모든 case에 break를 붙여야 함
- 의도된 것인지? 누락된 것인지?
  - 관습적으로 // fall-through 주석을 붙여줌
  - 그 외에는 누락된 겨우로 봐야 함



### 11. 함수와 String 클래스

1. 함수의 개념
   - 함수는 어떤 입력을 받아 결과를 반환하는 프로그램의 단위
     - 입력
     - (함수의 로직)
     - 출력

- 짝수, 홀수 판별기
  - 함수 적용 전
  - 짝수 : (num % 2) == 0
  - 홀수 : (num % 2) == 1 (!= 0)
  - 프로그램의 묘미는 프로그램 전체를 유기적인 부분으로 구성할 수 있음
  - ex) 인체의 장기
    - 입으로 음식을 먹고 -> 식도를 거쳐 -> 음식물을 소화 -> 역할을 분담
- static 키워드
  - 상수 선언
    - ex) PIE = 3.141592
  - static 함수 선언
    - 객체를 만들지 않고 함수 호출 가능
- scope(범위)의 개념
  - 지역 변수
    - 함수 내부에서만 사용 가능
    - 함수 실행이 끝나면 자동 해제됨
  - 멤버 변수
    - 객체 내부에서 사용
  - static 변수
    - 객체 없이 호출 가능
  - 괄호의 scope
    - 괄호 내에서만 사용
  - 다른 메서드에 있는 변수는 호출 불가

2. 함수로 생각하기(함수 명세표)

- 함수의 구성 요소

  1. 입력
  2. 처리
  3. 반환(반환 데이터가 없을 때는 void)

- 함수 명세표

  ex) 함수의 목적: 임의의 수열을 출력한다

  ​	  함수의 이름: printNumbersi()

  ​      함수의 입력: 숫자 배열

  ​      함수의 출력: 없음

  ​      반환 데이터 타입: 없음

3. String 타입

- String은 문자열
  - 문자열로 이름 입력 받기
  - String name = s.nextLine()
- String은 문자열 변수
  - String station = "광화문";
- String은 길이를 가짐
  - length() 메서드
  - ex) int len = java.length();
- String은 char로 이루어짐
  - charAt() 메서드 -> String으로 저장된 문자열 중에서 한 글자만 선택해 char 타입으로 변환
- String은 다른 String 값으로 재할당 할 수 있음

- String 클래스의 주요 메서드

| 메서드        | 반환형  | 내용                                                         |
| ------------- | ------- | ------------------------------------------------------------ |
| length()      | int     | 문자열의 길이를 반환                                         |
| charAt()      | char    | 특정 위치의 char를 반환                                      |
| substring()   | String  | 문자열의 일부를 반환                                         |
| equals()      | boolean | 두 문자열의 내용이 같은지 확인                               |
| indexOf()     | int     | 입력받은 char 혹은 String의 대상 문자열에 나타나는 첫 번째 위치를 반환, 만약 존재하지 않으면 -1 |
| lastIndexOf() | int     | 입력받은 char 혹은 String의 대상 문자열에 나타나는 마지막 위치를 반환, 만약 존재하지 않으면 -1 |
| startsWith()  | boolean | 대상 문자열이 인자로 입력받은 문자열로 시작하는지 여부 확인  |
| endsWith()    | boolean | 대상 문자열이 인자로 입력받은 문자열로 끝나는지 여부 확인    |
| replace()     | String  | 문자열 내부의 특정 문자열을 다른 문자열로 교체               |
| isEmpty()     | boolean | 문자열이 비어 있는지 확인                                    |

