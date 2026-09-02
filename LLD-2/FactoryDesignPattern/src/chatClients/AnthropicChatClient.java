package chatClients;

public class AnthropicChatClient implements AiChatClient {

    public void getResponseForPrompt(String promot) {
        System.out.println("Response from Anthropic AI: "+promot);
    }

    @Override
    public void chat(String prompt) {
        getResponseForPrompt(prompt);
    }
}
