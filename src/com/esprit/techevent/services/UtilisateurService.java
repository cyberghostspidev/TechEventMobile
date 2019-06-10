/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.esprit.techevent.services;

import com.codename1.io.CharArrayReader;
import com.codename1.io.ConnectionRequest;
import com.codename1.io.JSONParser;
import com.codename1.io.NetworkEvent;
import com.codename1.io.NetworkManager;
import com.codename1.ui.events.ActionListener;
import com.esprit.techevent.Model.Utilisateur;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Map;

/**
 *
 * @author HP EliteBook
 */
public class UtilisateurService {

    ConnectionRequest con = new ConnectionRequest();

    public UtilisateurService() {
    }

    public Utilisateur rechercheUtilisateurParNomUserNameEtMotDePasse(String username, String MotDePasse) {
        con.setUrl("http://localhost/TechEvent/authentification.php");
        Utilisateur utilisateur = new Utilisateur();
        con.addResponseListener(new ActionListener<NetworkEvent>() {
            @Override
            public void actionPerformed(NetworkEvent evt) {
                try {
                    JSONParser j = new JSONParser();// Instanciation d'un objet JSONParser permettant le parsing du résultat json
                    Map<String, Object> result = j.parseJSON(new CharArrayReader(new String(con.getResponseData()).toCharArray()));
                    Map<String, Object> userMap = (Map<String, Object>) result.get("root");
                    utilisateur.setIdUtilisateur(Integer.parseInt(userMap.get("idUtilisateur").toString()));
                    utilisateur.setEmail(userMap.get("email").toString());
                    utilisateur.setUsername(userMap.get("username").toString());
                    utilisateur.setPassword(userMap.get("password").toString());
                    utilisateur.setType(userMap.get("type").toString());
                    utilisateur.setDateInscription(new SimpleDateFormat("yyyy-MM-dd").parse(userMap.get("dateInscription").toString()));
                    utilisateur.setDateExpiration(new SimpleDateFormat("yyyy-MM-dd").parse(userMap.get("dateExpiration").toString()));
                } catch (ParseException | IOException ex) {
                }
            }
        });
        NetworkManager.getInstance().addToQueueAndWait(con);
        return utilisateur;
    }
}
