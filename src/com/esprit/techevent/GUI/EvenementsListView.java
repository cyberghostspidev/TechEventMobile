/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.esprit.techevent.GUI;

import com.codename1.ui.Container;
import com.codename1.ui.layouts.BoxLayout;
import com.esprit.techevent.Model.Evenement;
import com.esprit.techevent.Model.Utilisateur;
import com.esprit.techevent.services.EvenementService;
import java.util.List;

/**
 *
 * @author HP EliteBook
 */
public class EvenementsListView {

    public Container creerListView(String type, Utilisateur connectedUser) {
        Container container = new Container(BoxLayout.y());
        switch (type) {
            case "Recent":
                List<Evenement> evenementsRecents = new EvenementService().rechercheTousEvenements();
                for (Evenement evenement : evenementsRecents) {
                    Container evenementInTemplate = new EvenementTemplateContainer().createEvenementTemplate(evenement);
                    container.add(evenementInTemplate);
                }
                break;
            case "Participant":
                List<Evenement> evenementsParticipants = new EvenementService().rechercheTousEvenements();
                for (Evenement evenement : evenementsParticipants) {
                    Container evenementInTemplate = new EvenementTemplateContainer().createEvenementTemplate(evenement);
                    container.add(evenementInTemplate);
                }
                break;
            case "Organisateur":
                List<Evenement> evenementsOrganisateurs = new EvenementService().rechercheTousEvenements();
                for (Evenement evenement : evenementsOrganisateurs) {
                    Container evenementInTemplate = new EvenementTemplateContainer().createEvenementTemplate(evenement);
                    container.add(evenementInTemplate);
                }
                break;
        }
        return container;
    }
}
