package com.usuariosbiblioteca.views.usuarios;

import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.dependency.Uses;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.formlayout.FormLayout.ResponsiveStep;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouteAlias;
import com.vaadin.flow.theme.lumo.LumoUtility.Gap;

@PageTitle("Usuarios")
@Route(value = "usuarios")
@RouteAlias(value = "")
@Uses(Icon.class)
public class UsuariosView extends Composite<VerticalLayout> {

    public UsuariosView() {
        HorizontalLayout layoutRow = new HorizontalLayout();
        H2 h2 = new H2();
        VerticalLayout layoutColumn2 = new VerticalLayout();
        FormLayout formLayout3Col = new FormLayout();
        TextField textField = new TextField();
        TextField textField2 = new TextField();
        FormLayout formLayout3Col2 = new FormLayout();
        TextField textField3 = new TextField();
        TextField textField4 = new TextField();
        FormLayout formLayout3Col3 = new FormLayout();
        Button buttonPrimary = new Button();
        Button buttonSecondary = new Button();
        getContent().setWidth("100%");
        getContent().getStyle().set("flex-grow", "1");
        layoutRow.addClassName(Gap.MEDIUM);
        layoutRow.setWidth("100%");
        layoutRow.setHeight("min-content");
        h2.setText("Registro de Usuarios");
        h2.setWidth("max-content");
        layoutColumn2.setWidth("100%");
        layoutColumn2.getStyle().set("flex-grow", "1");
        formLayout3Col.setWidth("100%");
        formLayout3Col.setResponsiveSteps(new ResponsiveStep("0", 1), new ResponsiveStep("250px", 2),
                new ResponsiveStep("500px", 3));
        textField.setLabel("Nombre");
        textField.setWidth("min-content");
        textField2.setLabel("Edad");
        textField2.setWidth("min-content");
        formLayout3Col2.setWidth("100%");
        formLayout3Col2.setResponsiveSteps(new ResponsiveStep("0", 1), new ResponsiveStep("250px", 2),
                new ResponsiveStep("500px", 3));
        textField3.setLabel("Cédula");
        textField3.setWidth("min-content");
        textField4.setLabel("Número de usuario");
        textField4.setWidth("min-content");
        formLayout3Col3.setWidth("100%");
        formLayout3Col3.setResponsiveSteps(new ResponsiveStep("0", 1), new ResponsiveStep("250px", 2),
                new ResponsiveStep("500px", 3));
        buttonPrimary.setText("Guardar");
        buttonPrimary.setWidth("min-content");
        buttonPrimary.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
        buttonSecondary.setText("Registrar libros");
        buttonSecondary.setWidth("min-content");
        getContent().add(layoutRow);
        layoutRow.add(h2);
        getContent().add(layoutColumn2);
        layoutColumn2.add(formLayout3Col);
        formLayout3Col.add(textField);
        formLayout3Col.add(textField2);
        layoutColumn2.add(formLayout3Col2);
        formLayout3Col2.add(textField3);
        formLayout3Col2.add(textField4);
        layoutColumn2.add(formLayout3Col3);
        formLayout3Col3.add(buttonPrimary);
        formLayout3Col3.add(buttonSecondary);
    }
}
