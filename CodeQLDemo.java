import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;

public class CodeQLAlertDemo {
    public static byte[] encrypt(byte[] input)
            throws GeneralSecurityException {
        // Intentionally insecure: CodeQL testing only.
        Cipher cipher = Cipher.getInstance("DES");
        cipher.init(
            Cipher.ENCRYPT_MODE,
            KeyGenerator.getInstance("DES").generateKey()
        );
        return cipher.doFinal(input);
    }
}
