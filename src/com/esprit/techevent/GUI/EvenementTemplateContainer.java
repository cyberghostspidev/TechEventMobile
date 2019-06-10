/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.esprit.techevent.GUI;

import com.codename1.l10n.SimpleDateFormat;
import com.codename1.ui.Container;
import com.codename1.ui.EncodedImage;
import com.codename1.ui.Label;
import com.codename1.ui.URLImage;
import com.codename1.ui.layouts.BoxLayout;
import com.esprit.techevent.Model.Evenement;
import com.esprit.techevent.utils.ImageLoader;

/**
 *
 * @author HP EliteBook
 */
public class EvenementTemplateContainer {

    public Container createEvenementTemplate(Evenement evenement) {
        Container containerH = new Container(BoxLayout.x());
        Container containerV = new Container(BoxLayout.y());
        URLImage image = ImageLoader.loadImageFromServer("http://localhost/TechEvent/Evenements/" + evenement.getAffiche(), evenement.getAffiche());
        Label nomEvenement = new Label(evenement.getNom());
        Label dateEvenement = new Label(new SimpleDateFormat("yyyy-MM-dd HH:mm").format(evenement.getDateDebut()));
//        Label LieuEvenement = new Label(evenement.getIdLocalisation());
        containerV.addAll(nomEvenement, dateEvenement);
        containerH.add(image.scaled(300, 300));
        containerH.add(containerV);
        containerH.setLeadComponent(containerV);
        return containerH;
    }
}
