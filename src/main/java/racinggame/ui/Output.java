package racinggame.ui;

public class Output {

    public static final String RESULT = "실행결과";
    public static final String WINNER = "최종 우승자는 %s 입니다.";
    public static final String SEMICOLON = " : ";
    public static final String RUN = "-";

    public static void result() {
        System.out.println();
        System.out.println(RESULT);
    }

    public static void winner(String winner) {
        System.out.println(String.format(WINNER, winner));
    }

    public static void carName(String carName) {
        System.out.print(carName + SEMICOLON);
    }

    public static void runStatus(int runCount) {
        StringBuffer running = new StringBuffer();
        for (int i = 0; i < runCount; i++) {
            running.append(RUN);
        }
        System.out.println(running);
    }

    public static void emptyLine() {
        System.out.println();
    }
}
