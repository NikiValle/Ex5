module com.example.ex6 {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens com.example.ex6 to javafx.fxml;
    exports com.example.ex6;
}