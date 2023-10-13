package StandardOfJava.Generic;

import java.util.ArrayList;
import java.util.List;

public class BaseballTeam {

    private String teamName;        //팀 명
    private List<BaseballPlayer> teamMemebers = new ArrayList<>();  //팀 멤버들
    private int totalWins =  0; //총 이긴횟수
    private int totalLosses = 0;    //총 진 횟수
    private int totalTies = 0;  //총 점

    public BaseballTeam(String teamName) {
        this.teamName = teamName;
    }        //기본 생성자 

    //팀원 추가 method
    public void addTeamMember(BaseballPlayer player) {
        //팀에 맴버를 추가하는 method BaseBallPlayer type reference 를 parameter
        if (!teamMemebers.contains(player)) {
            //if 원래 팀 멤버에 매겨변수로 넘어온 player 가 존재 하지 않는 다면. 아래 실행
            teamMemebers.add(player);   //팀 맴버에 player 를 추가 
        }
        //void 이르모 return  X
    }


    //팀원 리스트 
    public void listTeamMembers() { //팀 명과 팀원을 출력 
        System.out.println(teamName + " 팀 명단:");
        System.out.println(teamMemebers);
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
