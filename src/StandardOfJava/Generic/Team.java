package StandardOfJava.Generic;

import java.util.ArrayList;
import java.util.List;

record Affiliation(String name, String type, String countryCode) {
    @Override
    public String toString() {
        return name + " ( " + type + " in " + countryCode+ ")" ;
    }
}

public class Team <T extends Player, S  >{ //Player 및 Player 자식 만

    private String teamName;        //팀 명
    private List<T> teamMemebers = new ArrayList<>();  //팀 멤버들
    private int totalWins =  0; //총 이긴횟수
    private int totalLosses = 0;    //총 진 횟수
    private int totalTies = 0;  //총 점

    private S affiliation;
    

    public Team(String teamName) {
        this.teamName = teamName;


    }        //기본 생성자

    public Team(String teamName, S affiliation) {
        this.teamName = teamName;
        this.affiliation = affiliation;
    }

    //팀원 추가 method
    public void addTeamMember(T t) {
        //팀에 맴버를 추가하는 method T type reference 를 parameter
        if (!teamMemebers.contains(t)) {
            //if 원래 팀 멤버에 매겨변수로 넘어온 T 가 존재 하지 않는 다면. 아래 실행
            teamMemebers.add(t);   //팀 맴버에 T 를 추가
        }
        //void 이르모 return  X
    }


    //팀원 리스트 
    public void listTeamMembers() { //팀 명과 팀원을 출력 
        System.out.println(teamName + "팀 명단: ");
        System.out.println(affiliation == null ? "" : "AFFILIATION: " + affiliation);
//        System.out.println(teamMemebers);
        for (T t : teamMemebers) {
            System.out.println(t.name() );
        }
        System.out.println("----".repeat(15));

    }

    //랭킹 검색 (
     public int ranking() {

        return (totalLosses ) + totalTies + 1;
        //return 값으로 총 감점 의 2배에 + 총점 + 1
     }

    //점수 Set ( ourScore : 우리팀 점수, theirScore : 상대 팀 점수 )
    public String setScore(int ourScore, int theirScore) {
        String message = "<<<< ( 승리 )";
        if (ourScore > theirScore) {    //우리팀이 상대보다 점수가 높을때 
            totalWins++;
            message = " ( 승리 ) >>>>";

        } else if (ourScore == theirScore) {    //우리팀과 상대팀이 동점일때
            totalTies++;
            message = "동점...";
        } else {
            totalLosses++;  //위 2가지 경우를 제외 하면 진 경우 이므로 총 진 점수 증가++
        }
        return message; //경우에 따라 메시지를 다르게 return 
    }

    @Override
    public String toString(){
        return teamName + "(랭킹 : " + ranking() + ")";
    }

    
    
















}
