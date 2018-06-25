import { Component } from '@angular/core';
import { Professorat } from './professorat';

@Component({
  selector: 'professorat',
  templateUrl: './professorat.component.html',
  styleUrls: ['./professorat.component.css']
})

export class ProfessoratComponent {
  
  	public titol: string;
	public professors: Array<Professorat>;

	public canviar: boolean;
	public color: string;
	public color_seleccionado: string;

constructor(){

	this.titol = 'PROFESSORAT';

	this.professors = [			
		new Professorat ('Rosa', 'MF0490_3. Gestió de serveis en el sistema informàtic', 90, 8, 'dilluns, dimarts i divendres'),
		new Professorat ('Carles', 'UF1286 - Desarrollo y optimización de componentes software', 100, 10, 'dimecres i dijous')		
		];

	this.canviar = true;	
}

ngOnInit(){

}

canviarProfessor(valor)
{
this.canviar = valor;	
}
  
}