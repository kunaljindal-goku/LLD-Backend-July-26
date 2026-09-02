package chatClients;

public class OpenAiChatClient implements AiChatClient {

    public void comletePrompt(String promot) {
        System.out.println("Response from Open AI: "+promot);
    }

    @Override
    public void chat(String prompt) {
        comletePrompt(prompt);
    }
}
