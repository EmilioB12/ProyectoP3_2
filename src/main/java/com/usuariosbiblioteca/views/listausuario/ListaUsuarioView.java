package com.usuariosbiblioteca.views.listausuario;

import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.dependency.Uses;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("ListaUsuario")
@Route(value = "listaUsuario")
@Uses(Icon.class)
public class ListaUsuarioView extends Composite<VerticalLayout> {

    public ListaUsuarioView() {
        getContent().setWidth("100%");
        getContent().getStyle().set("flex-grow", "1");
    }
}
