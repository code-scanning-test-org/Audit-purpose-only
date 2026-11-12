import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

public class CodeQLAlertDemo {
    public static void main(String[] args) throws Exception {
        // Intentionally insecure: CodeQL testing only.
        SecretKey key = KeyGenerator.getInstance("DES").generateKey();
        Cipher cipher = Cipher.getInstance("DES");
        cipher.init(Cipher.ENCRYPT_MODE, key);
        cipher.doFinal("Test data".getBytes(StandardCharsets.UTF_8));
    }
}
