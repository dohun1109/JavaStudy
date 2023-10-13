package StandardOfJava.UnClassified;

public class Chatting {
    class Chat{
        void start(){}
        boolean sendMessage(String message) {
            System.out.println(message);
            return false;
        }

    }

    void startChat(String chatId) {
//        String nickName = chatId;
        StringBuffer nickName = new StringBuffer("");
        nickName.append(chatId);
        final boolean[] check = {true};

        Chat chat = new Chat(){
            @Override
            void start() {
                while (check[0]) {
                    String inputData = "안녕하세요";
                    String message = "[" + nickName +"]" + inputData;
                    check[0] = sendMessage(message);
                }

            }
        };

        chat.start();
    }

    public static void main(String[] args) {
        Chatting chat = new Chatting();
        chat.startChat("박게영이");
    }
}
