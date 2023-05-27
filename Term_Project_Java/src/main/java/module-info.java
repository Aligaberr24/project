module com.example.term_project_java {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.term_project_java to javafx.fxml;
    exports com.example.term_project_java;
}