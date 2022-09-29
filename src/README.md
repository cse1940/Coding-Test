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



### 7.

