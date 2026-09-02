package factory;

import chatClients.AiChatClient;
import chatClients.OpenAiChatClient;
import vectorClient.AiVectorClient;
import vectorClient.OpenAiVectorClient;

public class OpenAiClientFactory implements AiClientFactory{
    @Override
    public AiChatClient getAiChatClient() {
        return new OpenAiChatClient();
    }

    @Override
    public AiVectorClient getAiVectorClient() {
        return new OpenAiVectorClient();
    }
}
