# 모던 자바인 액션  ### - CHAPTER 1 자바 8,9,10,11 : 무슨 일이 일어나고 있는가?

### 1.1 역사의 흐름은 무엇인가?

자바 8은 **간결한 코드(메서드 참조와 람다), 멀티코어 프로세서의 쉬운 활용**이라는 두 가지 요구사항을 기반으로 한다.

    - 스트림 API    - 메서드에 코드를 전달하는 기법   
- 인터페이스 디폴트 메소드

자바 8은 데이터베이스 질의 언어에서 표현식을 처리하는 것처럼 병렬 연산을 지원하는 스트림이라는 새로운 API를 제공한다. 데이터베이스 질의 언어에서 고수준 언어로 원하는 동작을 표현하면, 구현(자바에서는 스트림이 이 역활을 수행)에서 최적의 저수준 실행방법을 선택하는 방식으로 동작한다. 즉, 스트림을 이용하면 에러를 자주 일으키며 멀티코어 CPU를 이용하는 것보다 비용이 훨씬 비싼 키워드 synchronized 를 사용하지 않아도 된다.

### 1.2 왜 아직도 자바는 변화하는가?
    1. 스트림 처리API 2. 동작 파라미터화(일급시민)로 메서드에 코드전달 3. 디폴트메소드  
#### 1.2.1 프로그래밍 언어 생태계에서 자바의 위치
- 자바는 출발이 좋았다. 자바는 처음부터 스레드와 락을 이용한 소소한 동시성도 지원했다.   
  - (자바의 하드웨어 중립적인 메모리 모델 때문에 멀티코어 프로세서에서 병렬적으로 수행되는 스레드는 싱글코어에서의 동작과 달리 예기치 못한 상황을 일으킬 수 있다.)  
  - 코드를 JVM 바이트 코드로 컴파일하는 특징(그리고 모든 브라우저에서 가상머신코드를 지원하기때문)  
  위와같은 이유들로 인해 자바는 인터넷 애플릿 프로그램의 주요 언어가 되었다.

> 자바는 어떻게 대중적인 언어로 성장했는가?   
> 1990년대 당시 OOP는 캡슐화 덕분에 언지니어링적인 문제가 적고 정신적인 모델 덕분에 다른 프로그래밍 모델에 쉽게 대응할 수 있다는 두가지 장점들로인해 각광받고 있었다. 그리고 자바의 슬로건인 wora 덕분에 자바모델과 자바 코드 애플릿을 안전하게 실행할 수 있었던 초기 부라우저 덕분에 자바가 자바가 대학으로 쉽고 깊숙히 자리 잡을 수 있었고, 졸업생들이 자바를 업계에 황요하기 시작했다.

하지만, 빅데이터라는 도전에 직면하면서 병렬 프로세싱을 활용해야하는데 지금까지의 자바로는 대응 할 수 없었다.

#### 1.2.2 스트림 처리
스트림 이란? 한번에 한개씩 만들어지는 연속적인 데이터 항목들의 모임이다. 이론적으로 프로그램은 입력 스트림에서 데이터를 한개 씩 읽어 들이며 마찬가지로 출력스트림으로 데이터를 하나씩 기록한다.

>**스트림API의 핵심은 기존에는 한 번에 한 항목을 처리했지만 이제 자바8에서는 우리가 하려는 작업을 (데이터베이스 질의처럼) 고수준으로 추상화해서 일련의 스트림으로 만들어 처리 할 수 있다는 것이다. 또한 스트림 파이프라인을 이용해서 입력부분을 여러 CPU 코어에 쉽게 할당할 수있다는 부가적인 이득도 얻을 수 있다. 스레드라는 복자한 작업을 사용하지 않으면서 공짜로 병렬성을 얻을 수 있다.**

#### 1.2.3 동작 파라미터화로 메서드에 코드 전달하기
자바8에 추가된 두 번째 프로그램 개념은 코드의 일부를 API로 전달하는 기능이다. 스트림 API는 연산의 동작을 파라미터화할 수 있는 코드를 전달한다는 사상에 기초함으로 동작파라미터화는 매우 중요하다.
#### 1.2.4 병렬성과 공유 가변 데이터
세 번째 프로그래밍 개념은 '병렬성을 공짜로 얻을 수 있다'라는 말에서 시작된다. 세상에 공짜는 없다고 했는데 글머 병렬성을 얻는 대신 무엇을 포기해야할까? 스트림메서드로 전달하는 코드의 동작방식을 조금 바꿔야 한다.   
스트림 메서드로 전달되는 코드는 다른 코드와 동시에 실행하더라도 안전하게 실행될수 있어야 한다.(스레드 세이프) 보통 다른 코드와 동시에 실행하더라도 안전하게 실행 할 수 있는 코드를 만들려면 공유된 가변 데이터에 접근하지 않아야 한다. 이러한 함수를 순수함수, 부작용없는 함수, stateless 함수 (참고로 백엔드 개발의 기본원칙중하나가 stateless하게 설계하는 것이다.)
#### 1.2.5 자바가 진화해야 하는 이유
지금 까지 자바는 진화해왔다. 예를 들어 제네릭의 탄생(장점 : 컴파일타임에 더 많은 에러를 검출가능하고 와일드카드등으로 상하한 제한을 걸 수도 있다. 또는 DI 개념까지도 확장할 수 있다.+가독성) ,for-each 등 그것이 가져다 주는 편리함을 누리고 있다. 그리고 고전적인 객체지향 패러다임에서 벗어나 함수형 프로그래밍으로 다가섰다. 이로인해 두가지 패러다임의 장점을 모두 활용할 수 있게되었다. 즉, 언어는 하드웨어나 프로그래머의 기대에 부응하는 방향으로 변화해야한다는 것이다.

### 1.3 자바 함수
자바8에서는 함수의 새로운 값의 형식으로 추가했다. 멀티코어에서 병렬 프로그래밍을 활용할 수 있는 스트림과 연계될 수 있도록 함수를 만들었기때문이다. 먼저 함수를 값처럼(일급시민)처럼 취급한다. 자바 프로그래밍에서는 조작할수 없는 값인 리터럴 값이 있다. 예를 들어 primitive type, new 연산자로 생성된 인스턴스(참조값), String type, 팩토리 메서드(이 또한 내부에서 new 로 인스턴스를 생성하여 반환한다.) 즉, 위에서 언급한 것들은 메소드를 통해 값을 전달할 수 있는 일급시민이다. 하지만 함수(메서드,클래스)등은 여전히 이급시민이였다. 모든 일급시민들은 인스턴스자체가 값이 되지만 메서드나 클래스는 그자체로 값이 될수가 없다.
#### 1.3.1 메서드와 람다를 일급시민으로
자바 8에서는 위의 부분을 해결하기위해 메서드를 값으로 취급할 수 있게 자바8에서 설계하기로 결정했다. 이로인해 파라미터로 메서드를 넣음으로서 일급시민으로 활동할 수 있게 하였다.(이 기능을 스트림을 토대로 제공).
> 메서드 참조 -> '이 메서드를 값으로 사용하라'라는 의미
```java  
//자바 8 이전 익명함수를 통해 구현방식 >   File[] hiddenFiles = new File(".").listFiles(new FileFilter()){  
      public boolean accept(File file){  
           return file.isHidden();   
       }  
   }   
 //자바8 이후 메서드 참조 이용  
 File[] hiddenFiles = new File(".").listFiles((File::isHidd); 
 ``` 

**람다 : 익명함수**  
자바8에서는 메서드를 일급값으로 취급할 뿐아니라 람다를 포함하여 함수도 값으로 취급할 수 있다. 예를 들어 (int x) -> x+1,  
즉, 'x라는 인수로 호출하면 x+1을 반환' 하는 동작을 수행하도록 코드르 구현할 수 있다.

하지만 한가지 의문이 생긴다. calculate 라는 클래스를 만들어서 클래스내부에 add라는 메서드를 정의해서 calculate::add 를 만들 수 있은데 왜 굳이 이와같은 코드가 필요할까?   
물론 직접 메서드를 정의할 수도 있겠지만 예를들어 한번만 사용되고 사용하지 않을 용도이거나 편리한 클래스나 메서드가 없을때 새롭게 만드는 것보다 람다 문법을 이용해서 사용하면 좀더 간결하며 직관적이고 리소스 낭비를 덜 하게 된다.

#### 1.3.2 코드 넘겨주기
```java  
    package chap01;  
  
import java.util.ArrayList;  
import java.util.Arrays;  
import java.util.List;  
import java.util.function.Predicate;  
  
public class FilteringApples {  
  
    public static void main(String... args) {  
        List<Apple> inventory = Arrays.asList(  
                new Apple(80, "green"),  
                new Apple(155, "green"),  
                new Apple(120, "red")  
        );  
  
        // [Apple{color='green', weight=80}, Apple{color='green', weight=155}]  
        List<Apple> greenApples = filterApples(inventory, FilteringApples::isGreenApple);  
        System.out.println(greenApples);  
  
        // [Apple{color='green', weight=155}]  
        List<Apple> heavyApples = filterApples(inventory, FilteringApples::isHeavyApple);  
        System.out.println(heavyApples);  
  
        // [Apple{color='green', weight=80}, Apple{color='green', weight=155}]  
        List<Apple> greenApples2 = filterApples(inventory, (Apple a) -> "green".equals(a.getColor()));  
        System.out.println(greenApples2);  
  
        // [Apple{color='green', weight=155}]  
        List<Apple> heavyApples2 = filterApples(inventory, (Apple a) -> a.getWeight() > 150);  
        System.out.println(heavyApples2);  
  
        // []  
        List<Apple> weirdApples = filterApples(inventory, (Apple a) -> a.getWeight() < 80 || "brown".equals(a.getColor()));  
        System.out.println(weirdApples);  
    }  
  
    public static List<Apple> filterGreenApples(List<Apple> inventory) {  
        List<Apple> result = new ArrayList<>();  
        for (Apple apple : inventory) {  
            if ("green".equals(apple.getColor())) {  
                result.add(apple);  
            }  
        }  
        return result;  
    }  
  
    public static List<Apple> filterHeavyApples(List<Apple> inventory) {  
        List<Apple> result = new ArrayList<>();  
        for (Apple apple : inventory) {  
            if (apple.getWeight() > 150) {  
                result.add(apple);  
            }  
        }  
        return result;  
    }  
  
    public static boolean isGreenApple(Apple apple) {  
        return "green".equals(apple.getColor());  
    }  
  
    public static boolean isHeavyApple(Apple apple) {  
        return apple.getWeight() > 150;  
    }  
  
    public static List<Apple> filterApples(List<Apple> inventory, Predicate<Apple> p) {  
        List<Apple> result = new ArrayList<>();  
        for (Apple apple : inventory) {  
            if (p.test(apple)) {  
                result.add(apple);  
            }  
        }  
        return result;  
    }  
  
    public static class Apple {  
  
        private int weight = 0;  
        private String color = "";  
  
        public Apple(int weight, String color) {  
            this.weight = weight;  
            this.color = color;  
        }  
  
        public int getWeight() {  
            return weight;  
        }  
  
        public void setWeight(int weight) {  
            this.weight = weight;  
        }  
  
        public String getColor() {  
            return color;  
        }  
  
        public void setColor(String color) {  
            this.color = color;  
        }  
  
        @SuppressWarnings("boxing")  
        @Override  
        public String toString() {  
            return String.format("Apple{color='%s', weight=%d}", color, weight);  
        }  
  
    }  
  
}  
  
```  
#### 1.3.3 메서드 전달을 람다로
메서드를 값으로 전달하는 것은 분명 유용한 기능다. 하지만 한 두번만 사용할 메서드를 매번 정의하는 것은 귀찮은 일이다.   
즉, 한 번만 사용할 메서드는 따로 정의를 구현할 필요가 없다. 하지만 람다가 몇 줄 이상으로 길어진다면 익명 람다 보다는 코드가 수행하는 일을 잘 설명하는 이름을 가진 메서드를 정의하고 메서드 참조를 활용하는 것이 바람직하다. 코드의 명확성이 우선시되어야 한다.
```java  
 // 위의 코드를 보면   
static <T> Collection<T> filter(Collection<T> c, Predicate<T> p);   
//형태로 filterApples 를 구현하여 사용했는데 // filter 라는 라이브러리 메서드를 이용하면 filterApples 메서드를 구현할 필요가 없다.  
// 또한, 컬랙션과 스트림 간에 변환할 수 있는 메소드(map, reduce) 도 제공한다.  
```  

### 1.4 스트림
거의 모든 자바 애플리케이션은 컬렉션을 만들고 활용한다. 하지만 컬렉션으로 모든 문제가 해결되는것은 아니다.

예를 들어 고가의 트랜젝션(거래)만 필터링한 다음에 통화로 결과를 그룹화 해야한다고 가정하자 아래와 같은 많은 기본코드르 구현해야된다.
```java  
Map<Curreny, List<Transaction>> transactionByCurrencies = new HashMap<>();  //그룹화된 트랜젝션을 더할 Map 생성 for (Transaction transaction : transactions){  
    if(transactionsForCurrency == null){  
        transactionsForCurrency = new ArrayList<>();  
        transactionsByCurrencies.put(cuurenc, transactionsForCurrency);  
    }  
    transactionsForCurrency.add(transaction);      
}  
```  

위의 예제는 중첩된 제어 흐름 문장이 많아서 코들 한 번에 이해하기 어렵다.   
스트림 API를 이용하면 다음처럼 문제를 해결할 수 있다.
```java  
import static java.util.stream.Collectors.groupingBy;  
Map<Currency, List<Transaction>> transactionByCurrencies =   
        transactions.stream()  
        .filter((Transaction t) -> T.getPrice() > 1000)  
        .collect(groupingBy(Transaction::getCurrency));  
```  
스트림API를 이용하면 컬랙션 API와는 상당히 다른 방식으로 데이터를 처리할 수 있다.
### 내부 반복과 외부 반복
외부 반복(external iteration)은 for-each루프를 이용해서 각 요소를 반 작업을 수행하는 것을 말한다. 반면 내부 반복(internal iteration)은 스트림 API와 같이 루프를 신경 쓸 필요없이, 스트림 API라는 라이브러리 내부에서 모든 데이터가 처리된는 것을 말한다.  
또 다른 문제로 Collection을 사용했을 때의 성능 문제를 꼽을 수 있다.  
거대한 크기의 Collection을 단일 CPU로는 처리하기 힘들다.

### 1.4.1 멀티 스레딩은 어렵다
자바 8은 스트림으로 컬렉션을 처리하면서 발생하는 `모호함과 반복적인 코드 문제`와 `멀티코어 활용 어려움`이라는 두 가지 문제를 모두 해결했다. 컬렉션은 어떻게 데이터를 저장하고 접근할지에 중점을 두는 반면 스트림은 데이터에 어떤 계산을 할 것인지 묘사하는 것에 중점을 둔다.
### 포킹 단계(forking step)
예를 들어 두 CPU를 가진 가진 환경에서 리스트를 필터링할 때 한 CPU는 앞 부분을 처리하고, 다른 CPU는 리스트의 뒷 부분을 처리하도록 요청할 수 있는데 이과정을 포킹 단계라고 한다. 각각의 CPU는 자신이 맡은 절반의 리스트를 처리하고 마지막으로 하나의 CPU가 두 결과를 정리한다.
###