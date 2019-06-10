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
import com.esprit.techevent.Model.Evenement;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 *
 * @author HP EliteBook
 */
public class EvenementService {

    ConnectionRequest con = new ConnectionRequest();

    public EvenementService() {
    }

    public List<Evenement> rechercheTousEvenements() {
        con.setUrl("http://localhost/TechEvent/chercherTousEvenements.php");
        List<Evenement> evenements = new ArrayList();
        con.addResponseListener(new ActionListener<NetworkEvent>() {
            @Override
            public void actionPerformed(NetworkEvent evt) {
                try {
                    JSONParser j = new JSONParser();// Instanciation d'un objet JSONParser permettant le parsing du résultat json
                    Map<String, Object> evenementsMap = j.parseJSON(new CharArrayReader(new String(con.getResponseData()).toCharArray()));
                    List<Map<String, Object>> list = (List<Map<String, Object>>) evenementsMap.get("root");
                    for (Map<String, Object> obj : list) {
                        Evenement evenement = new Evenement();
                        float id = Float.parseFloat(obj.get("idEvenement").toString());
                        evenement.setIdEvenement((int) id);
                        evenement.setNom(obj.get("nom").toString());
                        evenement.setAffiche(obj.get("affiche").toString());
                        evenement.setDateDebut(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(obj.get("dateDebut").toString()));
                        evenements.add(evenement);
                    }

                } catch (IOException ex) {
                } catch (ParseException ex) {
                    ex.printStackTrace();
                }
            }
        });

        NetworkManager.getInstance().addToQueueAndWait(con);
        return evenements;
    }
}
