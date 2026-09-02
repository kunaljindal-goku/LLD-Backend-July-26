package factory;

import chatClients.AiChatClient;
import vectorClient.AiVectorClient;

// abstract factory
public interface AiClientFactory {

    AiChatClient getAiChatClient();
    AiVectorClient getAiVectorClient();
}
