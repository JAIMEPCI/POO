package com.example.proyecto;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class Controlador implements Initializable {

    public Controlador() {
        estudiantes = new ArrayList<Estudiante>();
    }
    SpinnerValueFactory<Integer> svf = new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 999999999, 1);
    SpinnerValueFactory<Integer> cal = new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 50, 1);
    private final ArrayList<Estudiante> estudiantes;

    @FXML
    private RadioButton radioOral;
    @FXML
    private RadioButton radioEscrito;
    @FXML
    private Label labelAgregarE;
    @FXML
    private Label labelVerN;
    @FXML
    private Label labelEliminarE;
    @FXML
    private Label labelAgregarExam;
    @FXML
    private Label labelCalTim;
    @FXML
    private Label labelVerID;
    @FXML
    private Label labelBuscarE;
    @FXML
    private Tab tabAgregarX;
    @FXML
    private Tab tabEliminarE;
    @FXML
    private Tab tabEstudianteAprob;
    @FXML
    private Tab tabBuscarE;
    @FXML
    private Tab tabVerE;
    @FXML
    private Button botonAgregarE;
    @FXML
    private Button botonAgregarExam;
    @FXML
    private Spinner<Integer> idEstudianteAgregar;
    @FXML
    private Spinner<Integer> idEstudianteEliminar;
    @FXML
    private Spinner<Integer> idEstudianteBuscar;
    @FXML
    private Spinner<Integer> idEstudianteExam;
    @FXML
    private Spinner<Integer> calificacionExam;
    @FXML
    private TextField nombreEstudianteAgregar;
    @FXML
    private TextField nombreExam;
    @FXML
    private DatePicker fechaExam;


    @FXML
    protected void agregarEstudiante() {
        if(!existeCodigoA()) {
            Estudiante e = new Estudiante(nombreEstudianteAgregar.getText(), idEstudianteAgregar.getValue());
            estudiantes.add(e);
            tabDisabledE();
            labelAgregarE.setText("Estudiante subido a la base de datos!");

        }else{
            labelAgregarE.setText("ya existe un estudiante con este codigo");
        }
    }
    @FXML
    public void verTodosNEstudiantes(){
        StringBuilder a= new StringBuilder();
        for (Estudiante i : estudiantes) {
            a.append(i.nToString()).append("\n");
        }
        labelVerN.setText(a.toString());
    }
    public void verTodosIDEstudiantes(){
        StringBuilder a= new StringBuilder();
        for (Estudiante i : estudiantes) {
            a.append(i.iDtoString()).append("\n");
        }
        labelVerID.setText(a.toString());
    }
    public void verEstudiantes(){
        verTodosIDEstudiantes();
        verTodosNEstudiantes();
    }
    public void nEstudiantesAprobados(){
        StringBuilder a= new StringBuilder();
        for (Estudiante i : estudiantes) {
            if(i.aprobo()){
                a.append(i.iDtoString()).append("\n");
            }
        }
        labelVerID.setText(a.toString());
    }
    public void iDEstudiantesAprobados(){
        StringBuilder a= new StringBuilder();
        for (Estudiante i : estudiantes) {
            if(i.aprobo()){
                a.append(i.iDtoString()).append("\n");
            }
        }
        labelVerID.setText(a.toString());
    }
    public void verEstudiantesAprobados(){
        nEstudiantesAprobados();
        iDEstudiantesAprobados();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        idEstudianteEliminar.setValueFactory(svf);
        idEstudianteAgregar.setValueFactory(svf);
        idEstudianteBuscar.setValueFactory(svf);
        idEstudianteExam.setValueFactory(svf);
        calificacionExam.setValueFactory(svf);
    }

    private boolean existeCodigoA(){
        for (Estudiante i : estudiantes) {
            if(i.getId()== idEstudianteAgregar.getValue()){
                return true;
            }
        }
        return false;
    }
    private boolean existeCodigoB(){
        for (Estudiante i : estudiantes) {
            if(i.getId()== idEstudianteBuscar.getValue()){
                return true;
            }
        }
        return false;
    }
    private boolean existeCodigoE(){
        for (Estudiante i : estudiantes) {
            if(i.getId()== idEstudianteEliminar.getValue()){
                return true;
            }
        }
        return false;
    }
    private boolean existeCodigoC(){
        for (Estudiante i : estudiantes) {
            if(i.getId()== idEstudianteExam.getValue()){
                return true;
            }
        }
        return false;
    }

    public void butonDisabled(){
        if(nombreEstudianteAgregar.getLength()<=0){
            botonAgregarE.setDisable(true);
            labelAgregarE.setText("Ponga un nombre para agregar un estudiante");

        }else{
            botonAgregarE.setDisable(false);
            labelAgregarE.setText("");
        }
    }
    public void butonExamDisabled(){
        if(nombreExam.getLength()>0 && fechaExam.getValue()!=null && calificacionExam.getValue()!=null){
            botonAgregarExam.setDisable(false);
            labelAgregarExam.setText("Examen agregado exitosamente");
        }else{
            botonAgregarExam.setDisable(true);
            labelAgregarExam.setText("Rellene todos los campos porfavor");
        }

    }
    private void tabDisabledE(){
        tabVerE.setDisable(estudiantes.isEmpty());
        tabAgregarX.setDisable(estudiantes.isEmpty());
        tabBuscarE.setDisable(estudiantes.isEmpty());
        tabEstudianteAprob.setDisable(estudiantes.isEmpty());
        tabEliminarE.setDisable(estudiantes.isEmpty());
    }

    public void eliminarEstudiante(){
        int a=0;
        if (existeCodigoE()) {
            for (Estudiante i : estudiantes) {
                if (i.getId() == idEstudianteEliminar.getValue()) {
                    estudiantes.remove(i);
                    labelEliminarE.setText("Se eliminó el estudiante");
                    a=1;
                    break;
                }
            }

        }
        if(a==0) {
            labelEliminarE.setText("No se ha encontrado un estudiante con esta id");
        }
    }

    public void buscarEstudiante() {
        int a=0;
        if (existeCodigoB()) {
            for (Estudiante i : estudiantes) {
                if (i.getId() == idEstudianteBuscar.getValue()) {
                    StringBuilder b = new StringBuilder();
                    labelBuscarE.setText("Se encontró el estudiante:\nNombre: '"+ i.getNombre()+"' ID: "+i.getId());
                    a=1;
                    break;
                }
            }
        }
        if(a==0) {
            labelBuscarE.setText("no se encontro un estudiante con este id");
        }
    }

    public void agregarExamenOral(){
        int a=0;
        if (existeCodigoC()) {
            for (Estudiante i : estudiantes) {
                if (i.getId() == idEstudianteExam.getValue()) {
                    i.agregaarExamenOral(nombreExam.getText(),fechaExam.toString(),calificacionExam.getValue());
                    labelAgregarExam.setText("se encontro un estudiante y creo el examen oral");
                    a=1;
                    break;
                }
            }
        }
        if(a==0) {
            labelAgregarExam.setText("no se encontro un estudiante para crear el examen");
        }
    }
    public void agregarExamenEscrito(){
        int a=0;
        if (existeCodigoC()) {
            for (Estudiante i : estudiantes) {
                if (i.getId() == idEstudianteExam.getValue()) {
                    i.agregaarExamenEscrito(nombreExam.getText(),fechaExam.toString(),calificacionExam.getValue());
                    labelAgregarExam.setText("se encontro un estudiante y creo el examen escrito");
                    a=1;
                    break;
                }
            }
        }
        if(a==0) {
            labelAgregarExam.setText("no se encontro un estudiante para crear el examen");
        }
    }
    public void agregarExam(){
        if(tipoExam()){
            agregarExamenOral();
        }
        if(!tipoExam()){
            agregarExamenEscrito();
        }
    }
    public boolean tipoExam(){
        if (radioOral.isSelected()){
            labelCalTim.setText("Tiempo empleado:");
            calificacionExam.setValueFactory(svf);
            return true;
        }
        labelCalTim.setText("Calificación:");
        calificacionExam.setValueFactory(cal);
        return false;
    }


}