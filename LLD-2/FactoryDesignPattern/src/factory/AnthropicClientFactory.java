package factory;

import chatClients.AiChatClient;
import chatClients.AnthropicChatClient;
import vectorClient.AiVectorClient;
import vectorClient.AnthropicVectorClient;

public class AnthropicClientFactory implements AiClientFactory{
    @Override
    public AiChatClient getAiChatClient() {
        return new AnthropicChatClient();
    }

    @Override
    public AiVectorClient getAiVectorClient() {
        return new AnthropicVectorClient();
    }
}
