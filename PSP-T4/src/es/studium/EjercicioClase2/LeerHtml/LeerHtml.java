package es.studium.EjercicioClase2.LeerHtml;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class LeerHtml {
	
	public static void main(String[] args) {
		
		try {
//Lectura del archivo (texto HTML)
			URL direccion = new URL("https://www.grupostudium.com");
			String s = new String();
			String html = new String();
			BufferedReader br = new BufferedReader(new InputStreamReader(direccion.openStream()));
			while ((s = br.readLine()) != null) {
				html += s + '\n';
			}
			System.out.println(html);

			br.close();
		} catch (Exception e) {
			System.err.println(e);
		}
	}
}
