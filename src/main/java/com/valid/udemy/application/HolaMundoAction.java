/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.valid.udemy.application;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 *
 * @author Johann.medina
 */
public class HolaMundoAction {
	Logger logger = LogManager.getLogger(HolaMundoAction.class);

	private String saludosAtr;

	public String execute() {
		logger.info("ejecutando metodo execute desde struts");
		this.saludosAtr = "Saludos desde Struts2";
		return "exito";
	}

	public String getSaludosAtr() {
		return saludosAtr;
	}

	public void setSaludosAtr(String saludosAtr) {
		this.saludosAtr = saludosAtr;
	}

}
