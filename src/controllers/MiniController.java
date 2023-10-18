package controllers;


import java.io.File;
import java.net.URL;
import java.nio.file.Paths;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

public class MiniController implements Initializable {

	@FXML
	private ImageView imgVolumen;

	@FXML
	private ImageView imgBlazingRed;

	@FXML
	private ImageView imgElectricBlue;

	@FXML
	private ImageView imgLapisLuxuryBlue;

	@FXML
	private ImageView imgMidnightBlack;

	@FXML
	private ImageView imgMoowalkGrey;

	@FXML
	private ImageView imgPepperWhite;

	@FXML
	private ImageView imgThunderGray;

	@FXML
	private ImageView imgVolcaninOrange;

	@FXML
	private ImageView imgCoche;

	@FXML
	private ImageView imgLuz;

	@FXML
	void encederApagarLuces(MouseEvent event) {

	}

	@FXML
	void selectBlack(MouseEvent event) {
		selectColor("BlazingRed");
	}

	@FXML
	void selectEBlue(MouseEvent event) {
		selectColor("ElectricBlue");
	}

	@FXML
	void selectGray(MouseEvent event) {
		selectColor("LapisluxuryBlue");
	}

	@FXML
	void selectGrey(MouseEvent event) {
		selectColor("MidnightBlack");
	}

	@FXML
	void selectLLBlue(MouseEvent event) {
		selectColor("MoonwalkGrey");
	}

	@FXML
	void selectOrange(MouseEvent event) {
		selectColor("PepperWhite");
	}

	@FXML
	void selectRed(MouseEvent event) {
		selectColor("ThunderGray");
	}

	@FXML
	void selectWhite(MouseEvent event) {
		selectColor("VolcaninOrange");
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}
	
	private void selectColor(String color) {
		try {
			String ruta = Paths.get(".").toAbsolutePath().normalize().toString()
					+"/resources/img/coches/mini"+color+".png";
			File img = new File(ruta);
			imgCoche.setImage(new Image(img.toURI().toString()));
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}

}