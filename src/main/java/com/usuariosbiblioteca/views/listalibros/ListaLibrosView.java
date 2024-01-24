package com.usuariosbiblioteca.views.listalibros;

import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.dependency.Uses;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("ListaLibros")
@Route(value = "listaLibros")
@Uses(Icon.class)
public class ListaLibrosView extends Composite<VerticalLayout> {

    public ListaLibrosView() {
        getContent().setWidth("100%");
        getContent().getStyle().set("flex-grow", "1");
    }
}
