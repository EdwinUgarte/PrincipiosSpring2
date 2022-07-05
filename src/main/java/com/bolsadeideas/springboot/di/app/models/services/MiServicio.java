package com.bolsadeideas.springboot.di.app.models.services;

import org.springframework.stereotype.Component;

@Component("miServicioSimple")  /*Creamos un Component de Spring que se puede inyectar en otros componentes, 
es importante que este guardado en la raiz, se le puede dar un identificador entre los parentesis
para dar a conocer que es este el que se esta inyectando*/
public class MiServicio implements IServicio{

	@Override //Sobreescribimos el metodo de la interface
	public String operacion() {
		return "Ejecutando un proceso importante simple...";
	}

}
