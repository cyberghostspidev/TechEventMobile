/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.esprit.techevent.GUI;

import com.codename1.components.ToastBar;
import com.codename1.ui.Button;
import com.codename1.ui.Container;
import com.codename1.ui.FontImage;
import com.codename1.ui.Form;
import com.codename1.ui.Label;
import com.codename1.ui.layouts.BoxLayout;
import com.codename1.ui.layouts.FlowLayout;
import com.codename1.ui.plaf.Style;

/**
 *
 * @author HP EliteBook
 */
public class RecentsEvenementsView {

    private static Form form;

    public static void open() {
        form = new Form(BoxLayout.y());
        Container header = new Container();
        Button authentifier = new Button("S'authentifier", "Label");
        authentifier.getAllStyles().setTextDecoration(Style.TEXT_DECORATION_UNDERLINE);
        Button inscrire = new Button("S'inscrire", "Label");
        inscrire.getAllStyles().setTextDecoration(Style.TEXT_DECORATION_UNDERLINE);
        header.add(FlowLayout.encloseRightMiddle(authentifier, new Label(" ou "), inscrire));
        authentifier.addActionListener(e -> ToastBar.showMessage("Authentifié !", FontImage.MATERIAL_INFO));
        inscrire.addActionListener(e -> InscriptionForm.open());
        form.add(header);
        Container list = new EvenementsListView().creerListView("Recent", null);
        form.add(list);
        form.show();
    }
}
