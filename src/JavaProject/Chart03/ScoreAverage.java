package JavaProject.Chart03;

public class ScoreAverage {
    public static void main(String[] args) {
        double[][] score = {{3.3,3.4},{3.5,3.6},{3.7,4.0},{4.1,4.2}};
        double sum = 0;

        for(int year = 0; year<score.length; year++)    //각 학년 별로 반복
            for (int term = 0; term<score[year].length; term++) //학기별로 반복
                sum += score[year][term];


        int n = score.length;   //배열 행의 개수, 4, 4학년
        int m = score[0].length;    //배열의 열의 개수 , 2학기
        System.out.println("4년 전체 평점 평균은: "+ sum/(n*m));

    }
}
