/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.esprit.techevent.GUI;

import com.codename1.ui.Form;
import com.codename1.ui.Label;
import com.codename1.ui.RadioButton;
import com.codename1.ui.TextField;
import com.codename1.ui.layouts.GridLayout;

/**
 *
 * @author HP EliteBook
 */
public class InscriptionForm {

    private static Form form;

    public static void open() {
        form = new Form("", new GridLayout(5, 2));
        Label emailLabel = new Label("E-Mail");
        Label usernameLabel = new Label("Nom Utilisateur");
        Label passwordLabel = new Label("Mot de passe");
        Label confirmPasswordLabel = new Label("Confirmation");
        Label typeLabel = new Label("Type de compte");
        TextField emailTextField = new TextField(null, "xxx@yyy.com", 0, TextField.EMAILADDR);
        TextField usernameTextField = new TextField();
        TextField passwordTextField = new TextField(null, null, 0, TextField.PASSWORD);
        TextField confirmPasswordTextField = new TextField(null, null, 0, TextField.PASSWORD);
        RadioButton participantRadioButton = new RadioButton("Participant");
        RadioButton collaborateurRadioButton = new RadioButton("Collaborateur");
        form.addAll(emailLabel, emailTextField, usernameLabel, usernameTextField, passwordLabel, passwordTextField, confirmPasswordLabel, confirmPasswordTextField, typeLabel);
        form.show();
    }
}
