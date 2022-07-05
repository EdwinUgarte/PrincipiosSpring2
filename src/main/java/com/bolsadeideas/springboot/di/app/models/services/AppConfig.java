package com.bolsadeideas.springboot.di.app.models.services;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	
	@Bean("miServicioBean")// Bean nos sirve para crear un componente y hacer el llamado a un metodo de otra clase, es lo mismo que usar @Component directamente en la clase
	public IServicio registrarMiServicio() {
		return new MiServicioComplejo();//Se llama la funcion deseada de otra clase
	}

}
