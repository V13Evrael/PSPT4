package es.studium.EjercicioClase3.EjemploURLConnection;

import java.net.URL;
import java.net.URLConnection;

public class EjemploURLConnection {
	public static void main(String[] args) {
		try {
			URL url = new URL("https://www.grupostudium.com");
			URLConnection urlCon = url.openConnection();
			int i = 0;

			while (urlCon.getHeaderField(i) != null) {
				System.out.print(urlCon.getHeaderFieldKey(i));
				System.out.print(":");
				System.out.println(urlCon.getHeaderField(i));
				i++;
			}
		} catch (Exception e) {
			System.err.println(e);
		}
	}
}