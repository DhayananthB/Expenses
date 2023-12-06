module com.example.ride {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;

    opens com.example.ride to javafx.fxml;
    exports com.example.ride;
}