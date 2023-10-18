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
	private ImageView imgEncender;

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

	private boolean encendido = false;
	
	/* Cambiará la imagen de la imgEnceder y mostrará la imgLuz */
	@FXML
	void encederApagarLuces(MouseEvent event) {
		if (encendido == true) {
			String ruta = Paths.get(".").toAbsolutePath().normalize().toString()
					+"/resources/img/lucesOff.png";
			File img = new File(ruta);
			imgEncender.setImage(new Image(img.toURI().toString()));
			imgLuz.setVisible(false);
			encendido = false;
			
		} else {
			String ruta = Paths.get(".").toAbsolutePath().normalize().toString()
					+"/resources/img/lucesOn.png";
			File img = new File(ruta);
			imgEncender.setImage(new Image(img.toURI().toString()));
			encendido = true;
			imgLuz.setVisible(true);
		}
		
	}

	@FXML
	void selectBlack(MouseEvent event) {
		selectColor("MidnightBlack");
	}

	@FXML
	void selectEBlue(MouseEvent event) {
		selectColor("ElectricBlue");
	}

	@FXML
	void selectGray(MouseEvent event) {
		selectColor("ThunderGray");
	}

	@FXML
	void selectGrey(MouseEvent event) {
		selectColor("MoonwalkGrey");
	}

	@FXML
	void selectLLBlue(MouseEvent event) {
		selectColor("LapisluxuryBlue");
	}

	@FXML
	void selectOrange(MouseEvent event) {
		selectColor("VolcaninOrange");
	}

	@FXML
	void selectRed(MouseEvent event) {
		selectColor("BlazingRed");
	}

	@FXML
	void selectWhite(MouseEvent event) {
		selectColor("PepperWhite");
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		imgLuz.setVisible(false);
		
	}
	
	/* Cambia el color de la imagen coche */
	private void selectColor(String color) {
		String ruta = Paths.get(".").toAbsolutePath().normalize().toString()
				+"/resources/img/coches/mini"+color+".png";
		File img = new File(ruta);
		imgCoche.setImage(new Image(img.toURI().toString()));
		
	}

}