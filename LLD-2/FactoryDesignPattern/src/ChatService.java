import chatClients.AiChatClient;
import factory.AiChatClientFactory;
import factory.AiClientFactory;
import factory.AiClientFactoryProvider;
import vectorClient.AiVectorClient;
import factory.AiVectorClientFactory;

public class ChatService {

//    private chatClients.OpenAiChatClient openAiChatClient;

    private AiChatClient aiChatClient;
    private AiVectorClient aiVectorClient;
    private AiClientFactory aiClientFactory;

    public ChatService(String providerName) {
       this.aiClientFactory = AiClientFactoryProvider.getAiClientFatory(providerName);
       this.aiChatClient = aiClientFactory.getAiChatClient();
       this.aiVectorClient = aiClientFactory.getAiVectorClient();
    }

    public void chat(String prompt) {
        aiChatClient.chat(prompt);
    }
}
