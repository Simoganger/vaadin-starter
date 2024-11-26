package com.sprintgether.vaadinstarter;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;

/**
 * A sample Vaadin view class.
 * <p>
 * To implement a Vaadin view just extend any Vaadin component and use @Route
 * annotation to announce it in a URL as a Spring managed bean.
 * <p>
 * A new instance of this class is created for every new user and every browser
 * tab/window.
 * <p>
 * The main view contains a text field for getting the user name and a button
 * that shows a greeting message in a notification.
 */
@Route
public class MainView extends VerticalLayout {

    public MainView() {

        // Créer un champ de texte standard
        TextField textField = new TextField("Your name here");

        // Créer un bouton standard
        Button button = new Button(
            "Say hello",
            e -> add(new Paragraph("Hello " + textField.getValue()))
        );

        // Ajouter tous les composants à la vue courante
        add(textField, button);
    }

}

