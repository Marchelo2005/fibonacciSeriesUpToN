module com.example.fibonacciseriesupton {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.fibonacciseriesupton to javafx.fxml;
    exports com.example.fibonacciseriesupton;
}