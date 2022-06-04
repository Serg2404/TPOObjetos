package notifications.estrategias.adapters.whatsapp;

import notifications.Notificacion;

public class AdapterWhatsAppTwilio implements AdapterNotificadorWhatsApp {

	/**
	 * TODO Se debería llamas a la o las clases correspondientes que se 
	 * quieren adaptar
	 */
	public void enviarWhatsApp(Notificacion notificacion) {
		System.out.println("Enviando WhatsApp a " +
		notificacion.getNroCompletoDestinatario() + " por Twilio: " +
		"'" + notificacion.getMensaje() + "'"
		);
	}

}
