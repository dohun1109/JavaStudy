package StandardOfJava.Generic;


interface Player {
    String name();
}


record BaseballPlayer(String name, String position) implements Player {

}

record FootballPlayer(String name, String position) implements Player {

}

record VolleyballPlayer(String name, String position) implements Player {
    
}

public class main {


    public static void main(String[] args) {

        var philly = new Affiliation("city", "Philadelphia, PA", "US");


        BaseballTeam phillies1 = new BaseballTeam("Philadelphia Phillies");
        BaseballTeam astros1 = new BaseballTeam("Houston Astros");
        scoreResult(phillies1, 3, astros1, 5);

        SportsTeam phillies2 = new SportsTeam("Philadelphia Phillies");
        SportsTeam astros2 = new SportsTeam("Houston Astros");
        scoreResult(phillies2, 3, astros2, 5);

        Team<BaseballPlayer, Affiliation> phillies = new Team<>("Philadelphia Phillies", philly);
        Team<BaseballPlayer, Affiliation> astros = new Team<>("Houston Astros");
        scoreResult(phillies, 3, astros, 5);

        // 추가할 선수 명단 Var 타입으로 선언(new 연산자로 뒤에서 type 을 지정해주기 때문에 var 가능)
        var harper = new BaseballPlayer("B Harper", "Right Fielder");
        var marsh = new BaseballPlayer("B Marsh", "Right Fielder");
        var guthrie = new BaseballPlayer("D guthrie", "Center Fileder");

        //선수 추가
        phillies.addTeamMember(harper);
        phillies.addTeamMember(marsh);
        phillies.addTeamMember(guthrie);

        //선수 리스트
        phillies.listTeamMembers();


        // SportTeam  생성
        SportsTeam afc1 = new SportsTeam("Adelaide Crows");        //팀 생성
        Team<FootballPlayer, String> afc = new Team<>("Adelaide Crows", "City of Adelaide, South Australia, in AU");        //팀 생성
        
        var tex = new FootballPlayer("Tex Walker", "Centre half forward"); //Player 생성

        afc.addTeamMember(tex); //Player 추가
        var rory = new FootballPlayer("Rory Laird", "Midfield");
        afc.addTeamMember(rory);
        afc.listTeamMembers();  //TeamMember List

        Team<VolleyballPlayer, Affiliation> adelaide = new Team<>("Adelaide Storm");
        adelaide.addTeamMember(new VolleyballPlayer("N Roberts","Setter"));
        adelaide.listTeamMembers();


        var Canberra = new Team<VolleyballPlayer, Affiliation>("Canberra Heat");
        Canberra.addTeamMember(new VolleyballPlayer("B Black","Opposite"));
        Canberra.listTeamMembers();
        scoreResult(Canberra, 0, adelaide, 1);

//        Team<Integer> melbourneVB = new Team<>("Melbourne Vipers");
        
    }


    public static void scoreResult(BaseballTeam team1, int t1_score, BaseballTeam team2, int t2_score) {
        String message = team1.setScore(t1_score, t2_score);
        team2.setScore(t2_score, t1_score);
        System.out.printf("%s %s %s %n", team1, message, team2);
        System.out.println("----".repeat(15));

    }

    public static void scoreResult(SportsTeam team1, int t1_score, SportsTeam team2, int t2_score) {
        String message = team1.setScore(t1_score, t2_score);
        team2.setScore(t2_score, t1_score);
        System.out.printf("%s %s %s %n", team1, message, team2);
        System.out.println("----".repeat(15));

    }


    public static void scoreResult(Team team1, int t1_score, Team team2, int t2_score) {
        String message = team1.setScore(t1_score, t2_score);
        team2.setScore(t2_score, t1_score);
        System.out.printf("%s %s %s %n", team1, message, team2);
        System.out.println("----".repeat(15));

    }

}
