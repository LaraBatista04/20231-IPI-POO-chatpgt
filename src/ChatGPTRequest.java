import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor

public class ChatGPTRequest {
    public ChatGPTRequest(String string, String string2, int i) {
    }
    private String model;
    private String prompt;
    private int max_tokens;
}
