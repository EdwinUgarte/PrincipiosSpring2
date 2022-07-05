package com.bolsadeideas.springboot.di.app.models.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


@Primary // Define que proceso de sobreescrito se va a correr por defecto
@Component("miServicioComplejo")  /*Creamos un Component de Spring que se puede inyectar en otros componentes, 
es importante que este guardado en la raiz, se le puede dar un identificador entre los parentesis
para dar a conocer que es este el que se esta inyectando*/
public class MiServicioComplejo implements IServicio{

	@Override //Sobreescribimos el metodo de la interface
	public String operacion() {
		return "Ejecutando un proceso importante complejo...";
	}

}
