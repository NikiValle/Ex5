package com.example.ex6;

import javafx.fxml.FXML;
import javafx.scene.control.*;

import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;

public class HelloController {
    Archive a = new Archive();
    Viaggi v;
    String s;
    @FXML
    private TextField dest;
    @FXML
    private TextField dur;
    @FXML
    private TextField cost;
    @FXML
    private CheckBox aR;
    @FXML
    private CheckBox pC;
    @FXML
    private TextField nE;
    @FXML
    private Button insert;
    @FXML
    private CheckBox volo;
    @FXML
    private CheckBox pasti;
    @FXML
    private CheckBox escursioni;
    @FXML
    private TextArea output;
    @FXML
    private Button visualize;
    @FXML
    private Button mediumCosts;
    @FXML
    private Button minMax;
    @FXML
    protected void onInsertButtonClick() {
        if(volo.isSelected())
            v= new Volo(dest.getText(), parseInt((dur.getText())), parseDouble(cost.getText()), aR.isSelected());
        else if(pasti.isSelected())
            v=new Pasti(dest.getText(), parseInt((dur.getText())), parseDouble(cost.getText()), pC.isSelected());
        else
            v= new Escursioni(dest.getText(), parseInt((dur.getText())), parseDouble(cost.getText()), pC.isSelected(), parseInt(nE.getText()));
        a.addViaggi(v);
    }
    @FXML
    protected void onVisualizeButtonClick(){
        s="";
        for(int i=0;i<a.getConta();i++){
            s+=a.getViaggio(i).toString()+"\n";
        }
        output.setText(s);
    }
    @FXML
    protected void onMaximumCostButtonClick(){

    }
}