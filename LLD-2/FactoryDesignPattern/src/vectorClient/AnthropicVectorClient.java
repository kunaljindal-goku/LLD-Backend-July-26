package vectorClient;

public class AnthropicVectorClient implements AiVectorClient {
    @Override
    public void embedd(String prompt) {
        System.out.println("Embedding from Anthropic");
    }
}
