module com.pn.javafx_application {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.pn.javafx_application to javafx.fxml;
    exports com.pn.javafx_application;
}