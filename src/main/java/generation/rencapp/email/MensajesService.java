package generation.rencapp.email;

//import com.twilio.Twilio;
//import com.twilio.rest.api.v2010.account.Message;
import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import org.springframework.stereotype.Service;
import java.io.IOException;

@Service public class MensajesService {

    //public static final String sid = "";
    //public static final String token = "";

    public MensajesService() {

        Twilio.init(sid, token);

    }
    public void enviarMensaje(String destinatario, String contenido) throws IOException {
        Message message = Message.creator(
                new com.twilio.type.PhoneNumber(destinatario),
                new com.twilio.type.PhoneNumber("+19704584388"), contenido).create();
        System.out.println("Mensaje enviado a destinatario");
    }
}

