public class TestePrompt {
    public static void main(String[] args) throws Exception {
        var ChatGPTClient = new ChatGPTClient();
        ChatGPTClient.criarPergunta(
            null, 
            "Java",
            "alternativa", 
            "dificil", 
            "Pq o ceu é azul?");
    }
}
