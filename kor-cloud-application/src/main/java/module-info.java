module ru.gb.kor.korcloudapplication {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires validatorfx;

    opens ru.gb.kor to javafx.fxml;
    exports ru.gb.kor;
    exports ru.gb.kor.controllers;
    opens ru.gb.kor.controllers to javafx.fxml;
}