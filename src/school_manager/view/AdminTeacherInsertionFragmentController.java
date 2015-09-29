/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package school_manager.view;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import school_manager.model.Teacher;

/**
 * FXML Controller class
 *
 * @author bepa
 */
public class AdminTeacherInsertionFragmentController implements Initializable {

    
    @FXML
    private TextField tfFname;
    
    @FXML
    private TextField tfLname;
    
    @FXML
    private TextField tfPatronymic;
    
    @FXML
    private TextField tfSubjects;
    
    @FXML
    private TextField tfNotes;
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    @FXML
    public void btnConfirmClicked(){
        String fname = tfFname.getText();
        String lname = tfLname.getText();
        String patronymic = tfPatronymic.getText();
        String subjects = tfSubjects.getText();
        String notes = tfNotes.getText();
        
        Teacher added = new Teacher.Builder()
                .fname(fname)
                .lname(lname)
                .patronymic(patronymic)
                .subjects(subjects)
                .notes(notes)
                .build();
        
    }
    
}