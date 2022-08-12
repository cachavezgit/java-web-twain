module com.example.testscaner {
    requires javafx.controls;
    requires javafx.fxml;

    requires javafx.base;
    requires javafx.swing;
    requires transitive javafx.graphics;
    requires com.fasterxml.jackson.core;
    requires com.fasterxml.jackson.databind;
    requires transitive WebView;
    requires org.eclipse.jetty.server;
    requires com.google.zxing;
    requires com.google.zxing.javase;
    requires java.desktop;

    opens com.example.testscaner to javafx.fxml;
    exports com.example.testscaner;
}