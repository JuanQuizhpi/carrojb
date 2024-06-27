/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.pweb.carrojb;

import ec.edu.ups.pweb.business.GestionCarrosRemoto;
import ec.edu.ups.pweb.model.Carro;
import java.util.Hashtable;

import javax.naming.Context;
import javax.naming.InitialContext;

/**
 *
 * @author juanf
 */
public class Main {

    public static void main(String[] args) {
        try {
            final Hashtable<String, String> jndiProperties = new Hashtable<>();
            jndiProperties.put(Context.INITIAL_CONTEXT_FACTORY, "org.wildfly.naming.client.WildFlyInitialContextFactory");
            jndiProperties.put(Context.PROVIDER_URL, "http-remoting://localhost:8080");
            jndiProperties.put(Context.SECURITY_PRINCIPAL, "ejb64"); // Reemplaza 'username' con tu nombre de usuario
            jndiProperties.put(Context.SECURITY_CREDENTIALS, "ejb64"); // Reemplaza 'password' con tu contraseña
            jndiProperties.put("jboss.naming.client.ejb.context", "true");

            final Context context = new InitialContext(jndiProperties);
            GestionCarrosRemoto gestionCarros = (GestionCarrosRemoto) context.lookup("ejb:/demojq/GestionCarros!ec.edu.ups.pweb.business.GestionCarrosRemoto");

            // Uso del EJB
            Carro carro = new Carro();
            carro.setPlaca("ZZZ-233");
            carro.setModelo("RSQ2");
            carro.setMarca("Maserati");
            gestionCarros.guardarCarros(carro);
            System.out.println("Carro guardado!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
