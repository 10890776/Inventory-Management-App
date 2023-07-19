module com.example.lesleyedinamabotsi {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
            
                            
    opens com.example.albertadzakpa0776 to javafx.fxml;
    exports com.example.albertadzakpa0776;
    exports com.example.albertadzakpa0776.controller;
    opens com.example.albertadzakpa0776.controller to javafx.fxml;
}