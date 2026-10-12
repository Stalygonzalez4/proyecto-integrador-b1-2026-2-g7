package com.example;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.checkbox.Checkbox;
import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.tabs.TabSheet;
import com.vaadin.flow.component.textfield.PasswordField;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("Gestión CRUD - 2 Entidades")
@Route("")
public class MainView extends VerticalLayout {

    public MainView() {
        setSizeFull();
        setPadding(true);
        setSpacing(true);

        H2 titulo = new H2("Gestión de Entidades (CRUD)");

        TabSheet tabSheet = new TabSheet();
        tabSheet.setWidthFull();
        tabSheet.add("Usuarios", crearSeccionUsuarios());

        add(titulo, tabSheet);
    }

    private Component crearSeccionUsuarios() {
        VerticalLayout layout = new VerticalLayout();
        layout.setPadding(false);

        TextField idUsuario = new TextField("ID Usuario");
        idUsuario.setReadOnly(true);

        ComboBox<String> tipoDocumento = new ComboBox<>("Tipo de documento");
        tipoDocumento.setItems("CC", "CE", "TI", "Pasaporte");

        TextField numeroDocumento = new TextField("Número de documento");
        TextField nombres = new TextField("Nombres");
        TextField apellidos = new TextField("Apellidos");
        TextField telefono = new TextField("Teléfono");
        TextField correo = new TextField("Correo");

        PasswordField contrasenaHash = new PasswordField("Contraseña");

        ComboBox<String> rolUsuario = new ComboBox<>("Rol de usuario");
        rolUsuario.setItems(
                "Administrador", "Usuario");

        Checkbox activo = new Checkbox("Usuario activo");
        activo.setValue(true);

        FormLayout form = new FormLayout(
                idUsuario,
                tipoDocumento,
                numeroDocumento,
                nombres,
                apellidos,
                telefono,
                correo,
                contrasenaHash,
                rolUsuario,
                activo);

        Button btnCrear = new Button("Crear", e -> Notification.show(
                "Usuario: " + nombres.getValue()
                        + " " + apellidos.getValue()));
        btnCrear.addThemeVariants(ButtonVariant.LUMO_PRIMARY);

        Button btnConsultar = new Button("Consultar", e -> Notification.show(
                "Consultar usuario: " + idUsuario.getValue()));

        Button btnActualizar = new Button("Actualizar", e -> Notification.show(
                "Actualizar usuario: " + idUsuario.getValue()));

        Button btnEliminar = new Button("Eliminar", e -> Notification.show(
                "Eliminar usuario: " + idUsuario.getValue()));
        btnEliminar.addThemeVariants(ButtonVariant.LUMO_ERROR);

        Button btnLimpiar = new Button("Limpiar", e -> {
            idUsuario.clear();
            tipoDocumento.clear();
            numeroDocumento.clear();
            nombres.clear();
            apellidos.clear();
            telefono.clear();
            correo.clear();
            contrasenaHash.clear();
            rolUsuario.clear();
            activo.setValue(true);
        });

        HorizontalLayout acciones = new HorizontalLayout(
                btnCrear,
                btnConsultar,
                btnActualizar,
                btnEliminar,
                btnLimpiar);
        acciones.getStyle().set("flex-wrap", "wrap");

        Grid<String[]> grid = new Grid<>();

        grid.addColumn(fila -> fila[0])
                .setHeader("ID").setAutoWidth(true);
        grid.addColumn(fila -> fila[1])
                .setHeader("Documento").setAutoWidth(true);
        grid.addColumn(fila -> fila[2])
                .setHeader("Nombres").setAutoWidth(true);
        grid.addColumn(fila -> fila[3])
                .setHeader("Apellidos").setAutoWidth(true);
        grid.addColumn(fila -> fila[4])
                .setHeader("Teléfono").setAutoWidth(true);
        grid.addColumn(fila -> fila[5])
                .setHeader("Correo").setAutoWidth(true);
        grid.addColumn(fila -> fila[6])
                .setHeader("Rol").setAutoWidth(true);
        grid.addColumn(fila -> fila[7])
                .setHeader("Activo").setAutoWidth(true);

        layout.add(form, acciones, grid);

        return layout;
    }
}
