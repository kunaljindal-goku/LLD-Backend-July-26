package factory.simpleFactory;

import vectorClient.AiVectorClient;
import vectorClient.AnthropicVectorClient;
import vectorClient.OpenAiVectorClient;

public class VectorClientFactory {

    public static AiVectorClient getAiVectorClient(String providerName) {
        if(providerName.equals("openai")) {
            return new OpenAiVectorClient();
        }
        else if(providerName.equals("anthropic")) {
            return new AnthropicVectorClient();
        }
        throw new RuntimeException("Invalid provider");
    }
}
