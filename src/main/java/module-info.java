module com.pn.javafx_application {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.datatransfer;
    requires java.desktop;
//    requires javafx.web;


    opens com.pn.javafx_application to javafx.fxml;
    exports com.pn.javafx_application;
}