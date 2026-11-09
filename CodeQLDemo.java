import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

public class CodeQLAlertDemo {
    public static void main(String[] args) throws GeneralSecurityException {
        KeyGenerator generator = KeyGenerator.getInstance("DES");
        generator.init(56);
        SecretKey key = generator.generateKey();

        // Intentionally insecure: testing only. Do not use in production.
        Cipher cipher = Cipher.getInstance("DES");
        cipher.init(Cipher.ENCRYPT_MODE, key);

        byte[] encrypted = cipher.doFinal(
            "CodeQL testing only".getBytes(StandardCharsets.UTF_8)
        );

        System.out.println(Base64.getEncoder().encodeToString(encrypted));
    }
}
