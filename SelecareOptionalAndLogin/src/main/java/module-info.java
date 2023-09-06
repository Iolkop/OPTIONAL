module com.example.selecareoptionalandlogin {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires java.desktop;
    requires java.mail;


    opens com.example.selecareoptionalandlogin to javafx.fxml;
    exports com.example.selecareoptionalandlogin;
}