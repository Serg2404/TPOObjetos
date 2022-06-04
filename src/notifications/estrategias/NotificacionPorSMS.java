package notifications.estrategias;

import notifications.Notificacion;
import notifications.estrategias.adapters.sms.AdapterNotificadorSMS;

public class NotificacionPorSMS implements EstrategiaDeNotificacion {

	private AdapterNotificadorSMS adapter;
	
	public void setAdapter(AdapterNotificadorSMS adapter) {
		this.adapter = adapter;
	}

	public NotificacionPorSMS(AdapterNotificadorSMS adapter) {
		super();
		this.adapter = adapter;
	}

	public void enviar(Notificacion notificacion) {
		this.adapter.enviarSMS(notificacion);
	}

}
