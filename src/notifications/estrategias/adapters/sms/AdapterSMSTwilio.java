package notifications.estrategias.adapters.sms;

import notifications.Notificacion;

public class AdapterSMSTwilio implements AdapterNotificadorSMS {

	/**
	 * TODO Se debería llamas a la o las clases correspondientes que se 
	 * quieren adaptar
	 */
	public void enviarSMS(Notificacion notificacion) {
		System.out.println("Enviando SMS a " +
				notificacion.getNroCompletoDestinatario() + " por Twilio: " +
				"'" + notificacion.getMensaje() + "'"
				);

	}

}
