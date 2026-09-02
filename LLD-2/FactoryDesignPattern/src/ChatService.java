import chatClients.AiChatClient;
import factory.AiClientFactory;
import factory.ClientFactoryProvider;
import vectorClient.AiVectorClient;

import java.util.List;

public class ChatService {

//    private chatClients.OpenAiChatClient openAiChatClient;

    private AiChatClient aiChatClient;
    private AiVectorClient aiVectorClient;
    private List<String> providers;
    private AiClientFactory aiClientFactory;

    public ChatService() {
        this.providers = List.of("anthropic", "openai");
        for (String provider : providers) {
            try {
                aiClientFactory = ClientFactoryProvider.getAiClientFatory(provider);
                this.aiChatClient = aiClientFactory.getAiChatClient();
                this.aiVectorClient = aiClientFactory.getAiVectorClient();
            } catch (Exception e) {
                System.out.println(provider + " is not available. Trying for some other prvider");
            }

        }
        if (aiClientFactory == null) {
            throw new RuntimeException("None of the providers is availabe");
        }
    }

    public void chat(String prompt) {
        aiChatClient.chat(prompt);
    }
}
