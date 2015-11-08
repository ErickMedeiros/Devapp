package controle;

import java.util.Locale;
import java.util.ResourceBundle;

import javax.faces.context.FacesContext;

public class Uteis {

		public static String getMsg(String messageID){
			FacesContext facesContext = FacesContext.getCurrentInstance();
			String msg = "";
			
			Locale locale = facesContext.getViewRoot().getLocale();
			ResourceBundle bundle =
					ResourceBundle.getBundle("messages", locale);
			
			try {
				msg = bundle.getString(messageID);
			}catch (Exception e) {
				System.out.println("Mensagem n�o localizada");
			}
			
			return msg;
		}
}
